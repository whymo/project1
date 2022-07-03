// 2022.03.10

import java.util.Arrays;

public class Computer {
	
//	int sum1(int[] values) {
//		int sum = 0;
//		
//		for(int i=0; i<values.length; i++) {
//				sum += values[i];				// 모든 배열의 원소를 더한다
//		} // for
//		
//		return sum;		// 값 반환(return을 만나는 순간 메소드 실행을 종료시킨다) -> 1. 단독으로도 사용 가능하다 
//						// 2. return 키워드 뒤에 되돌려줄 값을 정한다. 변수 가능하다, 정수값 가능, 연산식(표현식) 가능, 또다른 메소드 호출 가능
//	} // sum1
//	
//	int sum2(int[] ... values) {
//		int sum = 0;
//		
//		for(int i=0; i<values.length; i++) {
//			sum += values[i];
//		} // for
//		
//	return sum;
//		
//	} // sum2
	
//	--------------------------------for 문
	
	
	int sum1(int[] values) {			//선언됨. /  sum1 만든 클래스 -> open call ~
		int sum = 0;
		
		for (int number : values) {
			
			sum = sum + number;
			
		}// enhanced for -> 인덱스 번호로 무언가 할때 쓰면 안된다
		
		return sum;		
	} // sum1
	
	int sum2(int ... values) {		// 가변인자(==배열)를 만들때 사용(...) : 매개변수가 몇개가 필요한지 모를때
		
//		int sum2(int age, int ... values) -> 이럴 경우 가변인자가 뒤에 와야지 오류가 안난다!
		
		System.out.println("values: " + Arrays.toString(values));
		
		int sum = 0;
		
		for(int number : values ) {
			
			sum = sum + number;
			
		} // enhanced for
			
		return sum;
		
	} // sum2
	

} // end class
