//2022.3.21

package interfacee.abstract_method;


//# 3. 추상 메소드 추가!
public interface RemoteControl {		// 쓰게 만들어줘야하기 때문에 다 public 이여야 한다!!! **	
	
	//1.상수
	public static final int MAX_VOLUME = 10;
	public static final int MIN_VOLUME = 0;
	
	//2.추상 메소드 (강제규격) - 자식객체가 반드시 구현해야 할 기능을 선언!
	//public abstract 이거 생략해도 자동으로 생성해주지만 넣어라!
	public abstract void turnOn();
	public abstract void turnOff();
	public abstract void setVolume(int volume);
	
} // end interface
