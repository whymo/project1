package teamworkBicycle;


public class NormalPedal implements Pedal {

		
		@Override
		public int run() {			// NormalPedal의 현재 회전력
			
			int speed = (int)(Math.random()*((MAX_ROTATION - 10) - MIN_ROTATION)+1)+MIN_ROTATION;
			System.out.println("최대 회전력은 20이며 현재 회전력은" + speed + "입니다.");
			
			return speed;
			
	}// run

}// end class
