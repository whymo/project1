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
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Arrays;

import lombok.extern.log4j.Log4j2;

//# 클라이언트(소켓 클라이언트) 만들기
@Log4j2
public class SingleThreadSocketClientk {
	
	// 키보드의 엔터키를 눌렀을 때에 발생하는 키코드 2개를 상수로 선언
	// Max/Linux/ .. 등 다른 운영체제에서는, LF만 발생
	private static final int CR = 13;
	private static final int LF = 10;
	
	public static void main(String[] args)
		throws UnknownHostException, IOException {
		
		log.debug("main({}) invoked.", Arrays.toString(args));
		
//		-------------------------------------------
		
		String serverAddress = "localhost";		// loopback Address (127.0.0.1)'s domain name
//		String serverAddress = "111.222.333.444";	// 예외 연습 : java.net.UnknownHostException:
		
		int serverPort = 7777;
		int connectTimeout = 1000;				// milliseconds -> 1초
		
//		-------------------------------------------
		// 1st method : Socket 객체 생성시, 바로 서버로 연결시도
//		-------------------------------------------

//		Socket socket = new Socket(serverAddress, serverPort);		// 소켓 객체를 생성 자체가 연결을 시도하는 것이다.
//		Socket socket = new Socket(InetAddress.getByName(serverAddress), serverPort);

//		log.info("1. socket : {}", socket);
		
//		-------------------------------------------
		// 2st method : Socket 객체 생성시, 서버로 연결시도를 분리수행
//		-------------------------------------------
		
		Socket sock = new Socket();
		
		// 왜 포트번호까지 있는 InetSocketAddress 객체를 달라고 함?
		// -> 클라이언트 입장에서 보면 서버에 연결하려면 ip주소와  7777포트로 현재 구동(리스닝)중인
		//서버까지 도달하려면 소켓 어드레스를 달라! 알아야 찾아가니까!
//		sock.connect(new InetSocketAddress(serverAddress,serverPort));
		
		// # connectTimeout 설정
		// 왜 실무는 이걸 사용?
		// connect : 1분 12초 지나야 예외 발생 -> 웹에서 누가 1분 12초를 기다림
		//  때문에 개발자는 반드시 타임아웃을 사용해야함!
		// timeout the timeout value to be used in milliseconds.
		sock.connect(new InetSocketAddress(serverAddress,serverPort), connectTimeout);
		
		// 서버를 죽이고 실행하면 -> 바로 예외가 떨어짐! ->  java.net.ConnectException: Connection refused: no further information
		// connectTimeout 먹힐때는 네트워크 상황이 불안정할때 생긴다!!

		log.info("1. sock : {}", sock);
		
//		----------------------------------------------------------------

		log.info("\t1-1. getLocalSocketAddress : {}", sock.getLocalSocketAddress());
		log.info("\t1-2. getRemoteSocketAddress : {}", sock.getRemoteSocketAddress());

		
//		----------------------------------------------------------------
//		SENT : 보내는 기능
//		----------------------------------------------------------------
	
		try(sock) {
			
			try {
				String sendLine = "Hello, World!!!";
				
				// 소켓 객체에서, 데이터를 보내고, 받을 수 있는 InputStream/OutputStream 객체를 얻어낼 수 있음!
//				InputStream is = sock.getInputStream(); 	// -> 먼저 얻어도 상관없지만, 지금 쓰지 않으니까 주석
				OutputStream os = sock.getOutputStream();	// ** 핵심 getOutputStream 얻어내고
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));	// 문자기반의 바이트스트림 필요하다 , BufferedWriter 보조스트림 적용하고
														// OutputStreamWriter 2번째 보조스트림도 사용
				
				bw.write(sendLine);			// block I/O	=> 내가 읽을 데이터가 스트림에 있을때까지 
				
				// enter 키 코드값 전송
				// 왜 필요함? 엔터키 쳐야 리드가 움직임, 스캐너도 엔터를 쳐야 리드가 움직임
				bw.write(CR);	// 	상수로 만든 CR / 사용자가 마치 엔터키 친 것 처럼 
				bw.write(LF);	
				
				bw.flush();			
				
				log.info("2.sendLine : {}", sendLine);
			} catch(Exception e) {				// 만약 예외가 발생한다면
				log.error(" *Exception : {} - {}",e.getClass().getName(), e.getMessage()); // 이 예외객체의 타입명, 메세지를 찍어라! / at 필요없다!
			} finally {
//				sock.shutdownOutput();	// 왜 넣음? 소켓은 양방향이지만, 인풋, 아웃품 스트림으로 단방향으로 해야함
//											소켓은 셧다운 시킬 수 있다. : 읽을수만 있는 소켓이 되어버림
//											소켓의 출력 기능만 close 하겠다!!
//				sock.shutdownInput();	// 소켓의 입력 기능만 close 하겠다!!
//				==> 이런게 있다는걸 알려주기 위해 주석처리!
			} // try-catch-finally
			
//		} // try-with-resources

//		----------------------------------------------------------------
//		RECV : 받을 준비
//		----------------------------------------------------------------
		
		try {
			
			InputStream is = sock.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			
			String recvLine = br.readLine(); 		// 블로킹 => 얘가 enter키가 필요함!
			
			log.info("3. recvLine : {}", recvLine);
			
			} catch(Exception e) {
				
				log.error(" *Exception : {} - {}",e.getClass().getName(), e.getMessage());
			} finally {
	//			sock.shutdownInput();
				
			} // try-catch-finally

		} // try-with-resources
	
		log.info("4. Disconnected");

	} // main
		
} // end class
