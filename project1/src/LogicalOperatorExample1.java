
// 2022.03.02 

public class LogicalOperatorExample1 {
	
	public static void main(String[] args) {
		
		int charCode = 'A'; // 65 정수 대입
	
		
//	-----
		
//		// 조건문 & : and charCode 65 이상이고 90이하이면 true이다!
//		// 1. 참이다 2. 참이다
//		// 그리고로 성립된다!
		if((charCode>=65) & (charCode<=90)) {
			System.out.println("대문자 이군요");
			
		} /// if 블록 
		
//		-----
		// & -> 무조건 두개를 따져봄
		// && -> 쇼트서키팅? 두개 중 하나가 안되면 안따짐 
		// 실무에서는 & -> 두개 다 따져보는게 버그를 줄임
		// 1. false  2. 오른쪽 보지 않아도 하나가 false이기 떄문에 false가 된다!
		// false이기 때문에 if 블록 실행하지 않는다
		if( (charCode>=97) && (charCode<=122) ) {
			System.out.println("소문자 이군요");
		} // if
		
//	-----
		
		// 1 괄호를 먼저 수행해라 -> false 거짓을 부정하겠다 : true  / and는 두 조건이 다 ture 여야함
		// 2. 65>57 크다 -> true !부정해라 -> false
		// 결국 false가 나온다
		// charCode = 65 = "A"
		if( !(charCode<48) && !(charCode>57) ) {
			
			System.out.println("0~9 숫자 이군요");
		} // if
		
		// ASCII 코드 값 참고 , 변수 안 글자가 대문자냐 소문자냐
		// 48 = 숫자 0 , 57 = 숫자 9
//		-----
		
		int value = 6;
		
		// || 이것보다 | 이게 두 조건을 다 따져봐서 버그를 줄일 수 있는 코드이다
		// | : 또는 , % : 나머지 , == : 동등비교연산자
		// 우선순위가 누구먼저일까? 왼쪽 판단보고 오른쪽 판단보고 또는이 맞는지 따져본다!
		// 1. 6을 2로 나누었을때 나머지가 0 (나머지가 없다 : 2의 배수)이면 참! --> 참이요
		// 2. 6을 3으로 나누었을때 나머지가 0 (3의배수) --> 참이다!
		// 또는 : 두 항중에 하나라도 참이면 참이다! --> 둘다 참이므로 참 ture
		if( (value%2==0) | (value%3==0) ) {
			
			System.out.println("2 또는 3의 배수 이군요");
		} // if
		
//		-------------
		
		// 위와 연산자의 구성이 똑같다 논리연산자 '||' 이것만 다르다.
		// 1. 참이다 2. 참이다 
		if( (value%2==0) || (value%3==0) ) {
			System.out.println("2 또는 3의 배수 이군요");
		} // if
		
//		------
		
		
		
		
	} //main

} // end class
