// 2022.03.10

public class Calculator2Example {
	
	// ... 가변인자 
	public static void main(String... args) {
		
		Calculator2 myCalcu = new Calculator2();			// 1. 인스턴스 생성
		
		double result1 = myCalcu.areaRectangle(10); 		// 2. 메소드 호출
		
		double result2 = myCalcu.areaRectangle(10,20);		// 3. 메소드 호출
		
//		결과 출력
		
		System.out.println("정사각형 넓이 = " + result1);
		System.out.println("직사각형 넓이 = " + result2);

		
	} // main

} // end class
