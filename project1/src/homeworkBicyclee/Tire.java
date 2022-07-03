package homeworkBicyclee;

public interface Tire {

//	1. 상수
	
	public static final int MAX_ROTATION = 10;				// 회전수
	public static final String FRONT_TIRE = "앞바퀴";
	public static final String BACK_TIRE = "뒷바퀴";
	
//	2. 추상메소드
	
	public abstract void Rotation();
	
} // end interface
