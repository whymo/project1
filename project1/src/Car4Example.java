// 2022.03.10

// 시나리오, 기능 구현 

public class Car4Example {
	
	public static void main(String[] args) { 
		
		// 클래스는 설계도일뿐임 
		Car4 myCar = new Car4(); //1. 인스턴스(=객체) 생성
		
		// 내가 구현해야하는 로직에 맞게 기능을 가져다 씀!
		myCar.setGas(5);		//2. car의 setGas() -> 메소드 호출 ---> 연료 5만큼 주입
		
		boolean gasState = myCar.isLeftGas();		// 3. Car의 isLeftGas() 메소드 호출
		if(gasState) {		// 남으면 달리자!
			System.out.println("출발합니다.");
			myCar.run(); // 4. Car의 run() 메소드 호출
			
		} // if
		
		// ISLEFTCAS : 가스 남아있냐? 물어봄 그 질문에 대비해서 일단 두개를 만들어 둠
		
		if(myCar.isLeftGas()) { 	// 5. Car의 isLeftGas() 메소드 호출 --> 한번 더 물어봄!
			System.out.println("gas를 주입할 필요가 없습니다."); 		// 이게 나올 수 없는 구조임 -> 시나리오를 만든거임 
		} else {
			System.out.println("gas를 주입하세요.");		// 얘만 나옴
		} // if-else
		
	} // main

} // end class
