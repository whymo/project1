//2022.03.14
//2022.03.15

//@MyAnnotation	// 컴파일 ㄴ오류! 패키지 위에는 안된다!
package org.zerock.myapp.annotation;

// 선언부에 붙일지 필드에 붙일지 생성자에 붙일지 어디에 어노테이션 붙일지 정할 수 있게 되어있다!
// 따로 정하지 않으면 모든 부분에 다 붙일 수 있다! -> 하지만 이렇게 쓰지 않는다!

@MyAnnotation
public class Service {

//	@MyAnnotation		// 기본값이 설정되어있지 않은 (ex : int number();) 어노테이션 사용시,
						// 값을 줘야지 오류가 나지 않는다!
	
//	1. 실험 값을 넣어보자!
//	@MyAnnotation(value = "hello", number = 100) // 속성의 이름 + 속성의 타입에 맞는 값
	
//	2. 실험 순서를 바꿔보자!
//	@MyAnnotation(number = 100, value = "hello")	// ok
	
//	@MyAnnotation(value = "hello")		// number은 기본값이 있으니까 

//	3. value 생략해보자!
//	@MyAnnotation("hello")		// ok
	
//  4. 초기화할 값이 두개 이상이면 (이름 = 값) 으로 해줘야한다!! -> 이름 생략 못한다!!
//	@MyAnnotation(value = "hello", age = 23)
	
//------------------------------------------------------------------
	
	@MyAnnotation
	public String instanceField;		//instance Field
	
	@MyAnnotation
	private static int  staticField;	// static Field
	
	@MyAnnotation
	public Service(@MyAnnotation String instanceField, @MyAnnotation final int age) {	// 자바 컴파일러가 만드는 기본 생성자
		;;								// 위에 인스턴스 필드 초기화 하라
	}// default constructor
	
	
//	@MyAnnotation						// ** 여기에는 붙일수가 없음!!
	static {
		;;				
	} // static initializer	-> 버츄얼 머신 구동될때 클레스 로더가 로딩한 클래쯔 객체에 ~ 딱한번 자동호출하는
	
	
	@MyAnnotation
	private static final double PI = 3.14159;	// 진리(불변)의 상수
	
	@MyAnnotation			// 어노테이션에 다 기본값이 있기 때문에 오류가 안난다!
	public void instanceMethod(@MyAnnotation int age) {	// 매개변수에도 붙일 수 있다
		System.out.println("Service :: instanceMethod(age) invoked");
		@MyAnnotation
		int temp;			// 지역변수 => 변수 사용하지도 않고 선언해서 노란줄 워닝
		
	}		// instanceMethod
	
	@MyAnnotation
	public static void staticMethod() {;;}	// staticMethod
	
} // end class
