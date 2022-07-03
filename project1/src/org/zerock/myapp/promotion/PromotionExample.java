//2022.03.18

package org.zerock.myapp.promotion;

// 다형성 -1 실험 : 
public class PromotionExample {
	
	// 다형성-1 실험: 부모타입 참조변수 = 자식객체; 의 대입이 가능하다!!
	//                이것이 가능한 이유는, 상속관계를 통해, 대/소비교가 가능하고
	//                이를 통해, 자동형변환 발생
	public static void main(String[] args) {
		
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
//		-----------------
		
		// lvlaue(할아버지 참조변수) = rvalue(자식 또는 후손 객체)
		A a1 = b;
		
		System.out.println("1. a1 :" + a1);		// B타입이 찍힌다
		
		A a2 = c;
		A a3 = d;
		A a4 = e;
		
		
//		------------------
		
		B b1 = d;
		
		System.out.println("2. b1 : " +b1);		// D가 찍힌다
		
		C c1 = e;
		
//		------------------
		
//		B b3 = e;		==> 왜 오류남? 부모자식관계가 아니기때문에
//		C c2 = d;		==> d랑 c가 부모자식관계 아님!!
		
		
	} // main

} // end class
