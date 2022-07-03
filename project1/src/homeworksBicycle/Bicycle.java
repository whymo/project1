package homeworksBicycle;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Bicycle { // 조립
	
	// 1. 부품관계 ( 집합관계 )
	Tire frontTire = new Tire ( 15, "앞 타이어");
	Tire backTire = new Tire( 10, "뒷 타이어");
	Wheel wheel1 = new Wheel (9, "출고 휠", "노랑색");
	Seat Seat1 = new Seat ( "무성", 8, "공기", "뭘까요" );
	Frame frame = new Frame();
	Handle handle = new Handle("출발 아직 안함!");
	Pedal pedal = new Pedal ( 0 );
	
	// 2. 상태 필드
	
	// 3. 생성자
	
	// 4. 메소드
	
	int run ( ) { // 다형성 2 - 오버 라이드
		
		System.out.println(" [ 자전거가 달립니다! ] ");
		
		if ( frontTire.roll() == false ) { stop(); return 1; };
		if ( backTire.roll() == false ) { stop(); return 2; };
		
		return 0;
		
	} // run
	
	void stop ( ) {
		
		System.out.println(" [ 자전거가 멈춥니다... ] ");
		
	} // stop
	
	void weatherCoice() {
		
		int weather = (int) (Math.random()*6)+1;
		
		System.out.println("============================================");
		System.out.println("지금의 휠은 " + wheel1.WheelType + "이고, 사이즈는 " + wheel1.inch + "인치이며, 색상은 " + wheel1.color + "입니다.");
		System.out.println("============================================");
		
		if(weather<4) { 
			System.out.println("날씨 : 맑음");
			this.wheel1 = new CarbonWheel(9, "카본 휠", "검은색");
			wheel1.WheelType();
		} else { 
			System.out.println("날씨 : 흐림");
			this.wheel1 = new IronWheel(11, "아이언 휠", "은색");
			wheel1.WheelType();
			
			} // 날씨지정하는 if문 
	
	} // weatherChoice method 
	
	void seatChoice() {
		int gender = (int) (Math.random()*2)+1;
		
		if ( gender == 1) { 
			this.Seat1 = new FemaleSeat( "남성", 8, "카본", "레이싱 시트" );
			Seat1.SeatType();
		} else { 
			this.Seat1 = new MaleSeat( "여성", 8, "메모리 폼", "젤 시트" );
			Seat1.SeatType();
		} // if - else : 성별 및 안장 선택
		
	} // seatChoice
	
	void frame1 () {
		
		System.out.println("이 자전거의 몸체는 " + frame.material + "로 이루어져 있으며, 크기는 " + frame.size + "로 구성된 "
		+ frame.model + "모델입니다.");
		
	} // frame 출력 메소드
	
	void direction1 () {
		
		int dr = (int) (Math.random()*3)+1; // 회전
		int km = (int) (Math.random()*500)+100; // 몇 m 남았는지 
		
		if( dr == 1 ) { 
			System.out.print(km + "m 후 ");
			System.out.println("좌회전입니다.");
		} else if ( dr == 2) {
			System.out.print(km + "m 후 ");
			System.out.println("우회전입니다.");
		} else {
			System.out.print(km + "m 후 ");
			System.out.println("직진입니다.");
		} // if-else
		
	} // 방향 정하기 메소드
	
	void pedalSpeed() {
		
//		pedal.speed = 0;
//		
//		do {
//			pedal.speed += 7;
//			System.out.println("현재 속도는 " + pedal.speed);
//			
//		} while ( pedal.speed < 30) ;
//		
//		System.out.println("최고스피드입니다. 속도를 줄입니다...");
		
		int km = (int) (Math.random()*50)+10; // 몇 m 남았는지 
		
		System.out.println("현재 속도는 " + km + "km/h입니다.");
		
	} // 속도 정하는 메소드

} // end class
