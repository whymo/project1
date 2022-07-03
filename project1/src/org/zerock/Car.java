//2022.03.14
// getter setter 메소드

package org.zerock;

//클래스의 필드에 대해서, getter/setter를 선언하면,
//이 클래스를 자바빈즈(java beans) 클래스라고 하며, (bean : 강낭콩 -> 자바언어로 만든 콩)
//이 getter/setter에 의해서, 필드(속성,(Attributes)이 아니라, "프로퍼티(property)" 라고 하는 개념이 생기게 됨

public class Car {
	
//	1. 상태필드
	private int speed;
	private boolean stop;
	
//	생성자 - 기본 생성자를 의존
	
//	메소드 - 기능/ 행위 구현
//	1. Getter는 왜 필요한가? -> 필드의 값을 변환해서 줘야할 경우가 많음
	public int getSpeed() {				//getter
		return speed;
	} // getSpeed
	
//	2. Setter는 왜 필요한가? -> 필드의 값을 설정할때 무결성 검사 => 엉뚱한 데이터가 못들어가게
	public void setSpeed(int speed) {	// setter
		if(speed<0) {
			this.speed = 0;
			
			return;			// 무조건 메소드의 실행종료 및 값 반환(있는 경우)
		} else {
			this.speed = speed;
		} // if-else

	} // setSpeed
	
//	3. boolean 타입의 필드에 대한 Getter이름은 "is 필드명"을 정한다!
	public boolean isStop() {		// 왜 isStop으로 함?
		return stop;
	} // isStop
	
	public void setStop(boolean stop) {		// setter
		this.stop = stop;
		this.speed = 0;

	} // setStop

} // end class
