// 2022.04.06

package ioio.exam01_inetaddress;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class URLk {
	
	public static void main(String[] args) 
			throws IOException, URISyntaxException {
		
		log.debug("main() invoked.");
		
//		-------------------------------
		
		// URL  = Uniform Resource Locator
		URL url1 = new URL("https://www.kita.net/cmmrcInfo/cmmrcNews/goodMornKita/goodMornKitaDetail.do");
		log.info("1. url1 : {}, type : {}", url1, url1.getClass().getName());
		
		
//		--------------------------------
		
		URL url2 = new URL("http", "www.kita.net", "/cmmrcInfo/cmmrcNews/goodMornKita/goodMornKitaDetail.do");
		log.info("2. url2 : {}", url2);
		
//		--------------------------------

		URL url3 = new URL("http", "www.kita.net", 80, "/cmmrcInfo/cmmrcNews/goodMornKita/goodMornKitaDetail.do");
		log.info("3. url3 : {}", url3);
		
//		--------------------------------
		
		System.out.println("==========================================================");
		
		URL kita = new URL("https://www.kita.net/cmmrcInfo/cmmrcNews/goodMornKita/goodMornKitaDetail.do");
		log.info("4. kita : {}", kita);
		
		// # 다양한 게터메소드로 필요한 정보를 나타낼 수 있다!
		
		log.info("\t + getAuthority : {}", kita.getAuthority());
		log.info("\t + getProtocol : {}", kita.getProtocol());
		log.info("\t + getHost : {}", kita.getHost());			// 호스트 네임 
		log.info("\t + getPort : {}", kita.getPort());			// 포트번호 : 유효한 값 없으면 : -1
		log.info("\t + getDefaultPort : {}", kita.getDefaultPort());	// 80번 포트이면 생략해도됨, 단, https : 443번 포트!
		log.info("\t + getFile : {}", kita.getFile());		// getPath 와 동일한 정보 : URI
		log.info("\t + getPath : {}", kita.getPath());		// getFile 와 동일한 정보 : URI
		log.info("\t + getQuery : {}", kita.getQuery());	
		log.info("\t + getRef : {}", kita.getRef());
		log.info("\t + getUserInfo : {}", kita.getUserInfo());
		log.info("\t + getContent : {}", kita.getContent());	// URL 객체의 레퍼런스!
		log.info("\t + toExternalForm : {}", kita.toExternalForm());	// toExternalForm 이걸로 바꿔서 내보내라! : 우리가 넣은 양식 구조 그대로 나옴
		log.info("\t + toURI : {}", kita.toURI()); // URI로 뽑아내라! : 앞에 부분도 다 나옴 -> 잘못된건 아님

//-----------------------------------------

		
	} // main

} // end class
