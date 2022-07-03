//2022.03.18

package org.zerock;

public class Car2 {
	
	public int speed;
	
	public void speedUp() {
		speed += 1;
	} // speedUp
	
	public final void stop() {
		System.out.println("차를 멈춤");
		speed = 0;
	} // stop

} // end class
