//2022.03.21

package interfacee.name_implement_class;

//# 4.
public interface RemoteControl {
	//1. 상수
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//2. 추상 메소드
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	//3. 디폴트 메소드
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다.");
		} else {
			System.out.println("무음 해제합니다.");
		}
	} // setMute
	
	//4.정적 메소드
	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
	
} // end interface
