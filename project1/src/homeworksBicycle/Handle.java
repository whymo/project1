package homeworksBicycle;

public class Handle {
	
	// 1. 고유 필드
	
	// 2. 상태 필드
	public String direction; // 우회전인지 좌회전인지
	
	// 3. 생성자
	
	public Handle ( String direction ) {
		this.direction = direction;
	} // 생성자
	
	// 4. 메소드
	
	public String DirectionMethod ( ) {
		
		if ( direction == "좌회전" ) { 
			return "좌회전을 했습니다.";
		} else if( direction == "우회전" ) {
			return "우회전을 했습니다.";
		} else { 
			return "직진입니다.";
		} // if-else
		
	} // direction method
	

} // end class
