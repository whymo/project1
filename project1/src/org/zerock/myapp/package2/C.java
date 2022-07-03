//2022.03.14

package org.zerock.myapp.package2;

import org.zerock.myapp.package1.B;

public class C {
	
//	A a;	// A 클래스가  default 접근제한자라서 오류! 다른 패키지 x
			//	보이지 않기 때문에 import도 안됨! 
	
	B b;	// import : ok => public 접근제한자이기 때문에

} // end class
