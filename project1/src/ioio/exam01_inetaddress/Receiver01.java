//2022.04.08

package ioio.exam01_inetaddress;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

import lombok.extern.log4j.Log4j2;

// 데이터 수신만 전문으로 하는 workThread 클래스 선언!
@Log4j2
public class Receiver01 extends Thread {
	
	private Socket sock;
	private InputStream is;
	
	public Receiver01(
			String threadName,
			Socket sock
		) {
		
		log.debug("Constructor({}) invoked.", sock);
		
		this.sock = sock;
		
		super.setName(threadName+ "-" + super.getName());
		
		// Socket으로부터, 데이터 수신을 위한 입력스트림 추출 및 필드에 설정(보관)
		try {this.is = this.sock.getInputStream(); }
		catch(IOException e) {;;}
	
	} // constructor
	
//	----------------------------------
	@ Override
	public void run() {
		log.debug("run() invoked.");
		
		// ByteArrayOutputStream : 보조스트림이지만, 메모리에 바이트를 보관할 수 있는 출력 스트림
		// 언제 어느때 메세지가 들어올지 모른다. 끊기 전까지는 계속 while문 돔 ~ 
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		
		try(baos) {			// 보조스트림도 자원객체이니, 닫아줘야겠죠?
			
			int ch;
			int CR = 13, LF = 10;			//  enter key code
			
			while((ch=is.read()) != -1) {	// 입력스트림의 EOF(-1)을 만나기 까지는...	//상대방 소켓이 끊어질때까지 진행됨
				
//				log.info("ch: {}", ch);
				
				// 왜 CR, LF 처리를 했을까?
				// 리시브를 이렇게 정해 놓음
				if(ch != CR & ch != LF) {	// 수신된 바이트값이, CRLF가 아니면...	
					baos.write(ch);			// 보조출력스트림에 저장
				} else {
					
//					log.info("ch: {}", ch);
					
					if(ch == LF) {		// 수신된 바이트값이, CR 또는 LF라면...	// 엔터키 친게 확인되면
						// 현재까지 보조출력스트림에 저장된 모든 바이트열을 문자열로 변환
						String recv = baos.toString("utf-8");
						log.info("RECV : {}", recv);		//	콘솔에 출력
						
//						flush 안써도 됨! 
						baos.reset();		// 바이트열 보조스트림 내부를 깨끗하게 지움(공장모드)
						
					} // if
					
				} // else-if
				
			} // while
			
		} catch(Exception e) {;;}		// 예외처리할건 없다  : 중요한건 소켓이 끊어졌느냐 아니냐이다.
		finally {
			try { this.is.close();}		catch(IOException e) {;;}
			try { this.sock.close();}		catch(IOException e) {;;}
		} // t-c-f
		
		log.info("Done.");
		
	} // run
	
	
	

} // end class
