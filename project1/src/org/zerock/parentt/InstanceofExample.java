//2022.03.18

package org.zerock.parentt;

public class InstanceofExample {
	
	// 다형성-1에 의해, 부모타입의 참조변수에 저장되어있는 자식객체를 다시 빼낼때(강제형변환),
	// 자식타입을 잘못알고 하면, ClassCastException 예외가 발생가능. ***
	// 먼저, 자식타입을 검사해서, 맞으면, 그때 안전하게 강제형변환을 통해 빼내고자 하면,
	// **instanceof** 라는 연산자(pattern Matching)가 필요하다!!!
	
	public static void method1(Parent parent) {	// 매개변수의 다형성-1
		System.out.println("InstanceofExample::method1(Parent) invoked.");
		
		//instaceof 이항 연산자의 용법 : 항1(참조타입변수) instanceof 항2(참조타입명)
		if(parent instanceof Child) {			// instanceof로 확인해본 후에
			Child child = (Child) parent;		// 안전하게 강제형변환 수행
			
			System.out.println("method1::Chile 변환 성공");
			
		} else {
			
			System.out.println("method1::Chile 변환되지 않음");
		} // if-else
		
	} // method1
	
	public static void method2(Parent parent) { // 매개변수의 다형성-1
		System.out.println("InstanceofExample::method2(Parent) invoked.");
		
		Child child = (Child) parent;		// 안전하지 않은 강제형변환 수행
		
		System.out.println("method1::Chile 변환 성공");
		
	} // method2
	
	public static void main(String[] args) {
		
		Parent parentA = new Child();		// 다형성-1 => 자식 객체가 들어가있지만 정말 형변환이 되는건 아니다
		
//		method1(parentA);
//		method2(parentA);
		
		// 정석
//		InstanceofExample.method1(parentA);	// 매개변수의 다형성-1 ok
//		InstanceofExample.method2(parentA); // 매개변수의 다형성-1 ok
		
//		----------------
		
		Parent parentB = new Parent();		// 다형성-1
		
//		method1(parentB);
//		method2(parentB);					// 예외 발생
		
		InstanceofExample.method1(parentB);	// 매개변수의 다형성-1 xx
		InstanceofExample.method2(parentB); // 매개변수의 다형성-1 xx, 예외발생
		
	} // main
	
	

} // end class
