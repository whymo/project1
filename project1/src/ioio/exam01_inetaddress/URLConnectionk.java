// 2022.04.06

package ioio.exam01_inetaddress;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Arrays;
import java.util.Date;

import javax.net.ssl.HttpsURLConnection;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class URLConnectionk {
	
	public static void main(String[] args) 
			throws IOException {
		
		log.debug("main({}) invoked.", Arrays.toString(args) );
		
		String url = "https://www.kita.net/cmmrcInfo/cmmrcNews/goodMornKita/goodMornKitaDetail.do";
		
		URL kita = new URL(url);
		
		// 지정된 URL에 직접 연결을 시도하고, 연결(터널)을 생성한 객체
//		URLConnection urlConn = kita.openConnection();	// => URLConnection 하위타입 추상클래스
		HttpsURLConnection urlConn = (HttpsURLConnection) kita.openConnection(); // HttpsURLConnection 진짜 구상하고있는
		
		// 이 URLConnection 객체는 생성된 연결을 통해서, 지정된 URL에 있는 웹자원으로부터
		// 다양한 컨텐츠를 얻어낼 수 있음.
		log.info("1. kita : {}", kita);
		
		log.info("2. urlConn : {}", urlConn);	// 내부적으로만 쓰이는 패키지 sun.
		
		log.info("3. getAllowUserInteraction : {}", urlConn.getAllowUserInteraction()); // 브라우저 사용자 처럼  상호작용 허용되는 연결이냐?! : false
		
		log.info("4. getDefaultAllowUserInteraction : {}", URLConnection.getDefaultAllowUserInteraction());
		
		log.info("5. getConnectTimeout : {}", urlConn.getConnectTimeout()); // 설정된 시간 : 0 -> 될때까지 기다리겠다
		
		// 내용을 가져올 수 있는 입력 스트림을 제공해준다. -> 바가지를 만들어 eof만날때까지 리드하면 가져올 수가 있다! 
		log.info("6. getContent : {}", urlConn.getContent()); // 진짜 반환해주는 내용을 가져옴 / HttpInputStream : 바이트기반의 입력스트림의 자식 클래스 (Http 이게 붙어서)
		
		// 어떠한 인코딩으로 되어있냐? : null
		log.info("7. getContentEncoding : {}", urlConn.getContentEncoding()); // 인코딩 : 문자열을 바이트열로 바꾸는 과정 (부호화하다)
		
		log.info("8. getContentLength : {}", urlConn.getContentLength()); // ContentLength : 컨텐트 길이 무었이냐 : -1
		
		log.info("9. getContentType : {}", urlConn.getContentType());	// URL 유형이 뭐냐  html 이 웹문서 쓰인 문자셋은 UTF-8 기반으로 쓰여졌다!
		
		log.info("10. getDate : {}", new Date(urlConn.getDate()));	// 언제 가져왔느냐?
		
		log.info("11. getDefaultUseCaches : {}", urlConn.getDefaultUseCaches());	// 캐쉬 사용할거냐 안할거냐? 기본 : true 캐쉬한다 (기본설정)
		
		// 커넥션 통로는 뚤어 놨는데 보내는것도 할수있고 리드 라이트도 할 수 있느냐?
		// 인풋 아웃풋 기준은 프로그램 
		log.info("12. getDoInput : {}", urlConn.getDoInput());		//  입력 가능? oo
		log.info("11. getDoOutput : {}", urlConn.getDoOutput());	// 아웃풋 가능? ㄴㄴ
		
		log.info("14. getExpiration : {}", urlConn.getExpiration());
		log.info("15. getExpiration : {}", urlConn.getHeaderFields());
		log.info("16. getExpiration : {}", urlConn.getIfModifiedSince());
		log.info("17. getLastModified : {}", new Date(urlConn.getLastModified()));
		
		// 0 : 장애가나면 무한정 기다리겠다!
		// 타임아웃 지정해야한다! -> 잠시 사이트 문제가있으니 조금후에 다시 시도해주세요 라고 표시되어있다
		log.info("18. getReadTimeout : {}", urlConn.getReadTimeout()); // 연결된 이후에 getReadTimeout 이 스트림으로 타임아웃 지정 가능
		
		
		log.info("19. getURL : {}", urlConn.getURL()); // getURL 그대로 반환
		
		log.info("20. gegetUseCachestURL : {}", urlConn.getUseCaches()); // getUseCaches : 캐쉬를 사용하는거냐? (캐쉬에 있는걸 쓸거냐 말거냐) ture (쓰면) 
		
		
		
	} // main

} // end class
