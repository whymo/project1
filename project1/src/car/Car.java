package car;


import lombok.NoArgsConstructor;


@NoArgsConstructor
public class Car {
	
//	1. 부품필드(집합관계)
	Tire frontLeftTire = new Tire("앞왼쪽", 6);
	Tire frontRightTire = new Tire("앞오른쪽", 2);
	Tire backLeftTire = new Tire("뒤왼쪽", 3);
	Tire backRightTire = new Tire("뒤오른쪽", 4);
	
//	2. 생성자
	
//	3. 메소드
	int run() {
		System.out.println("[자동차가 달립니다.]");
		
		if(frontLeftTire.roll()==false) {stop(); return 1;};	//열거타입 열거상수가 더 직관적
		if(frontRightTire.roll()==false) {stop(); return 2;};
		if(backLeftTire.roll()==false) {stop(); return 3;};
		if(backRightTire.roll()==false) {stop(); return 4;};
		
		return 0;
 		
	} // run
	
	void stop() {
		
		System.out.println("[자동차가 멈춥니다.]");
	} // stop

} //end class
