//2022.03.11

public class Television {
	
	static String company = "Samsung";
	static String model = "LCD";
	static String info = company + "_" + model; 
	
	double price;
	
	// 정적 3개 인스턴스 1개
	
	static {
		info = company + "_"  + model;
	} // static initializer
	
	
	void instanceMethod1() {		// 인스턴스 메소드1
		
		System.out.println(this.price); 		// 가능 : 인스턴스 필드 사용 => 문법은 이름만도 가능하지만 인스턴스는 this를 붙이기
		System.out.println(Television.model);  // 정적필드 사용 가능!
		
		this.instanceMethod2();						// 같은 인스턴스 메소드 사용 가능! => this.인스턴스메소드이름
		Television.staticMethod();             // 가능 => 클래스명.메소드이름
		
		TTTTT ttt = new TTTTT();
		ttt.instanceMethod2();			// 똑같은 이름의 메소드이름이면 구분 가능하게!
		
		TTTTT.staticMethod();           // 정적 멤버는 클래스명.메소드이름 => 객체 생성할 이유가 없다!!
		
	} // instanceMethod1
	
	void instanceMethod2() {		// 인스턴스 메소드2
		
		System.out.println(this.price);		// 객체 생성할 필요 없이 this.price
											// 왜?  같은 클래스 내부라면 객체가 있는 상태에서 수행된다
											// 이름 충돌 막기 위해 this.
		
		
	} // instanceMethod2
	
	static void staticMethod() { 			// 정적 메소드
		
		System.out.println(Television.model); //=> 같은 정적 멤버이기때문에 가능! => 클래스명
		
		Television obj = new Television();		// 인스턴스면 무조건 객체생성!!
		System.out.println(obj.price);			
		
	} // staticMethod

} // end class

// 예외로 CLASS 추가
// 객체 없이는 호출 불가능
class TTTTT {
	
	void instanceMethod2() {;;}
	static void staticMethod() {;;} 			// 하는 일 없는 메소드들

	
} // end class2
