//2022.03.31

package ioio.exam02_outputstream_write;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Arrays;

import lombok.Cleanup;

public class WriteExample1 {

	
	public static void main(String[] args) throws Exception {
		
		//@Cleanup 하면 try-whit-resources 이거 대신 해준다!
		// 자원객체임
		// 경로만 지정하면 기존 파일에 있던 데이터를 trun cate => 잘라낸다
		@Cleanup OutputStream os = new FileOutputStream("C:/Temp/TTT.txt", true); // true 지정하면 ABC 추가하겠다 
		@Cleanup OutputStream os2 = new FileOutputStream("C:/Temp/TTT.txt", true);  // 2번째에서 FileOutputStream 하면 내용이 날라간다
		
		// 두개의 OutputStream 만들면 주소가 다르다!
		
		System.out.println("os : " + os);
		System.out.println("os2 : " + os2);
		
		try(os; os2;) {	// ; 이거 지우지 말기!
			// 문자열 인코딩(문자열 => 바이트열)
			byte[] data = "ABC".getBytes();			// ***
			
			for(int i=0; i<data.length; i++) {
				os.write(data[i]);
			} // for
			
				System.out.println(Arrays.toString(data));
				
			os.flush();		// ***
		} // try-whit-resources : 시스템 서비스 장애 막을 수 있다!!
		
//		os.close();		// *** => 이걸 안해도 try-whit-resources 이걸 하면 자바 컴파일러가 해준다!
		
	
		
	} // main

} // end class
