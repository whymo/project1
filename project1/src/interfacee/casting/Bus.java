// 2022.03.22

package interfacee.casting;


public class Bus implements Vehicle {
	
//	------------------추상메소드 오버라이딩-----------
	
	@Override
	public void run() {
		System.out.println("Bus::run() invoked.");
	} // run
	
	public void checkFare() {	// 버스 클래스 고유 기능
		System.out.println("Bus::checkFare() invoked."); // 승차요금을 체크합니다.
	} // checkfare
	
} // class
