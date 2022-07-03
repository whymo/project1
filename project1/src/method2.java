// 2022.03.10

// 
public class method2 {
	
	// 정적 멤버는 힙으로 가지 못한다! 그래서 정적멤버만 쓸 수 있다?
	
	String name; 	// 인스턴스 필드
	int age;
	
	static double weight; // 정적 필드 
	static double height; // 정적 
	
	void instanceMethod() {
		System.out.println("instanceMethod() invoked.");;
		
		// 결론 1 : 인스턴스 메소드 블록 내에서, 인스턴스멤버 (메소드) 사용은 문제가 없다!	
		// 1. 인스턴스 필드를 사용해보자!
				System.out.println("1. name: " + name);
				System.out.println("1. age: " + age);
				
		// 결론 2 : 인스턴스 메소드 블록 내에서, 인스턴스멤버 (메소드) 사용은 문제가 없다!	
//				2. 인스턴스 메소드 사용
				instanceMethod2();		// 가능!
				
		// 결론 3 : 인스턴스 메소드 블록 내에서, 정적멤버(필드) 사용은 문제가 없다!		
//				3. 정적 필드 사용
				System.out.println("1. weight : " + weight); 	
				
//			결론 4. : 인스턴스 메소드 블록 내에서, 정적멤버(메소드) 사용은 문제가 없다!		
//				 4. 정적 메소드 사용
				staticMethod(); 			// 정적 메소드 사용 가능!
				
				// 대전제1 : 인스턴스 메소드 블록 내에서는, 인스턴스멤버 + 정적멤버 모두 사용 가능하다!!!!***
				// 대전제2 : 정적 메소드 블록 내에서는, 오로지 정적멤버만 사용 가능하다!!
				
	} // instanceMethod1
	
	void instanceMethod2() {
				;;
	} // instanceMethod2
	
	static void staticMethod() {
		System.out.println("staticMethod() invoked.");;
		
	} // staticMethod1
	

//	public static void main(String[] args) {		// 정적 메소드이다!!
//		
//		// 결론1 : 정적 메소드 블록내에서, 정적멤버(필드+메소드) 사용은 아무런 문제가 없다!
//		System.out.println("1. weight : " + weight); 		// 정적 필드 사용 가능!
//		staticMethod(); 			// 정적 메소드 사용 가능!
//		
////		----------------
//		
//		//결론2 : 정적 메소드 블록내에서, 인스턴스멤버(필드, 메소드)사용은 불가!
////		System.out.println("2. name: " + name); // => 컴파일 오류 :	인스턴스 필드 사용 불가!
////		instanceMethod(); 						// 인스턴스 메소드 사용 불가!
//		
//	} // staticMethod2 (main)
//	
	
	
//------------------
	
	
public static void main(String[] args) {
	
	method2 obj = new method2();					// 객체부터 생성해서 써야한다!! -> 인스턴스가 필요해서
	// 
	System.out.println("1. name : " + obj.name);
	System.out.println("2. age : " + obj.age);
	
	System.out.println("3. weight : " + obj.weight);	// 왜 static멤버는 노란색줄 경고?
	System.out.println("4. height : " + obj.height);	// 정적인 방식으로 접근해서 사용해야한다
	
	// 대전제3: 정적멤버(필드, 메소드)는 정적멤버답게 사용해라!!!
	// 			정적 멤버는 인스턴스(객체)의 소속이 아니라, clazz객체의 멤버이기 때문에,
//				인스턴스의 참소(주소)를 가지는 참조변수로 사용해서는 바람직하지 않다!
//				정적멤버의 사용방법 : "클래스명.정적멤버"
	System.out.println("3. weight : " + method2.weight);	
	System.out.println("4. height : " + method2.height); // 클래스명.정적멤버 => 워닝 사라짐!!
	
	method2.staticMethod();	// 정적메소드 호출도 대전제3과 마찬가지!
	
//	---------------------------------
	
	// 인스턴스 멤버는 인스턴스 멤버답게, 인스턴스의 주소를 가지고있는 "참조변소.인스턴스(정적)멤버"
	
//	method2.name; //=> 오류 정적 / 앞에는 클래스명.인스턴스멤버 => 이렇게 쓸 수 없다 : 대전제 1 위배
//	method2.instanceMethod(); 	// 대전제 위배
	
} // main (staticMethod3)



} // end class
