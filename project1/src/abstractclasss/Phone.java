//2022.3.21

package abstractclasss;

//#부모객체가 먼저 생성되어야 한다!
public abstract class Phone {	// 이 클래스로부터 객체를 생성할 수가 없다!!
	
	//1. 공통 필드
	public String owner;	// 소유자
	
	//2. 생성자
	public Phone(String owner) {
		this.owner = owner;
	} // constructor
	
	//3. 공통 메소드
	public void turnOn() {
		System.out.println("폰 전원을 켭니다.");
	}	// turnOn method
	
	// 4. 공통 메소드
	public void turnOff() {
		System.out.println("폰 전원을 끕니다.");
	} // turnOff method
	
	
} //end class
