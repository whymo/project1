// 2022.04.04

package ioio.exam01_inputstreamreader;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class InputStreamReaderExample {
	
	//# 다국어 데이터를 다룰때 처리하는!
	
	public static void main(String[] args) throws Exception {
		
		InputStream is = System.in;
		
		// 1. 문자변환 보조스트림 : InputStream => Reader 변환
		Reader reader = new InputStreamReader(is);	
		
		int readCharNo;
		
		char[] cbuf = new char[100]; // 바가지
		
		while ((readCharNo=reader.read(cbuf)) != -1) { // EOF(-1)
			String data = new String(cbuf, 0, readCharNo);
			
			System.out.println(data);
		} // While
		
		reader.close();
		
	} // main
	
} // end class

