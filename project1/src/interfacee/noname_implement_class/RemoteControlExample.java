//2022.03.21

package interfacee.noname_implement_class;

public class RemoteControlExample {
	
	
	public static void main(String[] args) {
	
//		--------------다형성 1 ----------------------
		
		RemoteControl rc = new RemoteControl() {		// 호출됐는데 객체 구현 클래스 이름이 뭔지 모름

			// 접근제한자도 동일하게 가능
			private String name = "yoyo";
			private int age = 23;
			
			private void instanceMethod() {
				System.out.println("instanceMethod() invoked.");
			} //instanceMethod
			
//			-- 추상 메소드들
			
			@Override
			public void turnOn() {
				System.out.println("turnOn() invoked.name : " + name);
				
				System.out.println("turnOn() invoked.name : " + this.name);
				
				this.instanceMethod();
				instanceMethod();
			} // turnOn

			@Override
			public void turnOff() {
				System.out.println("turnOff() invoked.age : " + age);
				
				System.out.println("\t + this : " + this); //=>$1@2f92e0f4 이렇게 출력됨! $1 -> 익명구현객체 자신이다!
			} //turnOff

			@Override
			public void setVolume(int volume) {
				System.out.println("setVolume() invoked.");
			} // setVolume
			
			
		}; // 익명구현객체 생성
		
		
//		---------------------다형성 2-----------------
		rc.turnOn();		// 
		rc.turnOff();
		rc.setVolume(RemoteControl.MAX_VOLUME);
		
		System.out.println("rc : " + rc);
//		$1 => 자바가 만들어준 익명구현객체 클래스 이름
		
		
		// 익명구현객체선언시 내부에 선언한 추가적인 필드와 메소드는 참조변수명.필드/메소드 식으로
		// 사용불가! => 오로지 익명구현객체 블록 내부에서만 사용하라!
//		System.out.println(rc.name);
//		rc.instanceMethod();
		
//		------------------------------
		
//		RemoteControl rc = new RemoteControl() {
//			public void turnOn() { ;; }	
//			public void turnOff() { ;;}
//			public void setVolume(int volume) { ;;}
//		};
		
	} // main
	
} // end class
