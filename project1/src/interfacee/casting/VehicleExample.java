// 2022.03.22

package interfacee.casting;


public class VehicleExample {
	

	public static void main(String[] args) {
		
		Vehicle vehicle = new Bus();		// 다형성-1 : 부모품에 안기면 자식이 안보임! 
											//부모타입에 선언된 멤버만 쓸 수 있음!
		

		vehicle.run();						// 다형성-2 :  오버라이딩
//		vehicle.checkFare(); (x)			// 왜 이건 오류가 남?
		//Vehicle 이 클래스에는 checkFare 이 메소드가 없다!

		
//		-- checkFare 호출해야할때!--
		
//		Bus bus = (Bus) vehicle;  //-> 자식객체 끄집어내야한다! : 강제타입형변환
//		: 이렇게 하면 안전하지 않다!
		
//		bus.run();				// 다형성-2		
//		bus.checkFare();		// 이건 구현객체가 가지고있는 메소드이다!
		
//--------------------	안전하게 하려면? -------------------	
		
		if(vehicle instanceof Bus bus) {	// 안전하게 하려면 이것도 넣어줘야함
			
			bus.run();				// 다형성-2가 아님! 그냥 호출임		
			bus.checkFare();
			
		} // if
		

	} // main
	
} // end class
