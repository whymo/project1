
// 2022.03.04

public class StringEqualsExample {
	
	public static void main(String[] args) {
		
		// String 타입의 2개의 문자열 객체가 있을 때,
		// 이 두개의 문자열 객체의 주소를 저장하고 있는, 참조변수 2개가
		// 같은 주소를 가지고 있는지, 아닌지 확인 예제
		
		// strVar1 (변수) -> 스택 영역에 들어간다
		// "신민철"은 heap 영역에 들어간다
		
		String strVar1 = "신민철";		// string은 기본타입의 변수가 아니다 , String = class 참조타입이다
//		String strVar2 = "신민철";		// 신민철이라는 객체 
		String strVar2 = "신민용";		// 다른 문자열을 넣으면 참조가 다르다고 나온다!
		
		// 객체는 한번만 생성되며, 문자열 heap 영역에 생성되는 객체이다. 둘다 똑같이 신민철이면 그 주소를 공유하도록 되어있다
		// 그래서 같은 주소로 나온다!
		
		// 동등비교연산자 : 객체의 주소가 같냐를 물어보는걸로 바뀐다!
		
		if(strVar1 == strVar2) { 		// 주소가 같냐
			
			System.out.println("strVar1과 strVar2는 참조가 같음");
		} else {
			
			System.out.println("strVar1과 strVar2는 참조가 다름");
			
			
		} // if-else
		
		
//		============
		
		// . 이 도트가 srtVar1을 따라가면 신민철이라는 문자열 객체를 만난다 (스트링) 
		// 그 기능 중 하나가 equals 이쿼즈 두 문자열의 주소를 담고있,,는 문자열 자체를 비교함 주소는 달라도 상관없다 
		
		if(strVar1.equals(strVar2)) {
			System.out.println("strVar1과 strVar2는 문자열이 같음");
		} // if
		
		
//	=========================
		
		
		

		
	} // main
	
	

} // end class
