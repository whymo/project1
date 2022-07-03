//2022.03.11

public class Car6 {
	
	int speed;		//instance field
	
	void run() {
		
		System.out.println(speed + "으로 달립니다.");
		
	} //run
	
	public static void main(String[] args) {
		Car6 myCar = new Car6();		// 인스턴스필드 호출위해 객체 생성
		
		myCar.speed = 60;
		myCar.run();
		
	} // main

} //end class
