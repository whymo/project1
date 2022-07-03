// 2022.03.22

package interfacee.method_polymorphism;


public class DriverExample {
	
	public static void main(String[] args) {
		
		Driver driver = new Driver();	// 운전자 객체 만듬
		
		Bus bus = new Bus();			//  버스 객체 만듬
		Taxi taxi = new Taxi();			// 택시 객체 만듬 -> 다형성-1 전혀 아님 걍 클래스에서 찍어냄
		
//		# 사용관계
//		--------------------------------------
//		# 다형성
		
		driver.drive(bus);		//인터페이스타입 -> Vehicle 이것밖에 안보인다 -> vehicle.run(); 이거 호출?
		driver.drive(taxi);
		
	} // main
	
} // end class
