package homeworksBicycle;

public class Wheel { // 카본휠, 스틸 휠, 휠의 종류에 따라서 다르게
	
	// 1. 고유필드
	public int inch; // 휠의 인치(사이즈)
	
	// 2. 상태 필드
	public String WheelType; // 어떤 타입의 휠인지
	public String color; // 휠의 색상
	
	// 3. 생성자
	
	public Wheel ( int inch, String WheelType, String color ) { 
		this.inch = inch;
		this.WheelType = WheelType;
		this.color = color;
	} // constructor
	
	// 4. 메소드
	
	public String WheelType ( ) {
		System.out.println("이 휠의 타입은 " + WheelType + "이며, 휠의 사이즈는 " + inch + "이고 휠의 색상은" + color);
		return "WheelType";
	} // WheelType method

} // end class
