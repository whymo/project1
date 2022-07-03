
//2022.03.02

public class CompareOperatorExample1 {
	
	// 비교연산자 (이항, binary operator) : 대소를 가린다! => 결과타입 : boolean(true/ false)
	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 10;
		
		// 대입연산자를 기준으로 Lvalue, Rvalue
		// R -> ture , false인 불린 타입의 값이 나와야한다!
		// 소괄호 : 어떤것부터 계산해야할지 불분명하면 () 를 통해 우선순위를 분명히 한다!
		// 소괄호는 아낌없이 써라!
		
		boolean result1 = (num1 == num2); // 같냐 (동등비교연산자)
		// ㄴ 같으니까 TURE
		boolean result2 = (num1 != num2); // 같지않냐 (동등비교연산자)'
		// ㄴ 같으니까 FALSE
		boolean result3 = (num1 <= num2); // 1이 2보다 작거나 같냐 , 이하이냐
		// ㄴ 이하 맞음 TURE
		
		// 대입 연산자랑 구분시켜주려고 소괄호를 넣었다
		
		System.out.println("result1=" + result1);
		System.out.println("result2=" + result2);
		System.out.println("result3=" + result3);
		
		
//		-----
//		
//		char char1 = 'A';
//		char char2 = 'B';
		
		
	} // main

} // end class
