//2022.04.07

package ioio.exam01_inetaddress;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;

import lombok.extern.log4j.Log4j2;


@Log4j2
public class SingleThreadSocketServerk {
	
	// 키보드의 엔터키를 눌렀을 때에 발생하는 키코드 2개를 상수로 선언
	private static final int CR = 13;
	private static final int LF = 10;
	
	public static void main(String[] args) 
			throws IOException, InterruptedException {

		log.debug("main({}) invoked.", Arrays.toString(args));
		
		//=> 출력 : 15:15:23.222 DEBUG --- [main           ] t.S06_ServerSocket.main - main([]) invoked.
		//----------------------------------------------------------
		
		int listenPort = 7777;		// 서버의 listenPort 번호 =>  포트번호 공유 안된다
		int backLog = 100;			// serverSocket의 backLog Q size
		
		//----------------------------------------------------------
		
		// 1. 클라이언트의 연결요청을 특정 포트로 받아서, 연결을 수락하고
		// 그 결과로 Socket 객체까지 만들어 내는데 핵심역할을 하는 객체 생성
		ServerSocket serverSocket = new ServerSocket();
		log.info("1.serverSocket {} ", serverSocket);
	
		
		//----------------------------------------------------------

		// 지정된 바인딩 포트번호(7777)로, 포트바인딩 하는 ServerSocket 생성
		serverSocket.bind(new InetSocketAddress(listenPort));
		log.info("1.serverSocket {} ", serverSocket);
		
		//----------------------------------------------------------

		
		try(serverSocket;) {	// serverSocket 자동으로 닫도록 하고...
			
			while(true) {		// 무한루프 왜? 서버의 역할은 지속적으로 새로운 연결을 받고, Socket을 생성해야할 역할을 수행하기 위해
			
			log.info("------------------------------------------------------------------------------------------");
			log.info("2. Server listening on port {} and addr {} ... ", listenPort, serverSocket.getInetAddress());
			log.info("------------------------------------------------------------------------------------------");

			// setSoTimeout 메소드의 수행은, accept 메소드 수행전에 먼저 적용해야함
			// 즉, serverSocket에 설정을 추가하는 것임 : 어떤 설정? 연결요청을 얼마나 기다릴 것인가 설정!
			serverSocket.setSoTimeout(0);		//  infinitely wait for incomming connecrion.
				
			
			// 만일 새로운 연결요청ㅇ이 들어오면, 수락하고, 새로운 Socket 객체 생성
			// 즉 c-s 간에 새로운 연결 (=비유 : 터널)을 생성
			Socket sock = serverSocket.accept();		// 블록 걸림
	
			// 연결된 새로운 클라이언트에 대한 정보를 몇가지 출력해보자!!
			log.info("3. Client connected");		
			log.info("\t3-1. sock : {}", sock);
			log.info("\t3-2. getLocalSocketAddress : {}", sock.getLocalSocketAddress());
			log.info("\t3-2. getRemoteSocketAddress : {}", sock.getRemoteSocketAddress());
					
			//----------------------------------------------------------

//		----------------------------------------------------------------
//		RECV : 받을 준비
//		----------------------------------------------------------------
		
			String recvLine = null;
			String sendLine = null;
		
				try (sock;) {
					
					try {
						InputStream is = sock.getInputStream();
						BufferedReader br = new BufferedReader(new InputStreamReader(is));
						
						recvLine = br.readLine(); 		// 블록 // => 얘가 enter키가 필요함!
						log.info("\t3-4. recvLine : {}", recvLine);
						
					} catch(Exception e) {
						
						log.error(", ", e.getClass().getName(), e.getMessage());
					} finally {
//						sock.shutdownInput();
					} // try-catch-finally
	
				} // try-with-resources
				
				
//				----------------------------------------------------------------
//				SENT : 보내는 기능
//				----------------------------------------------------------------
				
				try {
					sendLine = recvLine;
					
					OutputStream os = sock.getOutputStream();
					BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));
					
					bw.write(sendLine);		// 블록
					
//					# 엔터키
					bw.write(CR);	
					bw.write(LF);
					
					bw.flush();	
					
					log.info("\t3-5. sendLine : {}", sendLine);
					
				} catch(Exception e) {
					
					log.error("\t* Exception : {} - {}",e.getClass().getName(), e.getMessage());
				} finally {
//					sock.shutdownInput();
				} // try-catch-finally

				log.info("4. Disconnected");
				
			} // while
		
		} // try-with-resources
		
	} // main
	
		
} // end class
