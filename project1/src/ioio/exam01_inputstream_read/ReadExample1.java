//2022.03.30

package ioio.exam01_inputstream_read;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

//#1
public class ReadExample1 {

	
//	public static void main(String[] args) throws Exception {
	public static void main(String[] args)  {	// 예시 해봄
		
		// 입력스트림 객체를 생성하는 순간 -> 실제 타겟과 연결됨
		// 매개변수에 다국어 문자 있다고 알려줘야함 , 하지만 안됨! -> 이게 한계
//		InputStream is = new FileInputStream("C:/Temp/TTT.txt"); 
		
		// 지역변수는 선언만으로 끝내지 말고, 적절한 초기값으로 초기화해서 정의해주라!!
		InputStream is = null;
		
		try {
//			InputStream is = new FileInputStream("C:/Temp/TTT.txt"); 
			 is = new FileInputStream("C:/Temp/TTT.txt"); 	// 밑에 finally의 is.close();의 is 변수가 실행되기 위해서
				
	//		int readByte;
			
	//		----
			
			while(true) {	// 파일의 끝(EOF)이 언제 도달할지 모르기 때문에, 무한루프돌림
				int readByte = is.read();	// 입력스트림으로 들어오는 바이트를 손가락으로 하나씩 읽음
				
				// 무한루프의 "탈출조건"
				if(readByte == -1) {	// 파일의 끝(EOF, End-Of-File)인 -1이 들어오면, ( 왜 -1일까? 음수인 정수는 없기 때문!)
					break;				// while문 끝내고 빠져나온다!
				}// if
					
				
				// 왜 char로 바꿈? "문자로 구성된" 파일이니까 파일의 내용을 읽어서 출력하려면 char로 해야함!
				// 중요한건 왜 char로 바꿔야하는지 생각!
				System.out.println((char)readByte);	// byte -> char 강제형변환(출력위해)
			} // while
			
	//		----
			
//			is.close();	// 자원 해제 => 중간에 예외 발생하면 수행 안된다!
			
		} catch(IOException e) {	
			e.printStackTrace(); 	// 무조건 넣어주는 예외처리 로직
		} finally {		// try block에서 예외가 발생하든/ 안하든 반드시 실행되는 블록 => 자원해제하는 코드 작성해야함
			
			// 자원 해제코드 작성
			try {
				is.close();			// 고작 한줄인데 계속 중첩됨 -> 중복코드 -> 쓸데없이 반복되는 코드
			} catch (IOException e) {	
				e.printStackTrace(); 
			} //자원해제코드
			
		} //try-catch-finally
		
//		---------------------------아래보다 위에 코드------------------------------ㄴ
			
//		} catch(FileNotFoundException e) {	// Exception 클래스의 자식타입 -> FileNotFoundException
//			
//			
//		} catch(IOException e) {		// Exception 클래스의 자식타입 -> IOException
//			
//			
//		} // try-catch // 다중 캐치를 사용
		
	} // main

} // end class
