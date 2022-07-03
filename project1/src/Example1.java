

// 2022.03.02
// 브레인스토밍 예제문제
public class Example1 {
	
	public static void main(String[] args) {
		
		int value = 100; // 변수 정의
		
		//문제 : 이 value의 숫자는 50보다 크고(and), 90보다 작냐?를 물어보는 조건식을 만들어라
		
		if(!((value>50) & (value<90))) {
			
			System.out.println("거짓입니다.");
		}// if 블록
		
		//문제 : value가 "소수입니다"가 나오게 해라
		
		if((value%value==0) & (value%1==0)) {
			
			System.out.println("소수입니다");
		}// if 블록
		
	} // main

} // end class
