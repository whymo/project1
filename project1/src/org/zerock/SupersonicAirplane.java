//2022.03.17

package org.zerock;

import javax.swing.plaf.PanelUI;

public class SupersonicAirplane extends Airplane {
	
//	1. 불변의 진리값(상수) 선언 : 공용으로 사용
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	
	public int flyMode = NORMAL;		// 비행모드 : NORMAL/SUPERSONIC
	
	@Override 
	public void fly() {
		System.out.println("Airplane::fly() invoked." );
		
		if(flyMode == SUPERSONIC) {
			
			System.out.println("초음속비행합니다.");
			
		} else {
			
			//Airplane 객체의 fly() 메소드 호출
 			super.fly();
			
		} // if-else
		
		
		
	} // fly
		
	

} // end class
