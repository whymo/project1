
//2022.03.08


public class CarExample {
	
	public static void main(String[] args) {
		
		// 객체 생성 참조변수를 사용해서
		// new 연산자
//		Car myCar = new Car();	// 생성자 호출 코드 , 매개변수가 없는 상태!
		
		Car myCar = new Car(350);	// 생성자 호출 코드 , 매개변수 값을 넣어줬다 '350' ---> 전달인자(값)(argument)
		
		
		//read
		// 참조변수명.객체의멤버
		// 필드 값 읽기 ( 도트연산자를 사용해서 (객체의 멤버))
		System.out.println("제작회사: " + myCar.company);
		System.out.println("모델명: " + myCar.model);
		System.out.println("색깔: " + myCar.color);
		System.out.println("최고속도: " + myCar.maxSpeed);
		System.out.println("현재속도: " + myCar.speed);
		
		
		
//----------------- 필드 초기값
		
		// write
		// 필드 값 변경
		myCar.speed = 60;
		System.out.println("수정된 속도: " + myCar.speed);
		
		
//		-------------------
//		새로운 모델링으로 
//		필드를 선언만해서 결과값이 null이 나온다!
//		
//		제작회사: null
//		모델명: null
//		색깔: null
//		최고속도: 0
//		현재속도: 0
//		수정된 속도: 60
		
		
		
	} // main

} // end class
