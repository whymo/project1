
// 2022.03.03

public class Example4 {
	
	public static void main(String[] args) {
		
		// 바깥쪽 , 안쪽 = 2뎁스 
		// 반복문이 중첩되면 한번 반복할때 중첩한 안쪽의 반복문은 횟수만큼 돌아야함
		// 바깥쪽 하나의 톱니가 움직일때 안쪽은 한바퀴 완전히 돌아야한 ex) 바깥 1번 돌때 안쪽은 9번 반복
//		int dansu =  2; // 구구단의 단수를 저장
//		
//		
//		for (    ; dansu <= 9; dansu++ ) { 		// 단수를 반복하는 반복문 (2~9단까지)
////			System.out.println(dansu); // 확인용 출력물
//			
//			System.out.println(dansu + "단");
//			
//			// 7 * 9 = 안쪽은 81번 돈다
//			// 단수에 곱해지는 수 
//			for(int i=1; i <= 9; ++i) {
//				
////			System.out.println("\t" + i); 	// \t : 탭키 쓴 것 처럼 들여쓰기 됨
//				
//			System.out.println("\t" + dansu + " x " + i + " = " + (dansu*i));
//				
//			} // inner-for
//			
//		} // Outer-for
		
		
//		-----------------------------------
//		# 구구단을 멈추려고 할때
		
		int dansu =  2; // 구구단의 단수를 저장
		
		// 라벨 붙일때 이름은 마음대로 
		TonnyStark: for (    ; dansu <= 9; dansu++ ) { 		// 단수를 반복하는 반복문 (2~9단까지)
			
			System.out.println(dansu + "단");

			for(int i=1; i <= 9; ++i) {
				
			System.out.println("\t" + dansu + " x " + i + " = " + (dansu*i));
			
			// 63을 추출하는건 9단만 있는게 아니다 7단도 있다 --> 버그
			// if문의 조건이 잘못됐다는걸 알 수 있다 -- > 이걸로는 부족함
			// 그래서 & 사용해서 dansu == 9 추가하기
				if(dansu * i == 63 & dansu == 9) {
					
					// 브레이크 사용할때 라벨 붙여서 어디까지 끝낼건지 정하기
					break TonnyStark;
				
				} // if
				
			} // inner-for
			
		} // Outer-for
		
		
	} // main

} // end class
