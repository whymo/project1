// 2022.03.22

// 완성차 클래스에, 집합(부품)관계로 타이어 필드를 선언할때,
// 부모타입인 인터페이스 타입으로 선언하고, 이 필드를 초기화 할 때는
// 다형성-1에 의거해서, 구현객체(또는 자식객체)를 넣어준다!
package interfacee.field_polymorphism;


public class Car {
	
	// lvaule : 인터페이스 타입 = rvalue 자식 객체
	// 아래는 모두 다형성-1로 필드 초기화(즉, 부품 장착!)
	Tire frontLeftTire = new HankookTire();
	Tire frontRightTire = new HankookTire();
	Tire backLeftTire = new HankookTire();
	Tire backRightTire = new HankookTire();
	
	
	// 생성자 메소드 (인스턴스)
	void run() {
		// 다형성-2 발현 : 부모타입의 필드의 메소드 호출(roll) =>
		// 다형성-1에 의해 대입된 자식(구현)객체의 재정의된 메소드가 호출된다!
		frontLeftTire.roll();
		frontRightTire.roll();
		backLeftTire.roll();
		backRightTire.roll();
	} //run
	
} // end class
