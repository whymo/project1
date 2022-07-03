package car;

public class Tire {
	
	public int maxRotation;	// 최대회전수(최대수명) 
	public String location; // 타이어위치
	
	//2. 상태 필드
	public int accumlatedRotation;	// 누적회전수
	
	// 3. 생성자
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
		
	} // Constructor
	
	//4. 메소드
	public boolean roll() {
		++accumlatedRotation;
		
		if(accumlatedRotation < maxRotation) {
			
			System.out.println(location + "Tire 수명 : " + (maxRotation-accumlatedRotation) + "회");
			
			return true;
			
		} else {
			System.out.println("***" + location + "Tire 펑크 ***");
			
			return false;
			
		} // if-else
		
	} // roll

	
} // end class
