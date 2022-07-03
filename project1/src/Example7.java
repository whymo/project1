
// 2022.03.04

public class Example7 {
	
//	# 과제 : 배열을 이용하여, 소수(prime number)인지 판정하라!
//	
//	배열 나오게 하고 
//	87을 정수입니다
//	13은 소수입니다
//	..
//	.
//	..
//	.
//	.
	
//	1) 전제 :
//		- 배열 : int[] intArry = {87, 13, 5, 99, 133, 30, 27};
//	
//	2) 문제 : 
//		- 위에서 제시된 배열의 각 원소가 소수인지 판정해서 출력하라!
	
//	-> 첫번쨰 배열은 소수이다 아니다
//		두번쨰 ~ 소수이다 아니다
//		
//	3) Clue(힌트) : 자료구조가 가지고있는 배열의 원소를 하나하나 접근 해야함,
//		- 배열의 순회(traverse)가 필요하다!(by using array indexing) -> 반복문이 필요하다 (for, while ... )
//		- 소수 판정 기준: 주어진 숫자가,  --> 정수로 
//		가. 1로 나누어 떨어지고(나머지가 0)
//		나. 자기 자신의 숫자로도 나누어 떨어지고,
//		다. 1과 자기 자신을 제외한 중간 숫자들로는, 나누어 떨어져서는 안된다 *** 중요
	
//	-> 알고리즘부터 배열을 생성한다 / 순회한다 / 소수인지 판정한다  -> 나머지가 0이면 소수라고 출력한다 / 소수라면 소수라고 출력하고 소수가 아니면 아니라고 출력한다 / 그리고 구체화 시킨다
	
//	1로 나뉘는걸 공통적으로 해두고 
//	중간 숫자들이 딱 나누어떨어지지 말아야함 
//	반복문으로 이걸 만들기 -> 중간숫자가 많던 나머지가 0이 나오면 안된다 그럼 정수가 아님
//	브레이크 걸 나오기 -> 소수가 아니야
// boolean 타입의 변수도 필요하다 result -> true 이면 이건 소수가 아냐 
	// 초기값 false 소수가 아닌걸로 해놓고 -> 브레이크 나오면 소수가 아님
	// 브레이크 안나오면 boolean 타입을 트루
	
	// 빼면 성공하면 1과 자기 자신으로 나누고 0이면 소수가 아닌걸로 만들어야함
	
		public static void main(String[] args) {
			
			// j 카운더 변수
			
//			--------------------------건영님 코드
		
			int[] intArrays = {87, 13, 5, 99, 133, 30, 27}; 	// 1. 배열 안에 숫자 넣기 (선언)
			
			for(int i = 0; i < intArrays.length ; i++) {
				System.out.print(intArrays[i] + " ");
				
				boolean result = true; // 3. 참인지 거짓인지 받아야함 (빼면 성공하면 1과 자기 자신으로 나누고 0이면 소수가 아닌걸로 만들어야함)

				 for(int num = 2; num < intArrays[i] ; num++) {	// 4. 인트어레이 요소보다 작을때까지
					 if(intArrays[i] % num == 0) {				// 5. if - 하나씩 뺀걸 각자 계산 -> 0이 나오면 결과값이 거짓이 되게끔 : 실수
						 result = false;
					 } /// if
			
			} // for -  2.  배열 길이보다 작을때까지 i를 반복하면 배열의 요소들이 하나씩 빼내는 식
				
			
			if(result == true) {
				
				System.out.println("소수 입니다.");
				
			}else { 
				System.out.println("소수가 아닙니다.");	 
			} // 7. else문
				
		} // 6. if문
	
//-----------------------------------------------건영님 코드
			
			
		
	} // main

} // end class
