//2022.03.17

package org.zerock;


public class SupersonicAirplaneExample {
	
	public static void main(String[] args) {
		
		SupersonicAirplane sa = new SupersonicAirplane();
		
		sa.takeOff(); // 이륙
		sa.fly();	// 날자 !
		
		sa.flyMode = SupersonicAirplane.SUPERSONIC;		// 초음속 모드로 변경
		sa.fly(); 	// 날자!
		
		sa.flyMode = SupersonicAirplane.NORMAL;	
		sa.fly(); 	// 날자!
		
		sa.land();	// 착륙
		
	} // main

} // end class
