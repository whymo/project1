package homeworksBicycle;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class BicycleExample {
	
	public static void main(String[] args) {
					
		Bicycle bicycle = new Bicycle();
		
//		1. 프레임 출력
		System.out.println("============================================");
		bicycle.frame1();
		
//		2. 날씨에 적합한 휠 지정
		
		bicycle.weatherCoice();
		System.out.println("============================================");
		
//		3. 안장 선택
		bicycle.seatChoice();
		System.out.println("============================================");
		
//		4. 타이어 교체
		
		for ( int i = 0; i <= 10; i ++) {
			
			bicycle.pedalSpeed();
			System.out.println("============================================");
			
			int problemlocation = bicycle.run();
			
			switch( problemlocation ) {
			
			case 1 :
				System.out.println("앞 바퀴 JavaTire로 교체");
				bicycle.frontTire = new JavaTire(15, "앞쪽 타이어");
				break;
				
			case 2 :
				System.out.println("뒷 바퀴 JavaTire로 교체");
				bicycle.backTire = new JavaTire ( 10,"뒤쪽 타이어");
				break;
			
			}// switch
			
			bicycle.direction1();
			
			System.out.println("============================================");
			
		} // for
		
		
	} // main

} // end class
