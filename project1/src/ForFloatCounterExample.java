
// 2022.03.03

public class ForFloatCounterExample {
	
	// counter은 실수를 정확히 표현 못한다 --> 0.1을 정확히 표현 못한다
	// 0.1을 가지고 덧셈을 수행하면 근사치로 표현이된다.--> 이게 문제이다
	// 루프 변수는 실수를 쓰는 경우는 없다!!  --> 예상치 못한 버그가 생기기 때문이다!
	
	// 카운터변수의 값을 "실수"를 사용해서는 안된다!
	// 즉, 정수를 카운터 변수의 값으로 사용해야 한다!
	
	// + , * 덧셈과 곱셈이 근사치가 나온다 - 뺄셈은 괜찮다
	// float = 4바이트 정수 보관하는 방식과 실수 보관하는 방식이 다르게 쓰인다! 그래서 근사치가 나옴
	public static void main(String[] args) {
		
		for(float x=0.1f; x<=1.0f; x+=0.1F) {
			
			System.out.println(x);
			
		} // FOR

		
		
	} // main

} // end class