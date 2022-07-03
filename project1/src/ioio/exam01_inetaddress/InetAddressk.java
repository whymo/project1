// 2022.04.06

package ioio.exam01_inetaddress;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class InetAddressk {
	
	public static void main(String[] args) throws UnknownHostException {
		
		log.debug("main({}) invoked.", Arrays.toString(args) );
		
//		=> void org.apache.logging.log4j.Logger.debug(String message, Object p0)
//		=>  로그 찍고싶은 String message, 가변인자
		
//		=> 출력 : 11:44:48.483 DEBUG --- [main           ] i.e.InetAddressk.main - main([]) invoked.
		
//		------------------------
		
		InetAddress localhost = InetAddress.getLocalHost();	
		log.info("0. localhost : {}, type: {}", localhost, localhost.getClass().getName());
//		=> void org.apache.logging.log4j.Logger.info(String message, Object p0, Object p1)
		
//		=> 출력 : java.net.Inet4Address 우리가 쓰는 클래스는 4 가 없음 : IPv4 버전을 말하는거임!
		
		
		System.out.println("====================================================");
//		------------------------
		// 지정된 도메인명에 대한 ip 주소가 여러개 있을지라고, 단 1개의 처음
		// ip 주소만을 얻어내는 정적 메소드 호출
		InetAddress addr = InetAddress.getByName("www.naver.com");
		
		log.info("1. addr : {}", addr); // 리무트의 정보
		log.info("2. hostname : {}", addr.getHostName());	// 도메인명 가져오기
		log.info("3. FQCN : {}", addr.getCanonicalHostName());	// 완전한 도메인명 ( 우리가 쓰고있는 통신사 dns 쓰게 함)
		log.info("4. hostAddress : {}", addr.getHostAddress());	// 네이버의 Addresses
		log.info("5. looopback : {}", InetAddress.getLoopbackAddress());	//무조건 쓸 수 있는 ip 어드레스
		log.info("6. localhost : {}", InetAddress.getLocalHost());		// 로컬은 내 피씨 : 내 피씨에 대한 호스트 정보 보여줌

		
//		----------------------------
		
		// ip주소 => byte[] 변환
		byte[] addrBytes = addr.getAddress();
		log.info("7. byteAddress : {}", Arrays.toString(addrBytes));	 
		
		// get normal host address when one byte < 0, the byte + 256 required
		for(byte b : addrBytes) {
			
			// 바이트는 커봤자 255 / 255 이상을 보관할 수 있는 타입은 바이트 타입!
			log.info("\t + b : {}", (b < 0)? b+256 : b);	// 삼항연산자 사용
			
		} // enhanced for
		
//		----------------------------
		
		InetAddress[] addrs = InetAddress.getAllByName("www.kakao.com");
		
		for(InetAddress address : addrs) {
			
			log.info("8. address : {}", address);
			log.info("9. FQCN : {}", address.getCanonicalHostName());
			
		} // enhanced for


		
	} // main

} // end class
