//2022.04.04

package ioio.exam04_file_reader;

import java.io.FileInputStream;
import java.io.FileReader;

import lombok.Cleanup;

public class FileReaderExample {
//	public static void main(String[] args) throws Exception {
//		
//		FileReader fr = 
//				new FileReader("C:\\app\\workspace\\jse\\project1\\src\\ioio\\exam04_file_reader\\FileReaderExample.java");
//		
//		int readCharNo;
//		
//		char[] cbuf = new char[100];	// 바가지가 byte[] 아니라, char[]로 바뀐다
//		
//		while ((readCharNo=fr.read(cbuf)) != -1) {
//			String data = new String(cbuf, 0, readCharNo);
//			System.out.print(data);
//		} // while
//		
//		fr.close();
//		
//	} // main
	
//	-----------------------------------------------------------
	
	
	
	public static void main(String[] args)  {
		
		try {
			
			@Cleanup FileReader fr = 
					new FileReader("C:\\app\\workspace\\jse\\project1\\src\\ioio\\exam04_file_reader\\FileReaderExample.java");
		
		int readCharNo;
		
		char[] cbuf = new char[100];	// 바가지가 byte[] 아니라, char[]로 바뀐다
		
		while ((readCharNo=fr.read(cbuf)) != -1) {
			String data = new String(cbuf, 0, readCharNo);
			System.out.print(data);
		} // while
		
//		fr.close(); => 롬복 대체
		
		} catch(Exception e) {
			
			e.printStackTrace();
		
		} // try-catch
		
	} // main
	
} // end class

