
// 2022.03.02

public class AssignmentOperatorExample1 {
	
	// 복합대입연산자 예제
	public static void main(String[] args) {
		
////		int result = 0;
//		
//		//변수 += 리터럴 
//		result += 10;
////		result = result + 10; // 풀어서
//		
//		System.out.println("result=" + result);
//		
//		result -= 5;
////		result = result -5; // 풀어서
//		
//		System.out.println("result=" + result);
//		
//		result *= 3;
////		result = result * 3;
//		
//		System.out.println("result=" + result);
//		
//		result /= 5;
////		result = result / 5;
//		
//		System.out.println("result=" + result);
//		
//		result %= 3;
////		result = result % 3;
//
//		System.out.println("result=" + result);
//		
		
		// (***) 대입 연산자가 가장 마지막에 수행된다! 앞에 있는 연산자가 먼저 수행
		
		
		// 문제 : 복합대입연산자로, result 변수의 값을 1 증가시키는 코드를 만들어라!
		
		int result = 100; 
		
		result += 1;
//		result = result + 1;
		
		System.out.println("result=" + result);
				
	} // main

} //end class
