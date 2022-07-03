//2022.04.05

package ioio.exam08_objectinputstream_objectoutputstream;

import java.io.Serializable;

import lombok.NoArgsConstructor;

//	# 생성자 없음 -> 롬복으로
@NoArgsConstructor		// 생성자
public class ClassC implements Serializable {
	
	// 직렬화할 필요가 있는 클래스를 선언할 때에는,
	// 자바컴파일러에게 자동추가를 맡기지 말고, 개발자가 직접 필드와 초기값을 지정하자!
	// 왜? 유연성을 이용할 수 있으니까
	// uid 값은 정수값으로 해줘야한다!! -> 아무값이나 된다!
	private static final long serialVersionUID = 7777777L;		// 직접 넣어줘야함 자바 컴파일러에 의존 ㄴㄴ
	// 시리얼 번호가 같으면 클래스가 같다고 생각함!
	
//	int field1;
	
	// 객체의 직렬화 이후에, 새로운 필드 추가 -> Compile -> serialVersionUID 값이 

	int field2;
	
} // end class
