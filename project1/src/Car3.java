
//2022.03.08

public class Car3 {
	
	//필드
	String company; 		
	String model;
	String color;
	
	// 필드 선언
	int maxSpeed;		
	int speed;	
	
//---------------------------------------------------------------
	
	// 중요 : 생성자 오버로딩 (Constructor Overloading) --> 다중정의라고 생각해라!!
	// 원칙 : 각 생성자의 매개변수의 개수/순서/타입이 달라야함!!!
	// 목적 : 오버로딩을 통해서 모든 필드, 부분 필드를 초기화해서 목적에 맞게 쓰기 위해
//	== > 이렇게 객체를 생성할 필요가 있다!!
//	---> 근데 이렇게 하면 중복코드가 발생한다! (동반되는 부작용)

	
	// # 생성자
	
//	Car3() {
//		
//		;;
//	} // 기본 생성자 -> 아무것도 초기화 못함
//	
//	Car3(String model) {
//		this.model = model;
//	} // 생성자1	-> 모델만 초기화 시킴
//	
//	Car3(String model,String color) {
//		this.model = model;
//		this.color = color;
//	} // 생성자2 	-> 모델, 컬러만 초기화 시킴
//	
//	Car3(String model,String color,int maxSpeed) {
//		this.model = model;
//		this.color = color;
//		this.maxSpeed = maxSpeed;
//	} // 생성자3	-> 모델, 컬러, 맥스스피드 모두 초기화 시킴
	
//	=> 중복코드--------------------------------------
//
//	Car3() {
//		;;
//	} // 기본 생성자 -> 아무것도 초기화 못함
//	
//	Car3(String model) {
//		
//		// this 키워드의 2번째 용법 :
////			this() 문법을 통해, 다른 생성자를 호출하는 기능
//		
//		this(model, null, 0);			// 생성자 3 호출
//										// 임의대로 값을 지정한 0이 잘못되었다
//	} // 생성자1
//	
//	Car3(String model,String color) {
//		this(model, color, 0);
//	} // 생성자2 
//	
//	Car3(String model,String color,int maxSpeed) {
//		this.model = model;
//		this.color = color;
//		this.maxSpeed = maxSpeed;
//	} // 생성자3	
	
//	==> maxSpeed 값을 임의 0으로 생성해버렸다 (부작용)
	
//	-----------------------------------
	
	Car3() {
		this(null); 	// 아래의 매개변수 하나를 호출할거임 참조타입의 string이니까 null을 넣어주기
	} // 기본 생성자 
	
	Car3(String model) {
		
		this(model, null);			// 생성자2 호출 / String이니까 null
										
	} // 생성자1
	
	Car3(String model,String color) {
		this(model, color, 0);		// 생성자3 호출 / int니까 0
	} // 생성자2 
	
	Car3(String model,String color,int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	} // 생성자3
	
	
//	===> 모든 필드를 초기화해주는건 생성자3에 있다
	

	
	
} //end class
