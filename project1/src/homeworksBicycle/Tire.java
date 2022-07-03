package homeworksBicycle;

public class Tire {
	
	// 1. 고유필드
	public int Mileage; // 바퀴의 수명
	public String location; // 바퀴의 위치
	
	// 2. 상태 필드
	public int accumulatedRotation; // 누적 회전 수
	
	// 3. 생성자
	
	public Tire ( int Mileage, String location ) { 
		this.Mileage = Mileage;
		this.location = location;
	} // 생성자
	
	// 4. 메소드
	
	public boolean roll () {
		
		accumulatedRotation ++;
		
		if ( Mileage < accumulatedRotation ){
			
			System.out.println(location + " Tire 수명 : " + ( Mileage - accumulatedRotation ) + "회");
			
			return true; } else {
				
				System.out.println("***" + location + "Tire 펑크 ***");
				
				return false;} // if - else
		
			} // method
	
} // end class
