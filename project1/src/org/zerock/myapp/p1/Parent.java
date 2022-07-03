//2022.03.18

package org.zerock.myapp.p1;


public class Parent {
	
	protected String name = "yoyo";
	
	
//	protected  = default + alpha(다른 패키지의 자식 클래스에서도 접근 허용)
	protected Parent() {
		
		System.out.println("Parent::default constructor invoked.");
	} // default constructor
	
	
	protected
	void parentMethod() {
		
		System.out.println("Parent::parentMethod invoked.");
	} // method

} // end class
