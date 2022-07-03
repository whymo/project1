//2022.03.18


package org.zerock.myapp.p1;


public class Other {
	
// 같은 패키지 내에서는 자식 클래스 생성자 블록이건 메소드 블록이건 프로텍티드 사용 가능하다!!!	
// 왜? default + alpha 인데 default에서 성립한다!!
	
	Other() {
		//사용관계
		Parent parent = new Parent();
		System.out.println(parent.name);
		parent.parentMethod();
		
//		this.parentMethod();	// x -> 왜? 호출 메소드는 상속된게 아니기 때문에!! 
//		super.parentMethod();	// x -> 부모관계가 아니기 때문에!!!!
		
	} // default constructor
	
	
	void otherMethod() {
		
		Parent parent = new Parent();
		System.out.println(parent.name);
		parent.parentMethod();
		
//		this.parentMethod();	// x 
//		super.parentMethod();	// x
		
	}	//otherMethod

} // end class
