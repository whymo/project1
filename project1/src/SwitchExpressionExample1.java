
// 2022.03.03


public class SwitchExpressionExample1 {
	
	// JAVA 12 : Switch Expression --> 가장 인기있는 기능
	// break문 필요성 제거, switch문을 변수에 직접 할당할 수 있다 
	public static void main(String[] args) {
		
		int number = 7;

		
		switch(number) {
		
		// : 콜론 안찍어도 됨, break 안적어도 됨!
		
		case 7 -> {
			
			System.out.println("7");
			System.out.println("7");
			System.out.println("7");
			System.out.println("7");
			System.out.println("7");
			System.out.println("7");
			
		} // case 7
		
		case 6 -> {
			
			System.out.println("6");
		} // case 6
		
		// 여기서도 케이스 하나일때 중괄호 생략 가능하지만 생략하지 마라!!
		
		} // switch
		
		
	} // main

} // end class
