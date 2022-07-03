//2022.04.08

package ioio.exam01_inetaddress;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class MultiThreadSocketServerk {
	
	private static final int port = 7777;
	
	public static void main(String[] args) throws IOException {
		
		log.debug("main({}) invoked.", Arrays.toString(args));
		
		ServerSocket serverSock = new ServerSocket(port);

		try (serverSock) {
			
			while(true) {
				
				log.info("Listenning on {} ....", serverSock);
				Socket sock = serverSock.accept();
				log.info("\t + Client connected from {}", sock);
			
//				-----------------------------------
				
				// 데이터 수신 Task를 별도의 스레드에서 수행
				new Receiver01("Receiver01", sock).start();		// workThread 1
//				new Receiver02("Receiver02", sock).start();
				
//				-----------------------------------
				
				// 데이터 송신 Task를 별도의 스레드에서 수행
				// Sender01 -> 쓰레드 클래스의 자식 클래스
				// Sender가 엔터끼까지 보내줬다
				new Sender01("Sender01", sock).start();			// workThread 2
				
				
				
//				==> 송신 수신을 한 쓰레드로 하면 곤란해진다!
//				==> 이렇게 된 이유는 서버 프로그램 구동시켰을때 어디에서 얼나마 많은 클라이언트가 들어올지 모름
//				==> 그래서 Receiver01는 계속 별도의 쓰레드로 기다리는것
				
			} // while
			
		} // t-w-r
		
	} // main

} // end class
