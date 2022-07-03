//2022.03.28


package ramdaa.exam05_operator;

import java.util.function.IntBinaryOperator;

public class OperatorExample {
	private static int[] scores = { 92, 95, 87 };
	
	
//	int applyAsInt(int left, int right); -> 추상메소드
	public static int maxOrMin(IntBinaryOperator operator) {	//(다형성-1)
		int result = scores[0];		// 첫번째 원소의 값을 임시 결과로 지정
		
		for(int score : scores) {	// 배열 순회 - 배열의 원소를 차례대로 순회
			result = operator.applyAsInt(result, score); // 추상메소드 호출(다형성-2)
		} // endhanced for
		
		return result;
	} // maxOrMin
	
	public static void main(String[] args) {
		//1. 최대값 얻기
//		int applyAsInt(int left, int right); -> 추상메소드
		
//		IntBinaryOperator res = (l, r) -> 100;		// Lvalue가 타겟 타입이 되어야한다! (자식타입의 구현객체를 생성하는게 람다식!), 부모타입의 인터페이스가 와야한다
		
 		int max = maxOrMin(
			(a, b) -> {					// a = letf / b = right
				if(a>=b) return a;		// a가 같거나 크면 큰값을 반환하고
				else return b;			// 아님 작은 값을 반환해라
			} // 람다식 : 최대값을 가지는 원소를 추출하는 익명구현객체 생성
		);
		
		System.out.println("최대값: " + max);
		
//		---------------------------------------
		
		//최소값 얻기
		int min = maxOrMin(
			(a, b) -> {
				if(a<=b) return a;	// a가 작거나 같으면 a를 반환
				else return b;		// 아님 b 반환
			} // 람다식 : 최소값을 가지는 원소를 추출하는 익명구현객체 생성
		);
		System.out.println("최소값: " + min);
	}
}
