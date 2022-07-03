//2022.03.07

public class EnumExample1 {
	
	public static void main(String[] args) {
		
		//name() 메소드
		Week today = Week.SUNDAY; 	 // 열거상수로 초기화하여, 열거타입변수 "정의"
		
		// 도트연산자 (.) : "객체의 멤버를 참조(==사용)하는 연산자" -> 객체멤버참조연산자
		// 객체 : 1) 고유한 성질 ("필드, fields)
//				 2) 기능(=행위) => 메소드 (method)
		String name = today.name(); 		//today 안에 있는 열거상수 이름이 뭐냐
		System.out.println(name);
		
//		----------------------
		//ordinal 메소드
		int ordinal = today.ordinal();
		System.out.println(ordinal);
		
//		---------------
		
		//compareTo() 메소드
		Week day1 = Week.MONDAY; 	// 순번 0
		Week day2 = Week.WEDNESDAY; // 순번 2
		
		// 			  기준             
		int result1 = day1.compareTo(day2); 		// int 타입의 변수를 선언해줬음 -> 기준값 0이 비교값 2보다 작다 : 음수로 반환
		int result2 = day2.compareTo(day1);			// 두 요일간의 차이가 몇이냐 까지 알려줌
		int result3 = day1.compareTo(day1); 	
		
		System.out.println(result1); 				// 왜 -2? day2가 3번째 선언되어있음 인덱스로 2 , day1은 첫번째 인덱스 0-> 얼마나 떨어져있느냐
													// 2-0 = 2
		System.out.println(result2);
		System.out.println(result3);				// 값은 0
		
//		--------------------------
		
		//values() 메소드
		Week[] days = Week.values();
		
		for(Week day : days) {
			
			System.out.println(day); // 열거상수를 그대로 출력하면? -> 열거상수의 이름이 그대로 출력된다!
		} // for
		
		
	} // main

} // end class
