package teamworkBicycle;


public class NormalSeat implements Seat {

	
	@Override
	public void heightControl() {			// NormalSeat의 안장 높이
		
		int seatHeight = 5;
		System.out.println("노말시트의 최고 조절 높이는" + seatHeight + "입니다.");
	
	}// heightControl

}// end class
