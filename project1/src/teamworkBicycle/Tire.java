package teamworkBicycle;


public interface Tire {
	
//	1. 상수
	public static final String FRONT_TIRE = "앞바퀴";
	public static final String BACK_TIRE = "뒷바퀴";
	
//	2. 추상메소드
	public abstract void exchange();		// 타이어 펑크
	
}// end interface
