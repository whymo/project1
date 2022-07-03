package homeworksBicycle;

public class JavaTire extends Tire {
	
	// 1. 필드
	
	// 2. 생성자
	
	public JavaTire ( int Mileage, String location ) {
		
		super(Mileage,location);
		
	} // constructor
	
	// 3. 메소드
	
	@Override
	public boolean roll ( ) {
		
		++ accumulatedRotation;
		
		if ( accumulatedRotation < Mileage) { 
			
			System.out.println(location + " Java Tire 수명 : " + ( Mileage - accumulatedRotation ) + "회");
			
			return true;
			
		} else { 
			
			System.out.println("***" + location + "Tire 펑크 ***");
			
			return false;
			
		}// if - else
		
	} // roll

} // end class
