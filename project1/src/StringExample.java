
// 2022.03.04

public class StringExample {
	
	// # 참조변수 스트링
	
	public static void main(String[] args) {
		
		
//		String name = null;
////		int age = null; 				// 기본타입 변수에는 null을 쓸 수가 없다!!! , 기본타입변수의 초기값으로는 사용불가!!!
//		
//		System.out.println(name);		// 객체의 주소가 없기 때문에 null 그대로 찍힌다!
		
//		-----------------------------------
//		
//		String name = null;
//		
//		if(name != null) {
//			
//			System.out.println("null이 들어있습니다.");
//			
//		} else {
//			
//			System.out.println("null이 아닙니다.");
//			
//		} // if-else
		
//		--------------------------------------------

		
//		String name = "jiyeon";
//		
//		String name = null;		
//		오류발생
//		Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.length()" because "name" is null
//		at Eee.main(Eee.java:49)
//		객체가 없는데 사용하려고할때 이렇게 오류가 발생한다!
//		// null은 객체의 주소를 가지고 있지 않기 떄문에
//		
//											// String 객체의 기능이다 length
//		System.out.println(name.length());	// 문자열 객체 안에 들어있는 문자열 길이를 카운팅해서 반환해준다

		
		
//	-----------------------------------
//		
//		String name = "jiyeon";
//		String hobby = "Extreme Sports";
//		
//		// 연산자 = 피연산자는 틀이 맞아야한다 타입이 맞아야한다!!
//		// 문자열 객체를 찍어내는 틀이여서 integer에서 찍어낸 틀이 들어가지 못한다!!
//		String str = new Integer(100);
//		
//		//new 연산자(객체생성연산자)
//		String str = new String("jiyeon");
//		
		
//	------------------------------
		
//		Integer number = new Integer (100); --> 원래는 이렇게 했어야 했다
		
		Integer number = 100; 	//Integer -> 정수라는 객체를 찍어내는 틀 (참조타입)
								// Rvalue에 정수 타입의 주소가 들어와야한다
		
//		----------------------------------------------------------------------------------
		
		// new는 무조건 새롭게 생성해라!
		
		String name1 = new String("신용권");
		String name2 = new String("신용권");
		
//		System.out.println();
		
		
	} // main

} // end class
