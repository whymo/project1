// 2022.03.10

public class TTTT {
	
	// 생성자 없음
	
	// 각 메소드는 호출 로그만 찍는다 
	// 클래스 내부에서 메소드 사용하고싶을때
	
	String name = "jiyeon";
	static int age = 23;
	
	void method1() {
		System.out.println("method1() invoked.");
//		System.out.println("name : " + name);	// name이 어디서 나온건지 모름 ==> 이것도 가능은 하지만, 정석대로 해라
		System.out.println("name : " + this.name); // 이렇게하면 위에 name을 가져다쓴다고 알려줌 (정석)
		System.out.println("age : " + TTTT.age);  	// static이 붙어있으면 클래스명. 붙이는게 정석이다!
		
		String name = "tttddd";		// 이 name 충돌된다 -> 여기 name은 지역변수
		
		//method2(); // 메소드 2의 기능이 필요하다, 그럼  메소드 호출 / // 참조변수, 도트 연산자 필요 없지만 정석은 붙여라
		this.method2(); // ->  정석대로 this를 붙이는 것이 좋다
		
	} //mothod1()

	void method2() {			
		System.out.println("method2() invoked.");
		
		method3(); // 메소드 3의 기능이 필요하다, 그럼  메소드 호출
		
	} //mothod2()
	
	void method3() {			
		System.out.println("method3() invoked.");
	} //mothod3()
	
//	--------------------------------오버로딩 순서 예시--------------------------------------
	
//	void method() {;;}
//
//	void method(String name) {;;}
//	
//	void method(String name, int age) {;;}		// 오버로딩은 이름은 안따짐 => 첫 스트링, 두번째 인트
//	
//	void method(int age, String name) {;;}		// 순서 만족한다 => 개수 두개, => 첫 인트, 두번째 스트링
//	
////	void method(String name, int weight) {;;}	// 왜 컴파일 오류남? 위에는 나이, 아래는 무게 
////	-> 오버로딩 조건 중 순서 : 순서가 동일 
//	
//	// 순서는 아무리 똑같아도 개수랑 타입이 달라야한다 
//	
//	void method(int age, String name, double number) {;;}	
//	
//	// 순서, 개수, 타입 3개 다 다르면 좋지만 이 중 하나만 달라도 된다!
	
	// 리턴타입, 메소드이름은 안따짐
	void method(int age, String name, double number) {;;}	
	void method(int age, String name, double number, float height) {;;}	 // -> 순서는 동일하지만 개수가 다르다 => 오히려 순서는 지켜주는것이 좋다
	
	void method(String name, int age) {;;}
//	int method(String name, float age) {;;} // => 이렇게 해도 오류남 : void method(String name, int age) {;;}
	// 메소드를 돌려줄 값의 타입이 온다 , ;; 이렇게 패스하면 안됨 어떤 값을 줘야한다.
	int method(String name, float age) { return 0; } 
			
	
} // end class
