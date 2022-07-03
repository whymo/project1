//2022.03.14
// # 필드랑 메소드 

package org.zerock.myapp.package5;


public class B {
	
	
	B() {
		A a = new A();		// 객체 생성 ok
		
		System.out.println(a.field1);		// public : ok
		System.out.println(a.field2);		// default : ok
//		System.out.println(a.field3);		// private : xx
		
//		-------------------------------
		
		a.method1();		// ok : public
		a.method2();		// ok : default
//		a.method3();		// ok : private
		
		
	} // constructor
	


} // end class
