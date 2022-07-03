// 2022.03.10


public class Car4 {
	
	int gas; 		// 필드 ==> 인스턴스 필드이가
	
	
	// 생성자
	
	// 메소드
	
	void setGas(int gas) {		// 연료주입
		this.gas = gas;
		
	} // setGas -> Gas : 휘발유
	
	boolean isLeftGas() { 		// 연료가 남아있느냐??
		
		if(gas==0) {
			System.out.println("gas가 없습니다.");
			return false;			// int 타입 변수나 리터럴이여야함? ㄴㄴ 프로모션 가능한 ex) byte 타입으로 해도 상관 ㄴㄴ 형변환 해줌
		} // if
		
		System.out.println("gas가 있습니다.");
			return true;
		} // isLeftGas  
	
	void run() {				// 달려라
		
		while(true) {				// 무한루프를 만들면, 반드시 먼저 탈출조건을 만들어라!
			
			if(gas > 0) {			// 가스가 0보다 작으면 
				System.out.println("달립니다.(gas잔량: " + gas + ")" );
				gas -=1;		// 연료를 1씩 차감해주는 코드
			} else {
				System.out.println("멈춥니다.(gas잔량:" + gas + ")");
				
				return;			// 메소드를 종료시킨다
				
			} // if-else
		
		} //while
		
	} // run

} // end class
