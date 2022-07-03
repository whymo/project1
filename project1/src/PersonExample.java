//2022.03.11

public class PersonExample {
	
	public static void main(String[] args) {
		
//	왜 person 객체를 생성함?? -> 인스턴스 멤버이기 때문에!

		Person p1 = new Person("123456-1234567", "계백");	
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
//		p1.nation = "usa"
//		p1.ssn = "654321-7654321";
		p1.name = "을지문덕";;
		
		
//		----------------
		// 객체마다 final 상수의 값이 다르다! => p1 , p2 값이 다르기 때문에!
		Person p2 = new Person("123456-0000007", "계맥");	// 두번째 객채 생성
		
	} // main

} // end class
