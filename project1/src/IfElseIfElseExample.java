
//2022.03.02

public class IfElseIfElseExample {
	
	public static void main(String[] args) {
		
		// 범위를 조건식으로 만들때 어떻게 만들어야 하냐?? (***)
		// 상위 점수대를 위에다 두고 아래쪽으로 점점 줄여나가는 식으로 코딩!
		// & , | 논리연산자로 이어나갈 필요가 없다.
		int score = 75;
		
		if(score >= 90) { // 1. 스코어가 90점 이상이면 -> 범위 하나 만들어짐 
			
			System.out.println("점수가 100~90 입니다.");
			System.out.println("등급은 A 입니다.");
			
		} else if(score >= 80) { // 2. 스코어 충족 못하면 두번째 조건 
			// (score >= 80 && score <= 89) -> 이렇게 할 필요가 없다
			
			System.out.println("점수가 80~89 입니다.");
			System.out.println("등급은 B 입니다.");
			
			
		} else if(score >= 70) { // 3.
			
			System.out.println("점수가 70~79 입니다.");
			System.out.println("등급은 C 입니다.");
			
		} else { // 4. 
		
			System.out.println("점수가 70 미만 입니다.");
			System.out.println("등급은 D 입니다.");
			
		} // if-else if-else
		
		// 고려하지 않으면 없애도 무방하다!
		
	} // main

} // end class
