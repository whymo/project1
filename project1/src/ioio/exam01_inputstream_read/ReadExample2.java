//2022.03.31

package ioio.exam01_inputstream_read;

import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;	// 네트워킹 패키지 안에 들어있음 -> 네트워킹할때 씀!
import java.nio.charset.StandardCharsets;
import java.util.Set;
import java.util.SortedMap;

public class ReadExample2 {

	// # 안꺠지는 경우는 어떤 경우? TTT 이거 만들때, 운영체제 기본문자 집합(MS949)으로 문자열을 생성해서 
	// 이클립스 workspace를 UTF-8로 지정해서 잘 돌아간다!
	public static void main(String[] args) throws Exception {
		
		InputStream is = new FileInputStream("C:/Temp/TTT.txt");
		
		int readByteNo;
		String data = "";
		
		byte[] readBytes = new byte[3];	// 바가지 준비
		
		while( true ) {
			// 바가지로 한번에 3개 바이트를 읽어드림
			readByteNo = is.read(readBytes);
			
			// 탈출조건
			if(readByteNo == -1)  { // EOF(-1) 이면, 탈출
				break;
			} // if
				
			// String 클래스의 다양한 생성자를 꼭 훈련하기!
			Charset MS949 =  Charset.defaultCharset();					// 운영체제의 문자집합 생성(MS949)
			Charset utf8 = Charset.forName("UTF-8");					// 1. forName 안에는 문자집합 이름을 알고있다면!
			Charset utf8_2 = StandardCharsets.UTF_8;					// 표준 Charsets을 만들어낼 수 있는 UTF_8 지정
			
			SortedMap<String, Charset> charsets = Charset.availableCharsets();	// map 객체는 enhanced for 문이랑 쓸 수 있다!!
			
			Set<String> keys =  charsets.keySet();
			System.out.println(keys);									// 2. 이 안에있는 문자열로 지정한다!
			
			data += new String(readBytes, 0, readByteNo, "UTF-8");		// UTF-8 을 추가하면 한글이 안깨짐!
		} // while
		
		System.out.println(data);
		
		// 자원해제
		is.close();
		
	} // main

} // end class
