package homeworksBicycle;


public class CarbonWheel extends Wheel {	
	
	// 1. 생성자
	
	public CarbonWheel (int inch, String WheelType, String color ) {
		super(inch,WheelType,color );
	} // 부모 생성자
	
	//  2. 메소드
	
	@Override
	public String WheelType ( ) {
		System.out.println("이 휠의 타입은 " + WheelType + "이며, 휠의 사이즈는 " + inch + "이고 휠의 색상은" + color + "입니다.");
		return "WheelType";
	} // WheelType method

} // end class