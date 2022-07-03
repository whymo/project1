//2022.03.11


// 아래의 클래스는, 소위 `Singleton Design Pattern`에 의해 설계된 클래스 입니다.
// 목적: 자바 APP이 살아있는 동안, 힙 영역에 단 한번만 생성되는 객체를 만들기 위함입니다.
// 클래스로더 / 
// 클래쯔 만들어 꽂아넣기 전에 '단 한번' 호출 -> static initializer 스테틱 이니셜라이저
public class Singleton {
	
	// 1. static 2. new
	//정적 필드로 만들어 놨다, 정적 필드는 이렇게 생성하면 static initializer이 생성됨
	// 정적 초기화하는 필드여서 static!
//	private static Singleton obj = new Singleton();		// obj 클래스 타입이 singleton
	// obj -> 안전가옥
	private static Singleton obj; 
	
	// 각종 데이터를 필드로 저장!
	
	// 컴파일 된 바이트 코드는 이렇게 만들어 버린다! => 오로지 단 한번 => 
	// => 바이트 코드 읽어서 클래쯔 객체 읽어다가 메소드 영역에 집어넣는데 집어넣기 직전에 이 블럭을 단 한번 호출한다
	// 메소드 영역에 클래쯔 객체가 없으면 new 할 수가 없다!!!
	static {
		obj = new Singleton();
	} // static initializer
	
	
	//클래스는 공개되어있는데 생성자는 감춰져있다
	private Singleton() { //private로 해서, 외부에서는 보이지 않게 캡슐화	// 생성자 : 클래스이름
	;;
	} // default constructor
	
	
//	누구든지 가져갈 수 있도록 문을 열어줌 : getInstance
//	한번만 생성하고 그 객체의 주소를 공유하기 위해서 => 문자열 리터럴처럼
//	왜 static 메소드로만 해야하는가??
//	그 이유는 대전제1, 2에 있다! => 만약 인스턴스 메소드라면 객체를 생성해야한다! 싱글톤 타입의 객체를
//	근데 그게 안된다! private 으로 생성자를 막아버려서 마음대로 객체 생성 못하도록!!
//	정적 메소드 만들어 놓으면 클래스명만 알면 된다! 클래스명.getinstance => obj 정적 멤버
	static Singleton getInstance() {
		return obj;
		
	} //getInstance

} // end class
