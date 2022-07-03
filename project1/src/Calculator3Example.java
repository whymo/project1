//2022.03.11

public class Calculator3Example {
	
	public static void main(String[] args) {
		
		double radius = 10.0;	// 원의 반지름
		
		//원의 면적을 구하기 = 반지름 제곱 * 원주율
		double result1 = radius * radius * Calculator3.pi;
		
		// 정적 메소드 (클래스명.필드)
		int result2 = Calculator3.plus(10, 5);
		int result3 = Calculator3.minus(10, 5);
		
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
	
	} // main

} // end class
