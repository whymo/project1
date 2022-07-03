//2022.03.14
// # 필드랑 메소드 

package org.zerock.myapp.package6;

import org.zerock.myapp.package5.A;


public class C {
	
	
	C() {
		
		A a = new A(); 	// 인스턴스 객체 생성 => import
		
		System.out.println(a.field1);	// ok
//		System.out.println(a.field2);	// xx : default 같은 패키지 내에서만 사용 가능!
//		System.out.println(a.field3);	// xx : private 같은 클래스 내에서만 
		
//		-------------------
		
		a.method1(); // ok : public
//		a.method2(); // xx : default => 다른 패키지이기 때문에
//		a.method3(); // xx : private => 외부 클래스라서
		
			
		
	} // 생성자 블록

} // end class
