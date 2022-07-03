//2022.04.01


package ioio.exam02_outputstream_write;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import lombok.Cleanup;

public class WriteExample3 {

	public static void main(String[] args) {
		
//		OutputStream os = null;	// 변수의 선언과 초기화를 나눠놓는다!
//			
//		try {
//			
////			OutputStream os = new FileOutputStream("C:/Temp/TTT.txt");
//			os = new FileOutputStream("C:/Temp/TTT.txt");
//			
//			byte[] data = "ABC".getBytes();
//			
//			os.write(data, 1, 2);
//			
//			os.flush();		// 위에서 써야할 데이터를 다 쓴 경우
//			
//		} catch(Exception e) {
//			
//				e.printStackTrace();
//				
//		} finally {
//			
//				try {
//					
//					os.close(); // 반드시 따로!	// os 변수는 try에서 시작해서 catch에서 끝나서 finally 에서 쓸 수 없다! -> 생명주기 늘려야함
//				
//				} catch (IOException e) {		// 왜 IOException? os.close(); 얘 하나밖에 없어서!
//						;;
//				} // try-catch	
//				
//		} // try-catch-finally 
		
//		-----------------------
//		# try-with-resources
		
//		try (OutputStream os = new FileOutputStream("C:/Temp/TTT.txt");){		// 자원객체를 담고있는 변수를 소괄호 안에 넣어라!
//			os = new FileOutputStream("C:/Temp/TTT.txt");
//			
//			byte[] data = "ABC".getBytes();
//			
//			os.write(data, 1, 2);
//			os.flush();		
//			os.close(); 
//			
//		} catch(Exception e) {
//			
//			e.printStackTrace();
//
//		} // try-catch
		
//		---------------------------
//		# try-with-resources -> 자바8부터
		
		try {		
			
			OutputStream os = new FileOutputStream("C:/Temp/TTT.txt");	// 변수는 둘러싸는 블록 안에 선언해야한다!
		
			try (os) {
				
				byte[] data = "ABC".getBytes();
				
				os.write(data, 1, 2);
				os.flush();		
			}
			
		} catch(Exception e) {
			
			e.printStackTrace();
		}	
			
//	 --------------------------------
//			# 롬복 어노테이션 사용
		
//			try {		
////				@Cleanup	// os.close();  역할 -> 롬복이 선언된 변수가 있는 블록 안을 실행하고 블록이 끝날때 사용!
//				@Cleanup("close")
//				OutputStream os = new FileOutputStream("C:/Temp/TTT.txt");	
//			
//				byte[] data = "ABC".getBytes();
//					
//					os.write(data, 1, 2);
//					os.flush();		
//				
//			} catch(Exception e) {
//	
//				e.printStackTrace();
//				
//			} // try-catch
				
	} // main

} // end class
