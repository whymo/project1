
// 2022.03.03

public class SwitchExpressionExample2 {
	
	// JAVA 12 : Switch Expression #2
	public static void main(String[] args) {
		
		int number = 2;
		
		// 오류 났던 이유는 값을 받을 Lvalue가 없었어서 
		// 값을 반환할때는 ; 세미콜론을 찍는다
		// 변수 정의하고 사용 안해서 노란색 줄 뜬거다
		// break 없어도 밀고 내려가는거 없다!
		
		// ** 콜론이 아니라 화살표 기호로 바뀌었다
		// ** break 문장 쓰지 않고 정확히 매칭되는것만 찾고 스위치는 끝난다
		// ** 심플한 값을 생성하는 값이면 된다
		// ** 중괄호를 이용해 값을 되돌려주는건 안된다!
		// ** 일련의 로직을 수행하는건 중괄호 넣고 가능하다
		int result = switch(number) {
		
						case 1 -> 100 * 4;
						case 2 -> 1 + 2 + 3;
						case 3 -> number;
//						case 4 -> true; // 타입 미스매치 int라서 true false 출력 불가능
//						case 5 -> {
//								
//						}; // 값을 생성하는 {} 생성하니까 바로 오류가 난다! --> 허용되지 않는다!
						default -> 0;	
					
					}; // switch expression 
					
		System.out.println(result);
		
	} // main
	
} // end class
