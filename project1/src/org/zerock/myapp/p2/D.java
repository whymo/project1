//2022.03.18

package org.zerock.myapp.p2;

import org.zerock.myapp.p1.A;

public class D extends A {		// 자동보다 직접 치는게 낫다!
	
	public D() {
		
		super();	// 부모가 제대로 생성되어서 필드와 메소드를 쓸 수 있음
		
//		--------
		
//		protected의 진짜 alpha 의미!
//		-> 1. 부모자식 관계 2. 자식 클래스 생성자 내부에서 super, this를 통해서 호출 가능하다!
		
		this.field = "yoyo";
		this.method();
		
	} // default constructor
	
	void method2() {
		// A 클래스 사용해보기
		
//		A a = new A();			// 객체 생성은 protected 접근제한자 걸림
		
//		this는 상속 받았다!
//		메소드 오버라이딩이 있느냐 없느냐에 따라 달라짐!
		this.field = "yoyo";		//ok
		this.method();				//ok
		
//		------
//		super는 부모객체에 존재하는 필드와 메소드를 쓰겠다!
		super.field = "yoyo"; // 생성자만 호출 가능하게 되면 안됨!! -> 필드와 메소드가 내려오지 않았다!
		super.method();
		
	} // method2
	
	@Override
	public void method() {
		System.out.println("D :: method() invoked.");
	} // method
	
	public static void main(String[] args) {
		D d = new D();
		d.method2();
		
	} // main
	
//	부모가 상속해주는 필드와 메소드가 상속이 된다고 할지라도 부모안에 필드와 객체가 사라지는 것은 아니다!
//	상속은 부모것을 내것처럼 사용하는거지 내것이 아니다! 다형성2에 의해서 재정의된 메소드가 호출된다!
	

} // end class
