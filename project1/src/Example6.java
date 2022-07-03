

// 2022.03.03
// 과제
// 홍승훈님 코드

public class Example6 {
	
	public static void main(String[] args) {
		
		int days = 0;
		int move = 0;
		//이동거리
		
		while(move <= 100) {
			move += 20; // 하루 올라감
			days++;		// 하루 지나감
			System.out.println(days + "일차에 올라온 거리 : " + move + "m");
			move -= 5;  // 하루 미끄러짐
			
		} // while
		
		System.out.println("탈출");

		
	
	
	} // main

} // end class
