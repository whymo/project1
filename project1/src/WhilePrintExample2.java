
// 2022.03.03


public class WhilePrintExample2 {
	
	public static void main(String[] args) {
		
		int sum = 0; 		// sum 변수 정의 // sum => 누적
		int i = 1;			// i에 1 정의
		
		while(i<=100) {
			
			sum += i;		// 복합대입연산자
			// sum = sum + i;
			
			i++;
			
		} // while
		
		System.out.println("1~" + (i-1) + "합 : " + sum); // 표현식에서 문자열 하나만 있어도 결과는 문자열이 된다!
		
	} // main

} // end class
