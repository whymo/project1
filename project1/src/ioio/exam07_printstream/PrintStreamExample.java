// 2022.04.04

package ioio.exam07_printstream;

import java.io.FileOutputStream;
import java.io.PrintStream;

import lombok.Cleanup;

public class PrintStreamExample {
	
	
	public static void main(String[] args) throws Exception {
		
		FileOutputStream fos = new FileOutputStream("C:/Temp/file.txt");
		PrintStream ps = new PrintStream(fos);
		
		ps.println("[프린터 보조 스트림]");
		ps.print("마치 ");
		ps.println("프린터가 출력하는 것처럼 ");
		ps.println("데이터를 출력합니다.");
		
		ps.printf("이름 : %s, 나이 : %d ", "jiyeon", 23);
		ps.flush(); 
		
		ps.close();
		fos.close();
	
	
//	--------------------------------------------------
	
//		# 과제
	
//	public static void main(String[] args)  {
//		
//		try {
//			
//		
//		FileOutputStream fos = new FileOutputStream("C:/Temp/file.txt");
//		@Cleanup PrintStream ps = new PrintStream(fos);
//		
//		ps.println("[프린터 보조 스트림]");
//		ps.print("마치 ");
//		ps.println("프린터가 출력하는 것처럼 ");
//		ps.println("데이터를 출력합니다.");
//		
//		
////		ps.printf(null, args)
//		
//		ps.flush();
//		
//		ps.close();
//		fos.close();
//		
//		} catch(Exception e) {
//			
//			e.printStackTrace();
//			
//		} // try-catch
		
	} // main
	
} //end class
