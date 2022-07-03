// 2022.04.06

package ioio.exam01_inetaddress;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Arrays;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class ReadURLContentAndSaveToFilek {
	
	public static void main(String[] args) 
			throws IOException {
		
		log.debug("main({}) invoked.", Arrays.toString(args));
		
		// 1. 지정된 URL에 대한 URL객체 생성
		String url = "https://www.kita.net/cmmrcInfo/cmmrcNews/goodMornKita/goodMornKitaDetail.do";
		String outFile = "goodMornKitaDetail.do.html";
				
		URL kita = new URL(url);
		
		// *** 중요
		InputStream is = kita.openStream();		//  이거 하나로 터널도 만들고 연결도 생성하고, 연결로 inputstream 객체도 생성
		
		FileOutputStream fos = new FileOutputStream(outFile);
		
		try(is; fos) {
			
			int nextByte;
			
			while((nextByte = is.read()) != -1) {	// EOF(-1) -
			
				fos.write(nextByte);
				
			} // while
	
		} // // try-with-resources
		
		
//		------------------------
		
		File f = new File(outFile);
		
		if(f.exists()) {
			
			log.info("\t + getAbsolutePath : {}", f.getAbsoluteFile());
		} // if			
		
		
		// 출력 된거 보니까 소스코드가 다 드러남, 그리고 나쁜 코드이다
			
	} // main

} // end class
