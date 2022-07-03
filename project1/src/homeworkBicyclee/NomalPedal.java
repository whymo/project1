package homeworkBicyclee;

public class NomalPedal implements Pedal {

	@Override
	public void run() {
		
		int Speed = (int)(Math.random()*((MAX_ROTATION -10)- MIN_ROTATION) +1) + MIN_ROTATION;	// 난수 발생
		System.out.println("최대 회전력은 20이며 현재 회전력은" + Speed + "입니다.");
	} // run

} // end class
