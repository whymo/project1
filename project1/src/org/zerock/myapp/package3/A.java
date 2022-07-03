//2022.03.14
//필드와 생성자에 대한 접근제한자 예제

package org.zerock.myapp.package3;

//우리가 배운 접근제한자(public, protected, default, private)는 같은 클래스 내부에서 효과 x
public class A {
	
	// 매개변수의 갯수와 타입이 맞아야 한다!
	A a1 = new A(false);		// ok => 필드 타입으로 A를 쓸 수 있다!
	A a2 = new A(300);			// ok 
	A a3 = new A("hi");			// ok => private :  같은 클래스 안이여서
	
	// 생성자 오버로딩
	public A(boolean b) {;;}	// public 접근제한을 갖는 생성자 -> 누구든 객체 생성가능
	A(int b) {;;}				// default 접근제한을 갖는 생성자 -> 같은 패키지 내에서만
	private A(String s) {;;}	//private 접근제한을 갖는 생성자 -> 못쓰게 만듬

} // end class
