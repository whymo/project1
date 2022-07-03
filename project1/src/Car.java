
//2022.03.08


	public class Car {
	
	// 이 클래스는 모델링 잘못 됨 -> 왜? -> 클래스 이름이 car인 이상 모델, 색깔, 멕스스피드가 같을수가 없다!
	
	//필드 - 객체의 데이터 (모델링 대상 객체의 속성의 종류와 값을 정의)
	// 업무의 필요한 속성만 빼낸다!
	
//	String company = "현대자동차"; 		// 이건 하드코딩한거임 : 변수 정의하듯 이렇게 하지 않는다
//	String model = "그랜저";
//	String color = "검정";
//	
//	int maxSpeed = 350;		// 최대속도
//	int speed = 0;				// 현재속도
	
//	-------------------------- 새로운 모델링 ----------------------------
	// 관련있는건 모아주고 관련없는건 띄워준다!
	
	// 객체의 속성만 선언한다!
	// 값 지정하지 않는다!
	// 변수가 아니라 필드여서 선언만해도 괜찮다!
	// 필드는 생성자를 통해서 초기화 된다!
	
	String company; 		
	String model;
	String color;
	
	// 필드 선언
	int maxSpeed;		
	int speed;		
	
//--------------------------	
//	// 관례상 두칸 띄워준다! / 생성자 만들기
//	public Car(){				// 클래스에 따라 public 붙, 안
//		;;
//	} // default constructor
//-----------------------
//# 매개변수 한개일 경우
	
	
	public Car(int maxSpeed){			// 매개변수 선언 -> 이 매개변수를 통해서 필드를 초기화시켜라
		this.maxSpeed = maxSpeed;				// 필드 초기화됨
	} // default constructor
	
//	-------------
	

} // end class
