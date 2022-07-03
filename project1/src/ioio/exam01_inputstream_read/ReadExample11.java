//2022.03.30

package ioio.exam01_inputstream_read;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

//# 2
public class ReadExample11 {

	
	public static void main(String[] args)  {

			try {
				InputStream is = new FileInputStream("C:/Temp/TTT.txt");
				InputStream is2 = new FileInputStream("C:/Temp/TTT.txt");
				InputStream is3 = new FileInputStream("C:/Temp/TTT.txt");
				
				// 자원객체가 여러개 쓰일때 닫는 순서가 정해져있을 때도 있다!
				// 나열된 자원객체는 오른쪽에서 왼쪽으로 닫게 되어있다! ***
				try (is; is2; is3;) {	//자원객체를 소괄호 안에서 해라 / 몇개의 자원객체를 만나던 상관 없음
					
					while(true) {	
						int readByte = is.read();	
						
						if(readByte == -1) {	
							break;				
						}// if
				
						System.out.println((char)readByte);
					} // while
					
				} // try-with-resources => 필요하면 자기만의 객체를 가질 수 있다! 하지만 그럴 필요 없다! 
				//->  (is; is2; is3;) 소괄호 지정한 객체를 받는걸 보장해주는 구문
				
			} catch (IOException e) {
				e.printStackTrace();	
		} // try-catch	-> 예외처리 	
		
	} // main

} // end class
