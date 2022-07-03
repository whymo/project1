//2022.03.11


	// static initializer 몇개 만들어도 상관 없지만 컴파일되면 하나로 합쳐버린다!
	
//	static initializer invoked.
//	static initializer2 invoked.
//	static initializer3 invoked.
//	
//	==> 이렇게!

public class Calculator3 {
	
//	pi 초기화
//	static double pi = 3.14159;		// 하드코딩
	static double pi = Math.PI;		// => 이렇게 해도 됨
	// static double pi;
	
	
//	----------------------------
	
//	int age; 	// instance field
//	
////	int get + 'age'() => int getAge'() 이렇게 바꾸기
//	
//	int getAge() {				// Getter for age
//		return this.age;		// 이름을 구분해줘야하기 때문에 this.
//	} // get + 'get'
//	
//	void setAge(int age) {		// 매개변수가 필요하다
//		this.age = age;
//	} //set + 'age'
	
	
//-------------------------------	
	
//	static double pi = 3.14159;		// 1. 위에 있는거 없애고
//	static int staticField;			// 3. 지정 안하면
	
	
//	static {
//		pi =  3.14159;			// 2. 이 값으로 초기화 된다!	
//		staticField = 0;		// 4. 지정 안한건 이렇게 기본값 0이 들어감
//	} // static initializer
//	--------------------------------
	
	static {					// 이 안에서 정적 필드를 초기화하고 있다!
		
		System.out.println("static initializer invoked.");
		
//		pi = 3.14159;
		pi = Math.PI;			// 이미 자바에서 정적 필드로 만들어놨다 (상수는 대문자로!)
		
	} // static initializer
	
//	----------------------------
	
	static int plus(int x, int y) {
		
		return x + y;
		
	} // plus
	
//	---------------------
	
	static {
		
		System.out.println("static initializer2 invoked.");
	} // static initializer2

//------------------

	static int minus(int x, int y) {
		
		return x - y;
		
	} // plus
	
//	-----------------------
	
	static {
		
		System.out.println("static initializer3 invoked.");
	} // static initializer3
	
//	-------------------------
	
} // end class

