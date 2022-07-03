
public class SwitchExpression {
	
	public static void main(String[] args) {
		
		//위크 -> 열거타입으로 참조타입 중 하나이다 
		Week today = Week.FRAIDAY; // 선언함 / 구현할 로직 중 한정된 값만 가져야할때 -> 위크 상수중 금요일(초기값)
		
//		----
		// a. 이전 switch 문 예
		// 	금요일이 무슨 유형인지 아래에서 정의됨 -> null을 쓸 수 있다(초기화)
		String typeOfDay = null; // -> 지역변수 : 선언만으로는 쓸 수 없다. 초기값 넣어서 정의해야하는데 
		
		//제어문 배울때 처음 나온 스위치문 : 케이스마다 비교할 수 있는 값이 나열되는데
		// 1) 정수 2) 문자열 3) 문자 4) 열거타입변수 -> 스위치문으로 비교 가능함 , 실수는 정의하지 않는다 (근사치나옴)
		switch(today) {
			case MONDAY : 	// 스위치문으로 비교할때는 열거상수명만 넣어주면 비교가 가능하다! -> 브레이크문이 없다 
			case TUESDAY :
			case WEDNESDAY :
			case THURSDAY :
			case FRAIDAY : typeOfDay = "Working Day"; break; // 금요일까지는 여기까지 와서 워킹데이라는 문장이 들어가고 (평일이니까)
			case STAURDAY :
			case SUNDAY : typeOfDay = "Day Off"; break; // 휴일이다 하고 빠져나감 
		} // switch (전통적)
		
		System.out.println("1. typeOfDay: " +  typeOfDay);
		
		//---
		
		// b. new switch expression
		typeOfDay = switch(today) { // 변수지정  오른쪽 값 생성 하고 왼쪽으로 대입
		
		case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRAIDAY -> "Working Day"; // 리터럴로 하는 경우 없다 (하드코딩)
		case STAURDAY, SUNDAY -> "Day Off";
		
		
		}; // switch expression (새로운거로 해보자면)
		
		System.out.println("2. typeOfDay: {}" + typeOfDay); // 정의됐으니까 출력용으로 사용 가능

		
		//------------
		
		//Example2 - 값을 반환하지 않고 스위치 표현식에서 코드를 실행할 수도 있습니다.
		
		switch(today) {
		case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRAIDAY -> {System.out.println("Working Day");}
		case STAURDAY, SUNDAY -> System.out.println("Day Off");
		} // switch expression
		
		//-------
		//Example3 - 더 복잡한 논리는 중괄호{} 로 감싸야 합니다. *** (일반적으로 쓰임)
		
		typeOfDay = switch(today) {
		
		case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRAIDAY -> { 	// 케이스별로 중괄호 넣어서 실행문장 여러개를 통해서 값을 생성
			
			System.out.println("1st.case");
			System.out.println("\t + Working Day");
			
			yield "Working day"; 	// 이 값을 반환하기로하는게 일반적이다
		} 
		
		case STAURDAY, SUNDAY -> {
			
		System.out.println("2nd.case");
		System.out.println("\t + Day Off");	
		
		yield "Day Off";
		
			}
		
		};// switch expression
		
	} // main

} // end class
