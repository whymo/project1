//2022.03.21

package interfacee.name_implement_class;


//# 3.
public class RemoteControlExample {
	
	
	public static void main(String[] args) {
		
		RemoteControl rc;		// 부모타입
		
		rc = new Television();	// 다형성-1
		System.out.println("rc1 : " + rc);
		
		rc.turnOn(); 	// 다형성-2
		rc.turnOff();  // 다형성-2
		
		rc = new Audio();		// 다형성-2
		System.out.println("rc2 : " + rc);
		
		rc.turnOn(); 	// 다형성-2
		rc.turnOff();  // 다형성-2
		
		//처음 보는 타입의 객체는 출력해보면 의외로 얻는 정보다 많다!!
		
	} // main
	
} // end class
