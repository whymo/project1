// 2022.04.11

package networkingg;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Scanner;

import lombok.extern.log4j.Log4j2;


@Log4j2
public class S10_MultiChatClient {
	
	// 채팅서버의 연결정보 선언
	private static final String host = "localhost";	// loopback address
	private static final int port = 7777;

	
	public static void main(String[] args) throws IOException, InterruptedException {	// 이건 나중에 코드하다보면 처리하라고 나옴
		log.trace("main({}) invoked.", Arrays.toString(args));
		
		try (Socket sock = new Socket(host, port)) { // 채팅서버 연결
			log.info("Connected to the server addr: {}, port: {}", host, port); 

			Thread R = new Receiver(sock.getInputStream()); // 메세지 수신 쓰레드 생성 및 시작
			R.start(); 
			
			Thread S = new Sender(sock.getOutputStream()); // 메세지 송신 쓰레드 생성 및 시작
			S.start();
			
//			------------------------
			
			R.join();	// R 쓰레드가 종료될때까지 기다림
			S.join();  	// S 쓰레드가 종료될때까지 기다림
		} finally {
			log.info("Disconnected.");
		} // try-with-resources
		
	} // main
	
//	메소드 블록 안에서 선언된 클래스를 "로컬(지역)  class"라고 한다! //	메소드 안에 선언된 변수 : 지역변수
	
	
//	--------------------------
	// 중첩 클래스
	// "멤버클래스" 라고 부른다! -> 캡슐화가 가능하다  -> 접근제한자 붙일 수 있음(여기서는 default) -> static은 왜 붙임?
	//	메인 메소드에 쓰려고! (정적 멤버는 정적멤버만 사용 가능하다!) -> 그래서 안붙이면 인스턴스 멤버가 되기 때문에 오류남
	// 이 클래스와 밀접한 관계가 있고, 이 클래스 블록 안에서만 사용된다!
	static class Sender extends Thread {
		private final OutputStream os;

		
		Sender(OutputStream os) {
			log.trace("constructor({}) invoked.", os);

			this.os = os;
		} // constructor
		
		@Override
		public void run() {
			log.trace("run() invoked.");
			
			Scanner scanner = new Scanner(System.in); // 스캐너 객체 생성
			
			try (this.os; scanner;) {	// 스캐너부터 닫고, 그 다음 os
				log.debug("Sender started.");

				int CR=13, LF=10;
				
				String line = null;
				while((line=scanner.nextLine()) != null) {	// 스캐너에서는 null => EOF
//					log.info("line: {}", line);
					
					String message = line.trim();
					os.write(message.getBytes("UTF-8"));
					
					// Sent CRLF (***) : 메세지의 끝임을 나타내는 경계로 정함
					os.write(CR);
					os.write(LF);
					
					os.flush();
					
//					log.info("SENT: {}", message);
					log.info(message);
				} // while
				
			} catch(IOException | IllegalStateException | NoSuchElementException e) {
				e.printStackTrace();
			} finally {
				log.debug("Sender stopped.");
			} // try-with-resources

		} // run

	} // end class : Sender
	
//	--------------------------
	
	static class Receiver extends Thread {
		private final InputStream is;

		
		Receiver(InputStream is) {
			log.trace("constructor({}) invoked.", is);
			
			this.is = is;
		} // constructor
		
		@Override
		public void run() {
			log.trace("run() invoked.");
			
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			
			try (this.is; baos;) {
				log.debug("Receiver started.");
				
				int ch;
				int CR=13, LF=10;
				
				while((ch=is.read()) != -1) {	// -1 => EOF
//					log.info("ch: {}", ch);
					
					if(ch != CR && ch != LF) {
						baos.write(ch);
					} else {
//						log.info("\t+ excluded: {}", ch);
						
						if(ch == LF) { // 
							String recv = baos.toString("UTF-8");
//							log.info("RECV: {}", recv);
							log.info(recv);
							
							baos.reset();
						} // if
					} // if-else
				} // while
				
			} catch(IOException e) {
				e.printStackTrace();
			} finally {
				log.debug("Receiver stopped.");
			} // try-with-resources

		} // run

	} // end class : Receiver

} // end class
