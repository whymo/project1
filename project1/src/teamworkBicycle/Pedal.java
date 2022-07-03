package teamworkBicycle;


public interface Pedal  {	// 인터페이스 이름으로 IPedal
	
//	1. 상수
	public static final int MAX_ROTATION = 30;			// 최대 회전력
	public static final int MIN_ROTATION = 0; 			// 최소 회전력
	
//	2. 추상 메소드
	public abstract int run();							// 페달의 회전력
	
}// end interface
