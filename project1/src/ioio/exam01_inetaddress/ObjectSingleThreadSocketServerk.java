//2022.04.07 // 2022.04.08

package ioio.exam01_inetaddress;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;

import lombok.extern.log4j.Log4j2;


@Log4j2
public class ObjectSingleThreadSocketServerk {
	
	
	// ObjectInput/OutputStream 보조스트림을 이용한 통신 구현 예제(서버)
	public static void main(String[] args) 
			throws IOException {

		log.debug("main({}) invoked.", Arrays.toString(args));

		
		int listenPort = 7777;		// 서버의 listenPort 번호 =>  포트번호 공유 안된다
		int backLog = 100;			// serverSocket의 backLog Q size
		
		//----------------------------------------------------------

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
			log.info("2. Server listening on port {}  ... ", serverSocket.getLocalSocketAddress());
			log.info("------------------------------------------------------------------------------------------");

			// 만일 새로운 연결요청이 들어오면, 수락하고, 새로운 Socket 객체 생성
			// 즉 c-s 간에 새로운 연결 (=비유 : 터널)을 생성
			// 서버는 지속적으로 연결요청이 들어오면 받아야하고, 365일 내내 받아야하기때문에,
			Socket socket = serverSocket.accept();		// 블록 걸림
	
	
			log.info("3. Client connected from address : {}", socket.getRemoteSocketAddress());
					

//		----------------------------------------------------------------
//		RECV : 받을 준비
//		----------------------------------------------------------------
		
				try (socket) {
					
					
						InputStream is = socket.getInputStream();
						
						
						// 객체의 직렬화/역직렬화를 이용한 입력/출력을 위해,
						// object 기반의 풀력 보조스트림 생성
						ObjectInputStream ois = new ObjectInputStream(is);
						
						// 객체를 읽어드림(이때, readObject 메소드의 리턴타입은 'object'임
						// 따라서, 리턴값이 다형성-1에 의해서 조상품에 안겨서 반환되기 때문에,
						// 실제 객체의 역직렬화를 통해서 받은, 객체를 강제형변환시켜, 부모품에서 빼내야함
						Member member = (Member) ois.readObject();
						log.info("4. received a member from client : {}", member);
						
//		----------------------------------------------------------------
//		sent : 보낼 준비
//		----------------------------------------------------------------			
						
						OutputStream os = socket.getOutputStream();
						
						
						// 객체의 직렬화/역직렬화를 이용한 입력/출력을 위해,
						// object 기반의 풀력 보조스트림 생성
						ObjectOutputStream oos = new ObjectOutputStream(os);
						
						
						// 받은걸 한번 더 수정해서 보내자
						member.setId(2);
						member.setName("Trinity");
						member.setAge(33);
						
						oos.writeObject(member);	// 전송
						oos.flush();
						
						log.info("5. Sended a modified member to client : {}", member);
						
					} catch(ClassNotFoundException | IOException e) {
						
						e.printStackTrace();
						
					} // try-with-resources : socket
	
			} // while
			
		} // try-with-resources : serverSocket
		
	} // main
	
		
} // end class
