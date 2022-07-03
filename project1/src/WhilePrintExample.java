
// 2022.03.03

public class WhilePrintExample {
	
	public static void main(String[] args) {
		
		int i = 1; 	// (1) 초기식 : 카운터 변수 정의
		
		while(i<=10) { 		// (2) 조건식 평가
			
			System.out.println(i);
			
			i++; 			// (3) 증감식 --> 증감연산자는 대부분 단독으로 쓰인다 : 그래서 전위 후위가 의미가 없다
			
		} // while
		
		
	} // main

} // end class
