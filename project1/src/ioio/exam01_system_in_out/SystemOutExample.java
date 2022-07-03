//2022.04.01

package ioio.exam01_system_in_out;

import java.io.OutputStream;

public class SystemOutExample {
	
	
	public static void main(String[] args) throws Exception {
		
		OutputStream os = System.out;		// 다형성-1 : PrintStream > OutputStream
		
//		# 숫자를 빠르게 출력해야한다 -> 그럴때 사용
//		for(byte b=48; b<58; b++) {	// 48과 58 ASCII 코드 테이블 -> 0 ~ 9까지 (48: 0 , 57 : 9 의미)
//			os.write(b);
//		}// for
////						아스키 코드 13 : CR : 그 행에서 처음으로 되돌아간다 -> 왜 안했을까? -> 줄만 바꿔도 그 다음행에는 아무런 문제 없어서
//		os.write(10);	// 아스키 코드 10 : LF(Line Feed) : 줄바꿈 
//		os.flush(); // 여러번해도 상관 없다
		
//		os.close(); 해야할 것 같은데, 왜 소스에는 이 close를 수행하지 않을까
//			=> 운영체제가 준 표준출력, 에러, 입력은 프로그램 내에서 절대 닫으면 안된다!!!
		
//		---------------
//		# 변형 : 0, 2,4,6,8 만 추출하고싶을때?
		
		for(byte b=48; b<58; b+=2) {	// 48과 58 ASCII 코드 테이블 -> 0 ~ 9까지 (48: 0 , 57 : 9 의미)
			os.write(b);
		}// for
					
		os.write(10);	// 아스키 코드 10 : LF(Line Feed) : 줄바꿈 
		os.flush(); 	// 여러번해도 상관 없다
		
//		------------------------------
		
		for(byte b=97; b<123; b++) {
			os.write(b);
		} // for		
		
		os.write(10);	
		
//		------------------------------


		String hangul = "가나다라마바사아자차카타파하";
		byte[] hangulBytes = hangul.getBytes("utf8");	// 바가지 만들기 / 문자열을 바이트로 만드는 인코딩 할때 getBytes씀 
												// 메소드 없는 getBytes 쓰면 운영체제 기본(ms949) 정수 코드값으로 집어넣음
												// 이클립스 설정이 utf8로 되어있어서 깨지지 않는다!
		
		os.write(hangulBytes);	// 출력 스트림 (OutputStream) -> 바가지 붙기
		
		os.flush(); // 여러번해도 상관 없다
		
	} // main
	
} // end class

