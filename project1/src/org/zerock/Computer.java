//2022.03.17

package org.zerock;


public class Computer extends Calculator {	// 계산기 단점이 있음 : 원주율 pi 때문에 

	@Override
	double areaCircle(double r) {
		
		System.out.println("Computer :: areaCircle(r) invoked.");
		
		return Math.PI * r * r;
		
		
	} // areaCircle

} // end class
