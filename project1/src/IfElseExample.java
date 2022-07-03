
//2022.03.02

public class IfElseExample {
	
	// if-else 문 예제
	public static void main(String[] args) {
		
		int score = 85;
		
		// 조건식이 참이면 기대한 조건을 말한다
		// 예상치 않았던 부분이 else 부분이다 
		if(score >= 90) { // 조건식이 true이면
			
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A 입니다.");
			
		} else { // 조건식이 false이면
			
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급은 B 입니다.");
			
		} // if-else
		
		
	} // main

} // end class
