import java.util.Arrays;

//2022.03.11

// # 과제7 : 삽입정렬 =  srot

//1) 무작위 정수를 하나씩 복원추출하여, 배열생성
//	가. 추출할 정수의 범위 : 38~200
//	나. 배열의 크기 : 30
//	
//2) 2)에서 생성한 배열의 원소를 정렬합니다.
//	가. 정렬알고리즘 : 삽입정렬
//	나. 알고리즘 설명 url : 네이버 삽입정렬
//
//3) 조건
//		가. 배열을 출력할 때에는, Arrays.to.String() 정적메소드를 사용합니다. ( arrays 안에 정렬 메소드 있지만 하지마라)
//		나. 배열을 순회(traverse)할 때에는, 
//			- 배열의 인덱스 번호가 필요할 때에는, Classical For문을 사용
//			- 배열의 인덱스 번호가 필요없을 때에는, Enhanced For문을 사용
//		다. 출력결과
//			- 정렬된 배열 결과
//			- 정렬을 위한 배열 원소간 자리바꿈의 횟수와 Epoch 출력

public class Example11 {
	
	public static void main(String[] args) {
		
		int[] arr = new int[30];	// 공간 30
		
		int epoch = 0;				// epoch 횟수
		int number = 0;				// 자리바꿈 횟수 => 효율성을 보기 위해서
		
		int from = 38;		// 범위 :  38부터
		int to = 200;		// 200까지
		
		for(int i=0; i < arr.length; i++) { 
			
			arr[i] = (int)(Math.random()*(to-from+1))+38;	// to~from까지, 38부터 => 1을 붙여야 범위가 회복됨
			
		} // for 38부터 200까지의 난수
		
			System.out.println("정렬 전 정수는 " + Arrays.toString(arr));		// 정렬 전 배열 추출
			
			
			for(int i = 1; i<arr.length; i++) {		// i는 1번째 인덱스부터 시작
				
				int key = i; 				// 정렬할 대상 i를 temp에 넣어준다
//				int j = i-1;					// 비교할 대상을 j에 넣어준다
				int j = i;
		
				
				// && 두개 말고, & 하나만 써라! => 조건식 잘못 됨
				// 왜 & 쓰면 오류남? 문법적 컴파일 오류 / 예상치 못한 오류
				// 후자 같은 경우는 조건식이 잘못되었다!
				// && : 첫번째 false면 뒤에도 false 
//				& temp < arr[j]
				
					while(j > 0) {	 //조건문 : j가 0보다 크거나 같고(and), temp가 arr[j] 보다 작다 //  && : and, j가 0이 될때까지 반복 
						j--;
						
						if(arr[key] < arr[j]) {
							int temp = arr[j];
							arr[j] = arr[key];
							arr[key] = temp;
 							key--;
							
						} else {
							
							break;
						
						} // if-else 
//						arr[j+1] = arr[j];				// 실행문 : 비교할대상 다음자리에 arr[j]를 넣어줌
//					
//						arr[j+1] = temp;				// arr[j+1] 자리에 temp에 넣어둔 수가 들어간다!
						
//						arr[j] = temp;					//  j 자리에 temp를 넣어줌
						
														// j-1
						
						number++;						//자리바꿈 횟수
				
					} // while -> 정렬할 대상보다 비교 대상이 크면 비교 대상을 오른쪽 인덱스로 이동
				
//					arr[j+1] = temp;				// arr[j+1] 자리에 temp에 넣어둔 수가 들어간다! ==> 질문하기
					
					epoch++; // epoch => 데이터를 다 소진해서 필요로하는 모든 기능을 수행하기까지 얼마나 걸리냐  : 배열의 길이에 따라 결정되는것은 아니다!	
				
					
				} // for
		
			
		
			System.out.println("정렬 후 정수는 " + Arrays.toString(arr));	// 정렬 후 
			System.out.println("자리바꿈 횟수 : " +  number);
			System.out.println("epoch 횟수 : " +  epoch);
		
	} // main

} // end class
