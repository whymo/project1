// 2022.03.22

package interfacee.default_method_use;


public class RemoteControlExample {
	
	
	public static void main(String[] args) {
		
		RemoteControl rc = null;		// 부모타입
		
		rc = new Television();	// 다형성-1
		
		rc.turnOn(); 	// 다형성-2
		rc.setMute(true);  // 다형성-2
		
//		-----------------
		
		rc = new Audio();		// 다형성-2
		
		
		rc.turnOn(); 	// 다형성-2
		rc.setMute(true);  // 다형성-2
//		
		//처음 보는 타입의 객체는 출력해보면 의외로 얻는 정보다 많다!!
		
	} // main
	
} // end class
