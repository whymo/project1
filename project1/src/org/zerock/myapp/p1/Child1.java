//2022.03.18


package org.zerock.myapp.p1;

public class Child1 extends Parent {
	
	Child1() {
		
		//Parent 생성자 Protected임 -> ok : 같은 패키지, 생성자 내부여서 가능!
		
		super();		// 자식 객체 첫줄에 부모 호출
		
		System.out.println("Child1::default constructor invoked.");
		System.out.println("\t + name : " + this.name);	//ok
		this.parentMethod();	// ok
		super.parentMethod(); 	//ok
		
//		System.out.println("\t + name : " + this.name);	// 필드도 사용 가능
	} //default constructor
	
	void childMethod() {
		
		System.out.println("Child1::childMethod() invoked.");
		
//		Parent parent; 	// 선언 가능
		Parent parent = new Parent();	// ok
		System.out.println("\t + name : " + this.name);	//ok
		parent.parentMethod();		// ol
		
	} // method
	
	
	{		// 같은 패키지 내이기 때문에 어디든 성립한다!
		
		Parent parent = new Parent();
		System.out.println(parent.name);
		parent.parentMethod();
		this.parentMethod();
		super.parentMethod();
		
	} //User-defined block
	
//	==============================================
	
	public static void main(String[] args) {
		
		Child1 child = new Child1();
		child.childMethod();
	} // main
	
} // end class
