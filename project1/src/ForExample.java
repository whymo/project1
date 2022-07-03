// 2022.03.03

public class ForExample {
	
	public static void main(String[] args) {
		
		// 1 + 2 + 3 + ... 10까지 더하면 얼마나 될까?
		
		// (1) 초기식 : 변수의 정의 --> 단 한번만 수행한다!
		// (2) 조건식 : for block을 반복수행할지, 말지를 결정
		// (3) 증감식 : (1)에서 정의한 변수의 값을 변경
	
		for(int i=1; i<=10; i++) {		// 참이면 for 블록을 실행하라!
										// for 블록이 실행되면 증감식 -> 조건식 -> 실행 이 루트 반복됨
			
			System.out.println(i);
			
		} // for
		
//		System.out.println(i); // 컴파일 오류남 변수의 유효범위를 넘어서서 for문이 끝나서 오류가 생긴다!
								// i가 for문의 초기식 지역변수여서 
		
	// 거짓이면 for문이 끝난다! --> 보통 for문은 반복할 횟수를 알고있을때 쓴다!
	// 반복 횟수를 모를때는 --> while
		
		
//		--------------------
		
		// # 만약 i 정의를 for 밖으로 빼면? 
		
//		int i = 1; 	 // i 명칭을 --> (1) 카운터 변수 * (2) 루프 제어 변수
//		
//		for(; i<=10; i++) {	 // 초기식 생략 가능하다 대신 ; 이 세미콜론 생략 안된다
//							// 증감식도 생략 가능하다
//			
//			System.out.println(i);
//			
//		} // for
//		
//		System.out.println(i);
		
//		------------------------
		
		// # 증감식 위치를 옮기면??
		
//	int i = 1; 	 
//		
//		for(; i<=10; ) {	
//			
//			System.out.println(i);
//			
//			++i;
//			
//		} // for
//		
//		System.out.println(i);
		
		
//		------------------------
		
		
		// # 조건식 위치를 옮기면??
		
//	int i = 1; 	 
//		
//		for(  ;  ;  ) {	 // 3개식 다 생략해버리면 루한루프 돈다고 생각해버린다 그래서 안쪽 if문이 역학을 해야한다
//			
//			if( i <= 10) {		// if문이 거짓일때는??
//				
//			System.out.println(i); // 조건식 참이면 변수의 값을 찍고 
//			
//			} else { 		// for문을 끝내버려라! ---> break 역할을 해야한다
//				
//				break;    // ---> 무한루프 탈출하는 조건이여서 탈출조건이라 한다! --> 반드시 만들어야함 ***
							// 안쓰면 cpu 태워먹는다
//				
//			} // if-else
//			
//			++i; // 그 다음에 증감식을 한다
//			
//		} // for
//		
//		System.out.println(i);
//		
//		// ----> 이렇게 쓸거면 왜 for문을 쓰느냐 --> 원래 for문대로 사용해라!
//		
	} // main

} // end class
