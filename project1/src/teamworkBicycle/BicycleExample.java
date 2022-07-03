package teamworkBicycle;


public class BicycleExample {
	
	public static void main(String[] args) {
		
		
//		1. 객체생성
		Bicycle bicycle = new Bicycle();
	
		
//		2. 자전거의 고유 속성
		System.out.println("이 모델은 " + bicycle.company + "의 자전거 입니다.");
		System.out.println("이 모델은 " + bicycle.model + " 입니다.");
		System.out.println("이 모델의 무게는 " + bicycle.weight + "kg 입니다.");
		
		
//		3. 자전거의 프레임 속성
		bicycle.frame();
		
		
//		4. 자전거 안장 높이 조절
		bicycle.heightControl();		
	
		
//		5. 주행 시나리오
		for ( int i = 1; i <= 10; i ++) {
			
					System.out.println("[" + i + "]");				// 회차
					
					System.out.println("============================================");
					
					bicycle.run();									// 스피드
					
					System.out.println("============================================");
	
				
					int m = (int) (Math.random()*500)+100; 			// 몇 m 남았는지 
					
					System.out.print(m + " m 후에 ");
					
					bicycle.direction();							// 방향
					
					System.out.println("============================================");
					
					bicycle.puncture();								// 타이어 펑크 이벤트 발생
					
					System.out.println("============================================");

				} // for

	} // main

} // end class
