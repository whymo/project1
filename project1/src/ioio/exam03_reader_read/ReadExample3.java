//2022.04.01

package ioio.exam03_reader_read;

import java.io.FileReader;
import java.io.Reader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class ReadExample3 {

	
	public static void main(String[] args)  {
		
		try {
		// UTF-8 지정할때, utf8(소문자), -(하이픈) 없어도 된다.
		Charset utf8 = Charset.forName("UTF-8"); // 1.  Charsets 만드는 생성자?
		Reader reader = new FileReader("C:/Temp/TTT.txt", utf8);	// 문자 기반이라 text 파일만 가능
			
			try (reader;){
				
				int readCharNo;
				char[] cbuf = new char[4]; // 4 사이즈의 바가지 준비(문자 읽어내는 바가지여서 char 타입
				readCharNo = reader.read(cbuf, 0, cbuf.length);	// cbuf.length -> 이건 무슨 역할? 바가지가 4개 담을 수 있는데 4개 담지 않고,
																// 2개만 담고싶다! -> 이럴때 바가지의 사이즈를 조절하고싶을때
																// 바가지를 온전히 사용하고싶을때, offset이랑 length를 사용함
				
				// 텍스트가 많으면 왜 다 안나올까? -> 지금 만든 코드가 파일의 끝까지 읽을 수 있는 코드가 아니다
				// 반복문이 빠져있다! 무한루프로 다 읽게하고 eof를 통해서 탈출하게 만든다!
				
				System.out.println(Arrays.toString(cbuf)); //=> 배열의 출력
				
			} // try-with-resources

		} catch(Exception e) {		// 트라이 블럭이 닫히면 클로즈 실행
			e.printStackTrace();	// 예외 캐치
		} // try-catch
		
		
		
//		-------------------------------------
//		# for문 대신에 Arrays.toString 사용
//		# Arrays.toString 으로 대체 가능
		
//		for(int i=0; i<cbuf.length; i++) {
//			System.out.println(cbuf[i]);
//		} //for 
		
//----------------------------------------------
	
//		int readCharNo;
//		char[] cbuf = new char[4];
////		readCharNo = reader.read(cbuf, 1, 2); 	// -> 배열 1번 인덱스부터 두개를 담겠다!
//		readCharNo = reader.read(cbuf, 0, cbuf.length);	
		
//------------------------------------------------
		
	
	} // main	

} // end class
