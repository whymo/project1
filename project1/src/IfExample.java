
//2022.03.02

public class IfExample {
	
	public static void main(String[] args) {
		
		int score = 93; // 점수 보관 변수
		
		// 이미 정해놓은 단어는 변수, 메소드, 클래스 이름으로 쓰지 못한다!
		
//		------ 변수 선언
		// 스코어가 90이상이면 참이다 -> 그럼 if문을 수행하라!
		if(score>=90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A 입니다.");
			
		} // if
		
		// 심플 if문
		
//		-----실험-----
//		// 띄우거나 붙여도 상관없지만 가독성이 떨어진다!
		// 연산자와 피연산자는 빈공백으로 구분시켜주자!
		// 비교연산자는 띄우면 안된다!
//		
//		if			(score >= 90) 		{
//			System.out.println("점수가 90보다 큽니다.");
//			System.out.println("등급은 A 입니다.");
//		} //if
//		
//		-------------------------
		if(score >= 90) {
			
			;;
			
		}//if		// -> 실행할 문장이 없으면 ;(세미콜론) 하나로 마감처리
				//  ;; -> 잠시 비워놨다는 의미
		
//			System.out.println("점수가 90보다 큽니다.");
//			System.out.println("등급은 A 입니다.");
		
//		------------------------
		
		
	} // main

} // end class
