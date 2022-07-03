//2022.04.01

package ioio.exam03_reader_read;

import java.io.FileReader;
import java.io.Reader;

// # 문자 기반 입력 스트림
public class ReadExample1 {

	
	public static void main(String[] args) throws Exception {
		
//		# 자원객체
		Reader reader = new FileReader("C:/Temp/TTT.txt");
		
		int readData;
		
		while( true ) {
			readData = reader.read();		//read(); -> 이 메소드는 한개의 문자를 읽음 return 타입은 int
			
			if(readData == -1) {
				break;
			} // if
			
			System.out.print((char)readData);
			
		} // while
		
		
		reader.close();
	
	} // main

} // end class
