package ioio.exam01_inetaddress;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Sender07 extends Thread {

	private Socket sock;
	private OutputStream os;
	
	Sender07(String threadName, Socket sock) {
			
			log.debug("constructor({}) invoked.", sock);
			
			this.sock = sock;
			
			super.setName(threadName + "-" + super.getName());
			
			try { this.os = this.sock.getOutputStream();}
			catch (IOException e) {;;}
		} // constructor
	
	@Override
	public void run() {
			
			log.debug("run() invoked.");
			
			try {
			
				ObjectOutputStream oos = new ObjectOutputStream(this.os);
				
				try (oos){
					
					for(int i=0; i<10; i++) {
					
						String message = "클라이언트가 보내는 메세지-" +i;	// 전송메세지 생성
						
						oos.writeObject(message);			// 객체의 직렬화를 통한 문자열 객체 전송
						oos.flush();	
						
						log.info("SENT : {} ", message);
						
						Thread.sleep(1000 * 1);	// 1초 간격으로
					
					} // for
					
				} // t-w-r 
				
			} catch(Exception e) {
				e.printStackTrace();
			} finally {	// 자원해제 : 출력스트림부터 닫고 -> 마지막으로 소켓 닫고(순서지킴)
				try { this.os.close();}		catch(IOException e) {;;}
				try { this.sock.close();}		catch(IOException e) {;;}
			} // t-c-f
			
			log.info("Done.");
		} //  run
	
} // end class
