//2022.04.06

package ioio.exam01_inetaddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressExample {
	public static void main(String[] args) {
		
		try {
			
			// InetAddress => 로컬이 될수도 리무트가 될 수도 있다!
			// InetAddress 클래스의 정적 메소드인 getLocalHost() 메소드를
			// 호출하여, 내 PC의 IP 주소를 가지고있는 InetAddress 객체를 얻어냄!!
			InetAddress local = InetAddress.getLocalHost();	// 객체 생성을 new 안쓰고 가능?! -> 싱글톤처럼
															// 직접 new 안하고 객체 얻도록 숨겨놓았다!
			
		
			System.out.println("내 컴퓨터 IP주소 : " + local.getHostAddress());	// 내 컴퓨터 ip주소가 나옴!
//			==> 근데 getHostAddress() 이게 리턴타입이 어떻길래 찍었냐? 시그니처 확인
//			==> Returns the IP address string in textual presentation.
//					Returns:the raw IP address in a string format.: 문자열로 되돌려줌
			
			System.out.println(local);
//			==> LAPTOP-TNECVEBR/172.30.1.48
//			==> 내 피씨 이름까지 가지고 있다!
//			==>  도스창에 hostname
//					LAPTOP-TNECVEBR : 똑같다!!
			
//			--------------------------------------------------
			
			// DNS 서버에 질의한 도메인명(아래, www.naver.com)에 매핑되어있는
			// 모든 IP 주소를 달라! 요청.
//			InetAddress[] iaArr = InetAddress.getAllByName("www.naver.com");
			InetAddress[] iaArr = InetAddress.getAllByName("naver.com");
			
			for(InetAddress remote : iaArr) {
//				System.out.println("www.naver.com IP주소: " + remote.getHostAddress()); // 이 객체 수조를 달라!
				System.out.println("naver.com IP주소: " + remote.getHostAddress());
			} // enhanced for
			
		} catch(UnknownHostException e) {
			e.printStackTrace();
		} // try-catch 
		
	} // main
	
} // end class

