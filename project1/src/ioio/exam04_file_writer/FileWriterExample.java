package ioio.exam04_file_writer;

import java.io.File;
import java.io.FileWriter;

import lombok.Cleanup;

public class FileWriterExample {
	
	
	public static void main(String[] args) {
		
		File file = new File("C:/Temp/file.txt");	//File file은 단지 출력할 파일을 지정할 객체를 생성하는 것 뿐
		
		try {
		
		
		@Cleanup FileWriter fw = new FileWriter(file, true);	//fw.close(); 이거만 닫아줌
		
		fw.write("FileWriter는 한글로된 " + "\r\n");
		fw.write("문자열을 바로 출력할 수 있다." + "\r\n");
		
		fw.flush();
		
//		fw.close();
		
		} catch(Exception e) {
			
			e.printStackTrace();
			 
		} // try-catch
		
		System.out.println("파일에 저장되었습니다.");
	} // main
	
} // end class

