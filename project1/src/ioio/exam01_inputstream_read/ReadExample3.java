//2022.03.31


package ioio.exam01_inputstream_read;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Arrays;


public class ReadExample3 {

	
	public static void main(String[] args) throws Exception {
		
		InputStream is = new FileInputStream("C:/Temp/TTT.txt");
		
		byte[] readBytes = new byte[8]; // 8바이트 크기의 바가지 준비
		
		// 실제 바가지에 담긴 바이트의 개수를 반환	// 변수를 사용하지 않으면 굳이 안써도 됨!
//		is.read(readBytes, 2, 3);
		
		is.read(readBytes, 0, readBytes.length);	// 하드 코딩하지 않고 배열을 다 채우기!
		
		System.out.println(Arrays.toString(readBytes));
		
//		for(int i=0; i<readBytes.length; i++) {
//			System.out.println(readBytes[i]);
//		} // classicla for
		
		is.close();
		
	} // main

} //  end class
