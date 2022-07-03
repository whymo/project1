//2022.04.08

package ioio.exam01_inetaddress;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Sender01 extends Thread  {

	private Socket sock;
	private OutputStream os;
	
	Sender01(String threadName, Socket sock) {
		
		log.debug("constructor({}) invoked.", sock);
		
		this.sock = sock;
		
		super.setName(threadName + "-" + super.getName());
		
		try { this.os = this.sock.getOutputStream();}
		catch (IOException e) {;;}
	} // constructor
	
	//-------------------------------------------------------------------
	
	public void run() {
		
		log.debug("run() invoked.");
		
		try {
			int CR= 13, LF=10;
			
			// handshake protocol 대로 메세지를 보냄!
			for(int i=0; i<10; i++) {
				
				String message = "보내는 메세지-" +i;	// 전송메세지 생성
				os.write(message.getBytes("utf-8"));		// 전송 메세지 문자열 -> 바이트열로 변환해서 송신
				
				// sent CRLF (***) : 엔터키도 보내자!! 왜? 그렇게 하기로 통신규약을 상대방과 정했기 때문에
				os.write(CR);
				os.write(LF);
				
				os.flush();	// 강제 flushing
				
				log.info("SENT : {} ", message);
				
				Thread.sleep(1000 * 1);	// 1초 간격으로
				
			} // for
				
//			Thread.sleep(1000);
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {	// 자원해제 : 출력스트림부터 닫고 -> 마지막으로 소켓 닫고(순서지킴)
			try { this.os.close();}		catch(IOException e) {;;}
			try { this.sock.close();}		catch(IOException e) {;;}
		} // t-c-f
		
	} //  run
	
} // end class
