package homeworkBicyclee;

public class RacingPedal implements Pedal {

	
//	인터페이스 규격을 구현(재정의)
	
	@Override
	public void run() {
		
		int Speed = (int)(Math.random()*(MAX_ROTATION - MIN_ROTATION) +1) + 10;	// 난수 발생
		System.out.println("최대 회전력은 20이며 현재 회전력은" + Speed + "입니다.");

	} // run

	
} // end class
