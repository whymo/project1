package teamworkBicycle;


public class RacingSeat implements Seat{

	
	@Override
	public void heightControl() {			// RacingSeat의 높이 조절
		
		int seatHeight = 10;
		System.out.println("레이싱 시트의 최고 조절 높이는" + seatHeight + "입니다.");
	
	}// heightControl

}// end class
