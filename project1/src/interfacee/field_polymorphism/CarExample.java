// 2022.03.22

package interfacee.field_polymorphism;


public class CarExample {
	
	// 변수가 나올 수 있는 모든 곳은 다형성-1이 나올 수 있다!
	public static void main(String[] args) {
		
		Car myCar = new Car();	
		
		myCar.run();	// 4개의 바퀴를 굴림
		
//		결과=>	HankookTire :: roll() invoked.
//				HankookTire :: roll() invoked.
//				HankookTire :: roll() invoked.
//				HankookTire :: roll() invoked.
		
//		--------------------
		
//		부품교환!
		myCar.frontLeftTire = new KumhoTire();
		myCar.frontRightTire = new KumhoTire();
		
//		-----------------------
		
		myCar.run(); //부품을 교환해서 똑같은 run이라도 다르다!
		
//		결과=> 	 KumhoTire:: roll() invoked.  		// 앞에 두 바퀴는 금호타이어
//				 KumhoTire:: roll() invoked.
//				 HankookTire :: roll() invoked.		//뒤에는 한국타이어
//				 HankookTire :: roll() invoked.
		
	} // main
	
} // end class
