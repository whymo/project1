//2022.03.18


package org.zerock.myapp.p2;


import org.zerock.myapp.p1.Parent;

//protected = default + alpha 공식에서,
//이미 (1) default 접근제한은 통과 못하고 (당연히, 패키지가 틀리니까)
//(2) alpha 예외조건으로 접근 가능한가?

public class Child3 extends Parent {		// 부모자식 관계
	
	public Child3() {
		
//		protected 생성자의 의미: 이 클래스에서는, 자식 객체의 생성자가 호출될때
//		부모객체의 초기화가 먼저 수행되어야 하는데, 이때 
//		부모 클래스의 생성자가 protected 일때, 과연 부모생성자 호출이 가능한가??
//		결과 : protected = default(x) + alpha(ok)
//		다른 패키지지만 상속 관계여서 허용된다
		
		super();	// protected인데 호출 가능해? ok ==> 여기서 alpha는 이걸 말하는거다!!!!
		
//		Parent parent = new Parent();	//xx -> 이용관계가 아니라 부모 클래스 생성자를 호출해줘야한다
		
	} // default constructor
	
	
	void child3Method() {
		
//		Parent parent = new Parent();	// xx -> 이렇게 호출해주면 안된다
		
	} // child3Method

} // end class
