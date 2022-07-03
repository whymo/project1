// 2022.04.04

package ioio.exam02_outputstreamwriter;

import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class OutputStreamWriterExample {
	
	
	public static void main(String[] args) throws Exception {		
		
		FileOutputStream fos = new FileOutputStream("C:/Temp/file.txt");
		
		// FileOutputStream 보조스트림 > FileOutputStream 연결
		Writer writer = new OutputStreamWriter(fos);
		
		String data = "바이트 출력 스트림을 문자 출력 스트림으로 변환";
		writer.write(data);
		
		writer.flush();
		writer.close();
		System.out.println("파일 저장이 끝났습니다.");
		
	} // main
	
} // end class

