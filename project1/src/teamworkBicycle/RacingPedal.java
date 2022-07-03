package teamworkBicycle;


public class RacingPedal implements Pedal {


	@Override
	public int run() {		// RacingPedal의 현재 회전력
		
		int speed = (int)(Math.random()*(MAX_ROTATION - MIN_ROTATION)+1)+10;			
		System.out.println("최대 회전력은 30이며 현재 회전력은" + speed + "입니다.");
			
		return speed;

	}// run

}// end class
