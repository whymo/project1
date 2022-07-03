
public class SignOperatorExample6 {
	
	// 문자타입(char)을 이용해서, 연산수행 예제
	
	public static void main(String[] args) {
		
		// 문자 A에 1을 더했는데 어떻게 B가 나오지?
		// 왜 int 타입이 아니라 char 타입 그대로 할까요?
		// 1. 대전제 1) 정수연산식의 결과는 int 타입이다
		// 2. 대전제 2) 리터럴은 형변환을 하지 않는다!
		
		//A 형변환을 하지 않아도 되니까 타입을 따지지 않는다,
		//A 정수값 : 65 + 1 = 66 = 대문자 B
		// 리터럴 = 상수
		char c1 = 'A' + 1;
		
		char c2 = 'A'; // A 정수값 : 65
		
		// 여기서 c2는 변수이다, 변수는 타입을 따진다. 
		// 정수이기 때문에 강제형변환 하지 않으면 오류가 난다!
//		char c3 = c2 + 1; // 컴파일 에러 : 대부분 타입 미스매치 
//		char c3 = (char) (c2 + 1); 이것보다
//		
		int c3 = c2 + 1; //-> 여기서 강제형변환 해주는 것 보다
		
		
		System.out.println("c1: " + c1);
		System.out.println("c2: " + c2);
//		System.out.println("c3: " + c3);
		System.out.println("c3: " + (char) c3);
		// ㄴ 여기서 강제형변형 해주는 것이 좋다
		
		
		// a~z까지 표현하고 싶다고 할때?
		
		
	} // main

} // end class
