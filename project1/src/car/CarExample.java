package car;

public class CarExample {

	public static void main(String[] args) {
		
		Car car = new Car();
		
		for(int i=1; i <= 5; i++) {	// 5번동안 반복해라
			
			int problemLocation = car.run();		// 다형성-2
			
			
		      switch(problemLocation) { 
		         
	            case 1 : // 다형성 1 - car.frontLeftTire은 Tire타입이다.
	               System.out.println("앞 왼쪽 HankookTire로 교체");
	               car.frontLeftTire = new HankookTire("앞 왼쪽",15);
	               break;
	            
	            case 2 : // 다형성 1
	               System.out.println("앞 왼쪽 HankookTire로 교체");
	               car.frontRightTire = new HankookTire("앞 오른쪽",13);
	               break;
	            
	            case 3 : // 다형성 1
	               System.out.println("뒤 왼쪽 HankookTire로 교체");
	               car.backLeftTire = new HankookTire("뒤 왼쪽",14);
	               break;
	            
	            case 4 : // 다형성 1
	               System.out.println("뒤 오른쪽 HankookTire로 교체");
	               car.backRightTire = new HankookTire("뒤 오른쪽",17);
	               break;
	         
	            } // switch

			
			
			System.out.println("--------------------------------------------------------");
			
			
		} //for
		
	} // main
	
} // end class
