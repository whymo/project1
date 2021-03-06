// 2022.03.22

package interfacee.default_method_use;


import lombok.ToString;

@ToString			//=>rc2 : Audio(volume=0) 이런식으로 심플네임 : 필드값이 보기쉽게 나온다
public class Audio implements RemoteControl {
	
	//1. 인스턴스 필드
	private int volume;
	
//	=============인터페이스의 규격을 구현(재정의)===============
//	메소드 재정의할때 어노테이션을 꼭 붙여라!! -> @Override : 생략하지마라!!!!
	
	//2. turnOn() 추상 메소드의 실체 메소드
	@Override
	public void turnOn() {
		System.out.println("Audio를 켭니다.");
	}//turnOn
	
	//2.turnOff() 추상 메소드의 실체 메소드
	@Override
	public void turnOff() {
		System.out.println("Audio를 끕니다.");
	} //turnOff
	
	//2. setVolume() 추상 메소드의 실체 메소드
	@Override
	public void setVolume(int volume) {
		
		//인터페이스에 선언된 static final 상수의 활용
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if(volume<RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		} // if-else
		
		System.out.println("현재 Audio 볼륨: " + volume);
		
	}


	
//	---------default 메소드 재정의-------
	
	@Override
	public void setMute(boolean mute) {
		
		System.out.println("Audio:: setMute invoked.");
		
	} //setMute
	
	// 정적메소드의 오버라이딩이란 개념은 없다!! -> 모든 정적멤버는 그 소속이 clazz 객체이기 때문에!
//	@Override
//	static void changeBattery() {
//		
//		System.out.println("Audio::changeBattery() invoked.");
//		
//	} // changeBattery
	
} // end class
