//2022.03.14
//2022.03.15

package org.zerock.  myapp.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// 열거상수 주려고 하면
//ElementType temp = ElementType.TYPE;

// 어노테이션 값을 줘야함 근데 왜 줘야해? **
// 값 부여해줘야함, 배열 값의 목록을 줄때 {} (중괄호)
//@Target(value= {ElementType.TYPE})		// 어노테이션을 TYPE 선언부에만 붙일 수 있다! 
//@Target(value= {ElementType.TYPE, ElementType.FIELD})		// type이랑 field 붙이는거 허용!

// 열거타입명.상수명
@Retention(RetentionPolicy.RUNTIME)	// 유지 정책 : 실행시점에도 보일 수 있게 runtime으로 지정!
//엘리먼트 상속
@Target(value= {
		ElementType.TYPE, 			// 타입 , 인터페이스
		ElementType.FIELD,			// 필드
		ElementType.METHOD,			// 메소드
		ElementType.PARAMETER,		// 매개변수
		ElementType.LOCAL_VARIABLE,	// 지역변수
		ElementType.CONSTRUCTOR,	// 생성자
		ElementType.PACKAGE,		// 패키지
		ElementType.ANNOTATION_TYPE // 이건 어디에 어노테이션 붙일 수 있다는 거지? => 어노테이션 선언부
//		ElementType.TYPE_USE		// 메소드, 패키지에서 오류가 난다! => 한방에 모두 다 적용하는게 아니다!
		// TYPE_USE는 완전히 한방은 아니다! 
	
})	// 배열의 마지막엔 , 이 쉼표를 찍지 않는다! -> 찍어도 오류는 안나지만, 17 이하의 버전에서는 오류가 난다!


@MyAnnotation		// ElementType.ANNOTATION_TYPE  이거 막아도 오류가 안난다! -> 자바 낮은 버전에서는 오류 남
public @interface MyAnnotation {	// 여기가 어노테이션 선언부다!!!
	
	//속성(정확히는, 엘리먼트) 선언(like field)
	// default 디폴트 값이 없이 선언된 속성은 @어노테이션 사용시 값을 줘야한다!!
	//	String value(); // -> 이게 기본 속성 문법!

	String value() default "-"; 
//	String value();
	int number() default 30;	// => 갑자기 왜 default랑 기본값이 필요할까? 필드처럼 속성에 값을 줄 수 있다!
//	int age();
	
} // end annotation
