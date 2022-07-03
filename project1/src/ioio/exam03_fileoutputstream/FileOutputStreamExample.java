//2022.04.04

package ioio.exam03_fileoutputstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import lombok.Cleanup;


public class FileOutputStreamExample {
	
	
//	public static void main(String[] args) throws Exception {
//		
//		String originalFileName = "C:\\app\\workspace\\jse\\project1\\src\\ioio\\exam03_fileoutputstream\\house.jpg";
//		String targetFileName = "C:/Temp/house.jpg";
//		
//		FileInputStream fis = new FileInputStream(originalFileName);	// For source file.
//		FileOutputStream fos = new FileOutputStream(targetFileName);	// For target file.
//		
//		int readByteNo;
//		
//		byte[] readBytes = new byte[100];		// 바가지 생성
//		
//		while( (readByteNo = fis.read(readBytes)) != -1 ) {		// 바가지 이용해서 한번에 최대 100바이트 read
//			fos.write(readBytes, 0, readByteNo);				// 바가지에 읽은 바이트들을 한번에, 출력버퍼에
//		} // while
//		
//		fos.flush();		// ***
//		fos.close();
//		fis.close();
//		
//		System.out.println("복사가 잘 되었습니다.");
//		
//	} // main
	
//	----------------------------------------------------------
//	# throws 쓰지 않고!
	
	static final String originalFileName = "C:\\app\\workspace\\jse\\project1\\src\\ioio\\exam03_fileoutputstream\\house.jpg";
	static final String targetFileName = "C:/Temp/house.jpg";
		
	public static void main(String[] args)  {
		
		try {
			
		@Cleanup FileInputStream fis = new FileInputStream(originalFileName);	// For source file.
		@Cleanup FileOutputStream fos = new FileOutputStream(targetFileName);	// For target file.
		
		int readByteNo;
		
		byte[] readBytes = new byte[100];		// 바가지 생성
		
		while( (readByteNo = fis.read(readBytes)) != -1 ) {		// 바가지 이용해서 한번에 최대 100바이트 read
			fos.write(readBytes, 0, readByteNo);				// 바가지에 읽은 바이트들을 한번에, 출력버퍼에
		} // while
		
		fos.flush();		// ***
//		fos.close(); => 롬복 대체 가능
//		fis.close();
		
		System.out.println("복사가 잘 되었습니다.");
		
		} catch(Exception e) {
			e.printStackTrace();
		} // try-catch 
		
	} // main
	
} // end class

