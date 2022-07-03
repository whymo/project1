//2022.03.21

//#2.
package interfacee.multi_implement_class;

// 다중 인터페이스를 구현하는 구현클래스 선언
public class SmartTelevision 
	implements RemoteControl, Searchable {
	
	private int volume;
	
	
//	---------------------추상 메소드 선언---------------
	
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	} //turnOn
	
	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	} //turnOff
	
	@Override
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if(volume<RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		} // if-else if elsd
		
		System.out.println("현재 TV 볼륨: " + volume);
	}  //setVolume
	
	//두번째 인터페이스인,  Searchable에 선언된 추상메소드의 재정의
	@Override
	public void search(String url) {
		System.out.println(url + "을 검색합니다.");
	} //search
	
} // end class
