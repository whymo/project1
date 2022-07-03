//2022.03.18

package org.zerock;


public class SportsCar extends Car2 {
	
	
	@Override	// : 자바 컴파일러가 컴파일 타임시에, 이 메소드 재정의가 규칙에 맞게 되었는지 강하게 검사
	public void speedUp() {
		
		speed += 10;
		
	} // speedUp
	
//	@Override	
//	public void stop() {		// final  때문에 오버라이딩 안됨
//		
//		System.out.println("스포츠카를 멈춤");
//		speed = 0;
//		
//	} // stop

} // end class
