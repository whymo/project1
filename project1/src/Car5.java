//2022.03.11


public class Car5 {
	
	// 1. 인스턴스 필드
	String model;
	int speed;
	
	//2. 생성자 : 인스턴스 필드의 초기화를 담당
	Car5(String model) {
		
		this.model = model;
	} // constructor
	

	// 위에 인스턴스 필드 바꿀때 set이 들어감 => 세터(Setter) 메소드
	//3. 인스턴스 메소드
	void setSpeed(int speed) {	// 메소드 이름 = 'set' + 필드이름 => 소문자 + 카멜기법으로 지음
		
		this.speed = speed;
	} // setSpeed
	

	//4. 인스턴스 메소드 => 스피드 값을 호출자에 되돌려주는
	int getSpeed() {	// 메소드 이름 = 'get' + 필드이름 => 게터 (Getter) 메소드
		
		return this.speed;
		
	}// getSpeed

	
	//웹 만들때는 인스턴스 필드마다 게터세터 메소드는 하나씩 들어감
	
	
	//4. 인스턴스 메소드
	void run() {
		for(int i=10; i<=50; i+=10) {
			
			this.setSpeed(i);
			System.out.println(this.model + "가 달립니다.(시속 : " + this.speed + "km/h)");
		} // for
		
	} // run

} //end class
