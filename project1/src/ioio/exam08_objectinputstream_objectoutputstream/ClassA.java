//2022.04.05

package ioio.exam08_objectinputstream_objectoutputstream;

import java.io.Serializable;

import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@NoArgsConstructor
public class ClassA implements Serializable {
	
	int field1;
	
	// 집합(부품)관계 필드
	// 이 클래스 역시 Serializable 함
	ClassB field2 = new ClassB();	
	
//	static int field3;			// 정적 필드도 직렬화에 포함될까? => 답 : 안됨! => 왜? static 해서! 
//									=> 정적필드는 clazz 객체 소속임. 힙 영역 소속이 아니다! 
//										직렬화 해주는 객체는 메소드 영역의 clazz 객체가 아니다!
	
	// 값 안주면(초기화하지 않으면) 기본값 0이 들어감
	// 얘가 만들어질때 값을 줘야함!(메소드 영역에 꽂히기 전에!)
	// 이 초기화된 값이 clazz 객체 소속으로 계속 유지됨!!
	static int field3 = 1000;	// 직접 값을 부여 // 컴파일하면 정적 필드 안에서 초기화하는걸로 바뀐다!
	
//	-----------컴파일시, 이니셜라이저에서 수행하도록 바꿈-----------
//	static {
//		
//		field3 = 1000;
//	}
//	-----------------------
	
	transient int field4;		// transient 직렬화 제외
	
} // end class
