package homeworksBicycle;

public class Seat {
	
	// 1. 고유필드
	public int size; // 안장의 크기
	
	// 2. 상태 필드
	public String user; // 이용자의 성별
	public String material; // 안장의 재료
	public String model; // 모델명
	
	// 3. 생성자
	public Seat ( String user, int size, String material, String model ) { 
		this.user = user;
		this.size = size;
		this.material = material;
		this.model = model;
	} // constructor
	
	// 4. 메소드
	
	public String SeatType ( ) { 
		
		System.out.println("자전거의 이용자의 성별은 " + user + "입니다.");
		System.out.println("이용자에게 적합한 안장의 모델은 " + model + "이며, "
				+ "사이즈는 " + size + "이고, 재료는 " + material + "로 이루어져 있습니다.");
		
		return "SeatType";
		
	} // seatType method

} // end class
