//2022.03.14
//필드와 생성자에 대한 접근제한자 예제

package org.zerock.myapp.package4;

import org.zerock.myapp.package3.A;


public class C {
	
	A a1 = new A(false);	//=> import 필요 : ok
//	A a2 = new A(500);		// => 컴파일 오류! 왜? default 접근제한자라서 패키지가 다르면 x
//	A a3 = new A("hihi")	// => private 접근제한자라서 안보임! (캡슐화)

} // end class 
