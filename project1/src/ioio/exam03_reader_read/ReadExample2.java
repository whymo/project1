//2022.04.01

package ioio.exam03_reader_read;

import java.io.FileReader;
import java.io.Reader;

public class ReadExample2 {

	
	public static void main(String[] args) throws Exception { // 예외 없는 이유는  throws Exception 위로만 던지게 해놔서
		
		Reader reader = new FileReader("C:/Temp/TTT.txt");
		
		int readCharNo;
		
		char[] cbuf = new char[2];
		
		String data = "";
		
		while( true ) {	// 얼마나 읽어야할지 모르기때문에 무한루프
			readCharNo = reader.read(cbuf);
			
			if(readCharNo == -1) {	// EOF -> 더 이상 읽을게 없으면 탈출!
				break;
			} // if
			
			data += new String(cbuf, 0, readCharNo);
			
		} //while
		
		System.out.println(data);
		
		reader.close();
	
	} //main

} // end class
