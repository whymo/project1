
//2022.03.08
//2022.03.10 -> 정적멤버, 인스턴스멤버 구분

//# 과제 4

// 정적멤버인지 인스턴스멤버인지 구분해야한다!
// 생성자는 static 붙이지 않는다!
// 자바 소스 파일당 class 파일 하나만 생성하기!


public class Bicycle {

	
	// static 부분 하드코딩했음
	// 고유 데이터 속성 : 제작회사, 모델, 색, 무게
	static String company = "(주)자바칩회사" ; 		//회사	
	static String model = "00모델";		//모델명
	static int gear1 = 5;			//기어 5
	static int weight = 10;			// 무게
	
	 String color;		//색
	 int number; 		// 시리얼번호
	
	
	// 상태 행위 : 전진, 후진, 브레이크, 기어변경 
	int speed;			// 속도
	String direction;  //방향
	boolean brake; 		// 브레이크 (잡고, 안잡고)
	int gear2;		//기어 단계 1~5단계
	
	
	//자전거 부품
	// 부품마다 고유 데이터, 상태, 부품
	// string으로 뽑을 수가 없다
	
	String seat;
	String handle;
	String lever; 	//브레이크 잡는 래버
	String frame;
	String gear;
	String pedal;
	String wheel;
	String chain;
	String tire;
	
	
	
	
//	----- 고유데이터 생성자
	
//	Bicycle (String company, String model, String color, int weight, int number) {
//		
//		this.company = company;
//		this.model = model;
//		this.color = color;
//		this.weight = weight;
//		this.number = number;
		
//	} // 기본생성자 - 고유데이터 -(수정 전)
	
//	------------------------------------
	
	Bicycle (String color, int number) {
		
	
		this.color = color;
		this.number = number;
		
	} // 기본생성자 - 고유데이터

	
	Bicycle (int seed, String direction, boolean brake, int gear2) {	// 4개
		
		this.speed = speed;
		this.direction = direction;
		this.brake = brake;
		this.gear2 = gear2;

	} // 기본생성자 - 상태
	
	
	Bicycle (String seat, String handle, String lever, String frame, String gear, String pedal, String wheel, String chain, String tire ) {	// 
		
		this.seat= seat;
		this.handle = handle;
		this.lever = lever;
		this.frame = frame;
		this.gear = gear;
		this.pedal = pedal;
		this.wheel = wheel;
		this.chain = chain;
		this.tire = tire;
	
	} // 기본 생성자 - 부품
	
	// 부품 - 집합관계라고 해서 생성자로 초기화시키지 못하는것은 아니다.
	// 생성자를 통해서 초기화 시켜줘야한다. 하지만 부품 관계 다형성을 배우지 못해서 이게 한계이다!

} // end class
