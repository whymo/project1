//2022.03.21


package interfacee.name_implement_class;


//# 2.
public class Television implements RemoteControl {
	
	//1. 인스턴스 필드
	private int volume;
	
	//	=============인터페이스의 규격을 구현(재정의)===============
//	메소드 재정의할때 어노테이션을 꼭 붙여라!! -> @Override : 생략하지마라!!!!
	
	//2. turnOn() 추상 메소드의 실체 메소드
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}	// turnOn
	
	//2. turnOff() 추상 메소드의 실체 메소드
	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	} // turnOff
	
	//2. setVolume() 추상 메소드의 실체 메소드
	@Override
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if(volume<RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}//if-else
		
		System.out.println("현재 TV 볼륨: " + volume);
	} //setVolume
	
} // end class
