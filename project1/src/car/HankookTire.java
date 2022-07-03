package car;

public class HankookTire extends Tire {
	//1. 필드
	
	
	//2. 생성자
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);	// 부모객체의 완전한 초기화 수행
	} // Constructor

//	3. 메소드
	@Override
	public boolean roll() {
		++accumlatedRotation;
		
		if(accumlatedRotation < maxRotation) {
			
			System.out.println(
					location + "HankookTire 수명 : " + 
			(maxRotation-accumlatedRotation) + "회");
			
			return true;
			
		} else {
			System.out.println("***" + location + "HankookTire 펑크 ***");
			
			return false;
			
		} // if-else
	} // roll
	
} // end class
