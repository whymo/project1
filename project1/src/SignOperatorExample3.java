
public class SignOperatorExample3 {
	
	// 부정연산자 NOT(!)의 사용 예 ==> 토글(TOGGLE)
	// toggle is like a switch 스위치 역할
	public static void main(String[] args) {
		
		boolean play = true;
		System.out.println("1. " + play);
		
		play = !play; // 부정해라 
		// 타입은 변수에 지정한다! 리터럴에는 ㄴㄴ
		// 피연산자는 대부분 변수이다!
		System.out.println("2. " + play);
		
		play = !play; // play = false --> 부정을 부정해라! --> true
		System.out.println("3. " + play);
		
		// 많이 쓰인다!! 
		
	} // main

} // end class
