//2022.03.31

package ioio.exam02_outputstream_write;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample2 {

	
	public static void main(String[] args) throws Exception {
		
		OutputStream os = new FileOutputStream("C:/Temp/TTT.txt");
		
		// 문자열 인코딩(문자열 => 바이트열)
//		byte[] data = "ABC".getBytes();	// 이 메소드 오버로딩된게 있을까? 
//		byte[] data = "바가지".getBytes();	// 기본 문자셋으로 인코딩 -> 이렇게 하면 맥 등에서는 안나올 수 있음
		byte[] data = "바가지".getBytes("UTF-8"); // 이렇게 확실하게 해줘야 깨지지 않는다!
		
		os.write(data);	//  바가지채로 출력버퍼(8KB)에 고속출력(부어버림)
		
		os.flush();
		os.close();
		
	} // main

} // end class
