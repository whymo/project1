//2022.03.18


package org.zerock.myapp.p2;

import org.zerock.myapp.p1.Parent;

public class Child2 {
	
	
	Child2() {
		
//		Parent parent = new Parent();	// xx -> default에서 걸림
//		parent.name						// xx : 객체가 없는데, 인스턴스 필드 사용 불가
//		parent.parentMethod();			// xx : 객체가 없는데, 인스턴스 메소드 사용 불가
		
	} // default constructor
	
//-----------------------------------------------------	

	void child2Method() {
		
//		Parent parent = new Parent();		// xx : 패키지 다름
		
	} // child2Method
	
//-----------------------------------------------------	
	
	{
		
//		Parent parent = new Parent();		// xx : 패키지 다름
		
	} //User-defined block
	

} // end classs
