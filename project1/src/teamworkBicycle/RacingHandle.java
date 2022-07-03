package teamworkBicycle;


public class RacingHandle implements Handle {

	
	
	
	@Override
	public String direction() {					// 방향 전환
	
//		Wheel wheel = new RacingWheel();
//		return wheel.direction();
		
		int dir = (int)(Math.random()* 3 + 1);	
		
		if(dir == 1) {
			
			return "좌회전";
			
		} else if(dir ==2) {
			
			
			return "우회전";
			
		} else {
			
			return "직진";
			
		} // if-else if-else 
		
	} //direction
	
} // end class
