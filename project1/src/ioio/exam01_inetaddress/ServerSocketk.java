// 2022.04.06 // 2022.04.07

package ioio.exam01_inetaddress;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;

import lombok.extern.log4j.Log4j2;

// # 진짜 통신은 하지 않고 서버소켓에서 소켓 만들어주는 것 까지!

@Log4j2
public class ServerSocketk  {
	
	public static void main(String[] args) 
					throws IOException, InterruptedException {
		
		log.debug("main({}) invoked.", Arrays.toString(args));
		
//		=> 출력 : 15:15:23.222 DEBUG --- [main           ] t.S06_ServerSocket.main - main([]) invoked.
//		----------------------------------------------------------
		
		int listenPort = 7777;
		int backLog = 100;			// 연결요청Q
		
//		----------------------------------------------------------
		
		// 1. 클라이언트의 연결요청을 특정 포트로 받아서, 연결을 수락하고
		// 그 결과로 Socket 객체까지 만들어 내는데 핵심역할을 하는 객체 생성
		ServerSocket serverSocket = new ServerSocket();
		
//		log.info("1.serverSocket {} ", serverSocket);
//		=> 1.serverSocket ServerSocket[unbound] 
		
//		----------------------------------------------------------
		// bind()가 뭐임??
		// 특정 포트로 바인딩 시킨다, 무슨 포트로 리스닝 할거냐? 가 중요!
		// InetSocketAddress => InetAddress : 호스트네임 + ip주소, InetSocketAddress : InetAddress + 포트번호
		
		// 2. 서버가 특정 포트로 Listen  할 수 있도록, Port Binding 수행
		// 현업에서는 이걸 사용!!
		serverSocket.bind(new InetSocketAddress(listenPort));	// 포트가 만들어짐 
//		=>[addr=0.0.0.0/0.0.0.0,localport=7777] 
		log.info("1.serverSocket {} ", serverSocket);
		
		// # getLocalHost 
		// 내가 서버역할을 할 1개 이상의 ip 주소를 가지고있을때 특정 ip 주소로만 listen 할 수 있도록 ip 주소를 정하겠다
		// 하드코딩 안하도록!
//		serverSocket.bind(new InetSocketAddress(InetAddress.getLocalHost(), listenPort));
//		=> addr=LAPTOP-TNECVEBR/172.30.1.48,localport=7777] / 특정 ip : 172.30.1.48

		
		// # backLog
		// 기본값은 100, backLog란 연결요청Q 이다!
		// 들어 온 순서대로 나간다! 연결 요청이 쌓이는걸 백로그! 연결요청을 임시동안 저장하는 자료구조를 백로그라고하며
		// 기본 사이즈가 100이다!, 100 이상으로 연결요청이 더 쌓이면 연결 요청을 해도 무한히 기다린다
		// 현업에서는 이걸 사용!!
//		serverSocket.bind(new InetSocketAddress(InetAddress.getLocalHost(), listenPort), backLog);
//		=> [addr=LAPTOP-TNECVEBR/172.30.1.48,localport=7777] 
	
		
		// 특정호수 하나로만 지정하겠다! 
//		serverSocket.bind(new InetSocketAddress("0.0.0.0", listenPort), backLog);
//		=>[addr=/0.0.0.0,localport=7777] 

//		log.info("2.serverSocket {} ", serverSocket);
		
//	===================================================================================================
		
//		# 위의 2가지 방법을 한번에 할 수 있는 방법!
		
//		ServerSocket serverSocket = new ServerSocket(listenPort);
//		log.info("serverSocket {} ", serverSocket);
//		=> serverSocket ServerSocket[addr=0.0.0.0/0.0.0.0,localport=7777] 
		
		// 이를 통해서 클라이언트와 서버가 가지고 있는 IP주소와 포트번호를 알 수 있다.
		// 0.0.0.0는 IP주소로 ANY 어디에서나 접속할 수 있다는 의미이다.
	
//		------------------------------------------------------------

//		ServerSocket serverSocket = new ServerSocket(listenPort, backLog);
//		log.info("serverSocket {} ", serverSocket);
//		=> serverSocket ServerSocket[addr=0.0.0.0/0.0.0.0,localport=7777] 
	
//		------------------------------------------------------------
		
//		ServerSocket serverSocket = new ServerSocket(listenPort, backLog, InetAddress.getLocalHost());
//		log.info("serverSocket {} ", serverSocket);
//		=>[addr=LAPTOP-TNECVEBR/172.30.1.48,localport=7777] 
//		=> 모든 ip 주소에 대해서 기다리는게 기본이다! -> 보통 이렇게 서버를 만들지는 않는다! 0.0.0.0으로 해주는게 원칙이다!

		
//		===================================================================================================
//		# 여러개의 자원객체를 사용할때는 @clean up 사용 애매 닫는 순서를 정할 수 없기 때문에
		
//		-----------------------------------------------
//		Thread.sleep(1000*60); // 60초 동안 실행을 멈춰라!(blocking)
//		-----------------------------------------------
		
		try(serverSocket;) {
			log.info("2. Server listening on port {} and addr {} ... ", listenPort, serverSocket.getInetAddress());
			
			while(true) {		// 무한루프
				Socket socket = serverSocket.accept();		// 블록 걸림
//				=>  Server listening on port 7777 에서 기다리고있다!
				
//				-----------------------------------------------
//				Thread.sleep(1000*60); // 터널 뚫린 후 60초 동안 실행을 멈춰라!(blocking)
//				-----------------------------------------------

				try(socket;) {
					log.info("3. socket : {}", socket);		
					log.info("\t + getInetAddress : {}, getport : {}, getLocalPort : {}", 	
							socket.getInetAddress(), socket.getPort(), socket.getLocalPort());
					
					log.info("\t + getRemoteSocketAddress : {}", socket.getRemoteSocketAddress());	// 상대방 IP, HOSTPORT 다 얻어낼 수 있다
					
				} // try-with-resources // 위에 주소들 찍고 닫게 만듬
				
			} // while
			
		} // try-with-resources
		
//		==> 받을준비는 안된 코드 : 상대방한테 메세지를 보내면 어떤 예외가 발생할까?? 			
//									예외가 발생할 줄 알았는데 양쪽이 다 안난다! 
//									소켓 연결을 하고 바로 닫아버린다! 클라이언트는 보냈는데 서버는 닫아버린다!
		
//		# telnet 127.0.0.1 7777 찍어보기!!
		
//		=> 3. socket : Socket[addr=/127.0.0.1,port=55532,localport=7777]
		
//		10:06:35.818  INFO --- [main           ] 
//		i.e.ServerSocketk.main - 	 + getInetAddress : /127.0.0.1, getport : 55532, getLocalPort : 7777
//		-> 5만번대가 할당됨
		
//		10:06:35.818  INFO --- [main           ]
//		i.e.ServerSocketk.main - 	 + getRemoteSocketAddress : /127.0.0.1:55532 
//		=> 소켓 어드레스 객체
		
//		-- 계속 찍어보면 연결되고 끊어질때마다 포트번호가 증가함!--
//		사용자가 빨리 들어오면 그만큼 속도도 늘어감!

	} // main
	
				
} // end class
