
// 2022.02.28

public class SignOperatorExample1 {
	
	//1. 부호(sign) 연산자(+,-) 실습예제
	public static void main(String[] args) {
		
//		int x = -100;
//		int result1 = +x; // 단항연산자 : 
//		int result2 = -x; // '-' + '-' = '+'
//		
//		System.out.println("result1=" + result1); // 문자열로 자동 형변환 
//		
//		// 이때 + 는 문자열 연결연산자  : concatenation operator
//		System.out.println("result2=" + result2);
		
		//---------
		
		//(중요) : 부호연산자의 결과타입은 int이다!
		short s = 100;
		
		//short result3 = -s; //컴파일 에러
		
		int result3 = -s; 
		
		System.out.println("result3" + result3);
	
		
		
	} //main

} // end class
