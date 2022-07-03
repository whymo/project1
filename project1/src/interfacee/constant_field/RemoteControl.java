//2022.3.21

package interfacee.constant_field;


//# 2. 인터페이스에 선언할 수 있는 첫번째 멤버로, static final 상수 선언! 볼륨 만들기
public interface RemoteControl {
	
//	final int MIN_VOLUME = 0; 이것도 됨! 왜??
//  =>public static final 이거 생략하면 자바 컴파일러가 넣어둠!
//	자바 컴파일러가 자동으로 도와주는거 의존하지 마라!!

	// 객체는 생성할 수 없되, 상수는 선언할 수 있게! 대신 인터페이스는 진리값을 선언 x
	public static final int MAX_VOLUME = 10;		// 상수명은 대문자, 복합단어면 _ (언더스코어)
	public static final int MIN_VOLUME = 0;
	
} // end interface
