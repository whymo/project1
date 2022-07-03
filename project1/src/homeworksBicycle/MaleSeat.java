package homeworksBicycle;

public class MaleSeat extends Seat {
	
	// 1. 생성자
	
	public MaleSeat ( String user, int size, String material, String model ) {
		super(user, size, material, model );
		} // 부모 생성자
	
	// 2. 메소드
	
	@Override
	public String SeatType ( ) { 
		
		System.out.println("자전거의 이용자의 성별은 " + user + "입니다.");
		System.out.println("이용자에게 적합한 안장의 모델은 " + model + "이며, "
				+ "사이즈는 " + size + "이고, 재료는 " + material + "로 이루어져 있습니다.");
		
		return "SeatType";
		
	} // 오버 라이드

} // end class
