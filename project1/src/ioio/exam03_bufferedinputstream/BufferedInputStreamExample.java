// 2022.04.04

package ioio.exam03_bufferedinputstream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedInputStreamExample {
	
	
	public static void main(String[] args) throws Exception {
		
		long start = 0;
		long end = 0;
		
//		// 1. 성능향상 보조스트림을 사용하지 않고, 직접 바이트기반의 입력스트림으로
//		// 		파일을 읽어냈을때 실행소요시간 측정
//		// 사용하지 않았을 때: 430480ms
//		FileInputStream fis1 = 
//			// file size : 125,947,904 바이트 120MB
//			new FileInputStream("C:/Users/y_05/Downloads/yioiii/Postman-win64-8.8.0-Setup.exe");
//		
//		start = System.currentTimeMillis();
//		
////		while(fis1.read() != -1) {;;}	// EOF
//		while(fis1.read() != -1); // 이것도 가능
//		
//		end = System.currentTimeMillis();
//		
//		System.out.println("사용하지 않았을 때: " + (end-start) + "ms");
//		fis1.close();
		
//		-------------------------------------
		
		// 2. 성능향상 보조스트림을 연결해서, 동일 파일을 읽어내었을때 소요시간 측정
		// 사용했을 때: 1042ms
		// 413배 정도 차이남!
		FileInputStream fis2 = 
				new FileInputStream("C:/Users/y_05/Downloads/yioiii/Postman-win64-8.8.0-Setup.exe");

		// 성능향상 보조스트림 연결
		BufferedInputStream bis = new BufferedInputStream(fis2);

		start = System.currentTimeMillis();

		while(bis.read() != -1);

		end = System.currentTimeMillis();

		System.out.println("사용했을 때: " + (end-start) + "ms");

		bis.close();
		fis2.close();
		
	} // main
	
} // end class

