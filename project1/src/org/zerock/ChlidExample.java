package org.zerock;

public class ChlidExample {
	
//	다형성-1의 성질을 이해하자
	public static void main(String[] args) {
		
		Child child = new Child();	// 1. 자식 객체 생성
		
		Parent parent = child;	// 2. 다형성-1
		
		parent.method1();		// 3. 부모타입에 선언된 메소드 호출
		
//		다형성-2가 나온다
		parent.method2();		// 4. 부모타입에 선언된 메소드 호출
		
//		parent.method3();		// 호출불가능
		
		ChlidExample.method(child);
		
	} // main
	
	static void method(Parent parent) {
			parent.method2();
			
		} // method

} // end class
