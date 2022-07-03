//2022.3.21s

package abstractclasss;


public class PhoneExample {
	
	public static void main(String[] args) {
		// 추상 클래스로부터, 객체를 직접 생성할 수 없음!
		// 왜? 추상이니까 실체가 아니니까!
//		Phone phone = new Phone(); (x) => 직접 객체 생성될때 오류가 난다!
		
		// 1. 자식 객체 생성
		SmartPhone smartPhone = new SmartPhone("홍길동");
		
		// 2. 부모(추상클래스)로부터 물려받은 메소드 호출
		smartPhone.turnOn();
		smartPhone.internetSearch(); // 자식객체만이 가지고 있는 메소드 호출
		smartPhone.turnOff();
	} // main
	
} // end class
