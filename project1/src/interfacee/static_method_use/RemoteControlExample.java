//2022.03.22

package interfacee.static_method_use;


public class RemoteControlExample {
	
	public static void main(String[] args) {
		RemoteControl.changeBattery();			// 인터페이스에 선언된 static  메소드 호출
		
		System.out.println(RemoteControl.MAX_VOLUME); // 인터페이스에 선언된 static final 상수 사용(호출 불가)
	} // main
} // end class
