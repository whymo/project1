//2022.04.04

package ioio.exam02_fileinputstream;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

import lombok.Cleanup;

public class FileInputStreamExample {
	
	
	public static void main(String[] args) {
		
//		try {
//			FileInputStream fis = 
//					// FileInputStreamExample.java -> java도 붙여줘야함
//					// Path Separator (경로구분자) -> 운영체제 마다 틀리다 (윈도우 : \(백슬래쉬), Mac/Linux/UNIX : /(슬래쉬))
//					// 왜 백슬래쉬 두번 들어감? \\ : \t 붙으면 탭 이런식으로 특수한 기능을 부여함! (탈출문자라고함), 이런 기능 갖고있다보니
//					// 경로 구분인지 탈출문자인지 알 수가 없다! 그래서 \\ 두번 치면 평범한 문자로서 백슬래쉬를 나타내준다!
//					// 여기에 / 슬래쉬 해도 통한다!!! 
//				new FileInputStream("C:\\app\\workspace\\jse\\project1\\src\\ioio\\exam02_fileinputstream\\FileInputStreamExample.java");
//			
//			int data;
//			
//			while ( (data = fis.read() ) != -1 ) {	// 탈출조건식 : EOF(-1) 만날때까지, 반복해서 읽음
//				System.out.write(data);	
			// System.out : PrintStream
//			} // while
//			
//			fis.close();	// 자원반납(to 운영체제)
//		} catch(Exception e) {
//			e.printStackTrace();
//		} // try-catch
		
		// 롬복으로 적용!
		
		// 문자열로 적용? 
		
//		=============================================================================================
		
//		StringBuffer / StringBuilder => 성능 악영향주는거 안써도 커다란 데이터
		
		Charset utf8 = Charset.forName("utf-8");
		
		
		try (FileInputStream fis = 
				new FileInputStream("C:\\app\\workspace\\jse\\project1\\src\\ioio\\exam02_fileinputstream\\FileInputStreamExample.java");){
			
			InputStreamReader is = new InputStreamReader(fis,utf8);	// InputStreamReader : 문자 단위로 읽어들임
			
			try(fis;is;) {
			
				int data;		// 데이터를 바이트 기반으로 읽어 들인다.
			
				StringBuffer sb = new StringBuffer(); 	// 버퍼 생성
		
			
				while ( (data = is.read()) != -1 ) {	// 탈출조건식 : EOF(-1) 만날때까지, 반복해서 읽음
					
	   			 	//System.out.write(data);
					sb.append((char)data);
					
				} // while
			
				String source = sb.toString();
				System.out.println(source);
			
			} // try-with-resource
			
		} catch(Exception e) {
			
			e.printStackTrace();
			
		} // try-catch
			
		
	} // main
	
} // end class

