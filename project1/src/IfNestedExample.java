
// 2022.03.02

public class IfNestedExample {
	
	public static void main(String[] args) {
		
		// 정한 범위 내 무작위 : 공식으로 외워라! 뜯어보지 않아도 된다!
		// 81 ~ 100
		int to = 100;
		int from = 81;
		int score = (int)(Math.random()*(to-from+1)) + from;
				
		System.out.println("점수는 " + score);
		
		String grade;
		
		if (score >= 90) {
					
					
				if(score >= 95) {
					grade = "A+";
				} else {
				grade = "A";
				} // if-else
		
		} else { // 90점보다 작으면 else 블럭으로
		
			if(score >= 85) {
			grade = "B+";
			} else { // 85점보다 작으면 else 블록
			grade = "B";
			} // if-else
		
		} // if-else
	
		System.out.println("학점:" + grade);
	
		
	} // main

} // end class
