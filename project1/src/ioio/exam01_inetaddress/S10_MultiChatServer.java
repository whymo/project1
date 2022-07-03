//2022.04.08 

package ioio.exam01_inetaddress;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import lombok.extern.log4j.Log4j2;

//# 채팅서버 구현!!

@Log4j2
public class S10_MultiChatServer {
	
	
	private static final int port=7777;
	
//	private static final Charset charset = StandardCharsets.UTF_8;		// XX
//	private static final Charset charset = Charset.defaultCharset();	// XX	
	
	
//	private static final Charset charset = Charset.forName("MS949");	// OK
	private static final Charset charset = Charset.forName("UTF-8");	// OK

	// MultiCast 기반의 채팅을 구현하기 위해서는
	// 서버의 역할은 오로지 "중개"역할을 잘 해주면 됨...
	// 이 서버에 연결된 클라이언트들 끼리, 보내고/ 받는 메세지 처리만 중앙에서
	// 잘 처리해 주면 되는 것임. 그래서, 서버에 연결된 모든 클라이언트 정보를 담을
	// 컬렉션이 필요하고, 이 컬렉션을 Map<k,V>으로 하기로 함.
	private static Map<String, Socket> clients;
	
	
	
	public S10_MultiChatServer() {
		log.trace("Default constructor invoked.");
		
		// 왜 해쉬테이블 안씀? 이런게 있다는걸 알려드리려고!
		clients = new HashMap<>();			// HashMap 객체 생성
		// HashMap은 멀티쓰레드 환경에서 Thread-Unsafe 하기 때문에, 이를
		// 다시 Thread-Unsafe  하게 조작할 수 있도록 만들어줘야 하며, 이를 해주는 것이 바로 아래의 제네릭 정적 메소드임
		clients = Collections.<String, Socket> synchronizedMap(clients);
		
		log.debug("Synchronized client list created. type: {}", clients.getClass().getName());
	} // Default Constructor 생성자
	
	
	private void start () { 
		log.trace("start() invoked.");
		
		try (ServerSocket serverSock = new ServerSocket(port)) {
			log.debug("Server started.");
			
			while(true) {
				
				log.debug("Listening on {} .....", serverSock);
				Socket sock = serverSock.accept();
				log.debug("Client Connected From {}", sock);
				
//				---
				
				// 별도의 쓰레드로, 다수의 클라이언트가 보낸 메세지를 수신할 수 있는
				// task를 처리하도록 함.
				ServerReceiver receiver = new ServerReceiver(sock);		// worker 쓰레드 객체 생성
				receiver.start();										// worker 쓰레드  시작
				
			} // while
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			log.info("Server finished.");
		} // try-with-resources
	} // start

	// # 중첩 클래스 : 가능하면 이렇게 하지 말라. 하지만 꼭 필요할때가 있다
	@Log4j2
	static class ServerReceiver extends Thread {
		final Socket sock;
		final String clientKey;
		
		
		ServerReceiver(Socket sock) {
			log.trace("Constructor({}) invoked.", sock);
			
			this.sock = sock;
			this.clientKey = sock.getRemoteSocketAddress().toString();
			
			clients.put(this.clientKey, sock);
			log.debug("clients: {}", clients);
			
			try {
				String WELCOME = String.format("<<< Client Key: %s Entered. Welcome !!!", this.clientKey);
				
				// 현재 연결된 모든 클라이언트에게 동일 메세지를 전송해주는 메소드 호출
				publish("SERVER", WELCOME, true);
			} catch (IOException e) {
//				e.printStackTrace();
				
				// 통신(입/출력)에 문제가 발생한 클라이언트는 Map에서 삭제처리
				clients.remove(this.clientKey);
				log.debug("clients: {}", clients);
				
				try {
					String BYE = String.format(">>> Client Key: %s Exited. Bye !!!", this.clientKey);
					
					// 현재 연결된 모든 클라이언트에게 동일 메세지를 전송해주는 메소드 호출
					publish("SERVER", BYE, true);
				} catch (IOException e1) {;;}
			} // try-finally
		} // Constructor
		
		
		@Override
		public void run() {
			log.trace("run() invoked.");
			
			try (this.sock) {
				
				InputStream is = this.sock.getInputStream();
				
				// 이 보조스트림은 기본 스트림에 연결해서 쓰는 보조스트림이 아니라,
				// jvm 메모리에 바이트 데이터를 축적하기 위해서 사용하는 보조스트림임. (마치 금고처럼..)
				ByteArrayOutputStream baos = new ByteArrayOutputStream();
				
				try (is; baos;) {
					
//					----------------------------
//					1. RECEIVE MESSAGES FROM ALL CLIENTS
//					----------------------------
					
					int CR=13, LF=10;
					
					int ch;
					String RECV = null;
					
					while((ch = is.read()) != -1) {
						
//						log.info("ch: {}", ch);
						
						if(ch != CR && ch != LF) {
							baos.write(ch);
						} else {
							
//							log.info("\t+ excluded: {}", ch);
							
							if(ch == LF) {
								
								RECV = baos.toString(charset);
//								log.info("RECV: {}", RECV);
								log.info("RECV from {}: {}", this.clientKey, RECV);
								
								baos.reset();
								
//								----------------------------
//								2. PUBLISH MESSAGES TO ALL CLIENTS
//								----------------------------
								publish(this.sock.getRemoteSocketAddress().toString(), RECV, false);
								
							} // if
							
						} // if-else
						
					} // while : is.read() != 1
					
				} // try-with-resources : is, baos
				
			} catch(IOException e) {
//				e.printStackTrace();
			} finally {
				log.info("Client {} Disconnected", this.sock);
				
				clients.remove(this.clientKey, this.sock);
				log.debug("clients: {}", clients);
				
				try {
					String BYE = String.format(">>> Client Key: %s Exited. Bye !!!", this.clientKey);
					publish("SERVER", BYE, true);
				} catch (IOException e1) {;;}
			} // try-with-resources : this.sock
			
		} // run
		
	} // end class
	
	
	private static void publish(String fromKey, String message, boolean toSelf) throws IOException {
		log.trace("publish({}, {}) invoked.", fromKey, message);
		
		Set<String> keys = clients.keySet();
		
		for(String key : keys) {
			
			log.debug("publish to the client key: {}", key);
			
			if(!key.equals(fromKey) || toSelf) {
					
				int CR=13, LF=10;

				Socket sock = clients.get(key);
				OutputStream os = sock.getOutputStream();
				
				os.write((fromKey+": "+message).getBytes(charset));
				os.write(CR);
				os.write(LF);
				
				os.flush();
				
//				log.info("SENT: {}", message);
				log.info("SENT from {}: {}", fromKey, message);
				
			} else {
				log.debug("Excluding client itself key: {} to publish.", fromKey);
			} // if-else
			
		} // enhanced for
		
	} // publish
	

	public static void main(String[] args) {
		log.trace("main({}) invoked", Arrays.toString(args));
		
//		Charset.availableCharsets().forEach((key, cs) -> {
//			log.debug("{}", key);
//		});

		new S10_MultiChatServer().start();
	} // main

} // end class
