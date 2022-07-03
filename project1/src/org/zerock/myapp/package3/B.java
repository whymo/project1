//2022.03.14
//필드와 생성자에 대한 접근제한자 예제

package org.zerock.myapp.package3;


// A 클래스로부터 인스턴스(객체)를 생성해서, 필드의 초기값으로 사용
public class B {
	
	A a1 = new A(true);		// ok : public 생성자 호출	
	A a2 = new A(100);		// ok : default(접근제한) 생성자 호출
//	A a3 = new A("hello");  // no : private 생성자는 보이지 않음 -> 외부에서 못 씀
 
} //end class
