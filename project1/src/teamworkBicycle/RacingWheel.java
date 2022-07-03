package teamworkBicycle;


public class RacingWheel implements Wheel {

	
	@Override
	public String direction() {					// 핸들 방향과 연동
		
		Handle handle = new RacingHandle();
		return handle.direction();
		
	} //direction

	
	@Override
	public int roll() {							// RacingWheel의 현재 스피드
			
		int speed = (int)(Math.random()*(10 - 1)+1)+30;
		System.out.println("최대 스피드는 40이며 현재 스피드는" + speed + "입니다.");
		
		return speed;
			
	} //roll

} // end class
