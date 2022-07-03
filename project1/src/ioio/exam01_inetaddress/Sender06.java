package ioio.exam01_inetaddress;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

import lombok.extern.log4j.Log4j2;


@Log4j2
class Sender06 extends Thread {
	private Socket sock;
	private OutputStream os;
	
	
	Sender06(String threadName, Socket sock) {
		log.debug("Constructor({}) invoked.", sock);
		
		this.sock = sock;

		super.setName(threadName+"-"+super.getName());
		
		try { this.os = this.sock.getOutputStream(); } catch (IOException e) {;;}
	} // Constructor
	
	
	@Override
	public void run() {
		log.debug("run() invoked.");
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(this.os));

		try (bw) {

			int CR=13, LF=10;
			
			for(int i=0; i< 10; i++) {
				
				String message = "클라이언트메시지-"+i;
				bw.write(message);
				bw.write(CR);
				bw.write(LF);
				bw.flush();

				log.info("SENT: {}", message);
				
				Thread.sleep(1000 * 1);
				
			} // for
		
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try { this.os.close(); }   	catch(IOException e) {;;}
			try { this.sock.close(); } 	catch(IOException e) {;;}
		} // try-catch-finally
		
		log.info("Done.");
	} // run
	
} // end class