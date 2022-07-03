package teamworkBicycle;


//#완성 자전거
public class Bicycle {
	
	
//	1. 고유속성
	static String company = "자바칩회사" ; 			//회사	
	static String model = "따릉이";					//모델명
	static int weight = 10;							// 무게
	 
	
//	2. 상태필드
	boolean brake; 									// 브레이크
	
	
//	3. 부품 _ 끼워넣기 // # 인터페이스로 규격 기능을 만든다
	Pedal pedal = new RacingPedal();		// 다형성-1 (부모 타입으로 형변환)			
	Seat seat = new RacingSeat();
	Tire tire = new HankookTire();
	Wheel wheel = new RacingWheel();		
	Handle handle = new RacingHandle();
	Frame frame = new Frame();
	
//	3. 메소드
	
	void run() {									// 움직임 - 스피드, 회전력					
		
		
		if (pedal.run()>0) {
			
			wheel.roll();
			
			System.out.println("자전거가 주행중입니다.");
			
		} //if

	} //run
	
	
	void direction() {								// 방향
		
		handle.direction();						// -> 자전거 객체가 아니라 핸들이 해야하는일 -> 그래서 wheel.direction(); 이런건 핸들에서 해야함 
		wheel.direction();
		
		System.out.println(wheel.direction());
	
	} //direction
	
	
	void heightControl() {							// 시트 높이 조절
		
		seat.heightControl();
		
	} // heightControl
	
	
	void frame() {									// 프레임 속성
		
		System.out.println("이 자전거의 사이즈는 " + frame.size  + "입니다." + 
							"프레임의 소재는 " + frame.material + "로 이루어져 있습니다." +
							" 프레임의 모델은 " + frame.model + "입니다.");
	} // frame
	

	
	void puncture() {								// 타이어 펑크
		
		int dir = (int)(Math.random()* 8 + 1);		// 이벤트 설정 -> 하드코딩된 숫자는 만든사람 외 알기 힘들다! 
													// 그래서 static fianl 하던가 열거상수로 숫자를 정해놓는다
		
		if(dir == 1) {		// 1이 무엇을 의미?
			
			System.out.println("주행 도중 돌부리에 걸려 넘어졌습니다.");
			
			this.brake = false;							// 브레이크 잡기
			
			System.out.println("브레이크를 잡았습니다.");
			
			tire.exchange();								// 타이어 교체 -> roll 수정해야함 roll은 굴러가다 뜻
			
		} // if
		
	} //puncture
	

}// end class
