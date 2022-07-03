
// 2022.03.03


public class BreakExample {
	
	// 무작위 정수를 생성했을때, 만일 6이 나오면, 무한루프를 빠져나가는 예제
	// 무한루프(반복문)을 빠져나가기 위해, break 문 사용!
	public static void main(String[] args) throws Exception {
		
		// 무한루프(반복)를 만들면, 반드시 '탈출조건'을 생각해라!
		while(true) { // 무한루프 : 조건이 항상 참(true)이기 때문에, 무한으로 반복 수행
//		for(;;)  	 // 무한루프
			
			int num = (int)(Math.random()*(6-1+1)) + 1;  // 1~6 사이의 무작위 정수 생성
			
			System.out.println(num);
			
			// "탈출조건"
			if(num == 6) {  // 만일, 무작위 정수가 6이라면...
				break; 		// while 반복문을 "깨뜨려라!" break -> 반복종료!
				
			} // if
			
		} // while
	
		// 깨트리고 나오면 시스템아웃프린트린으로 프로그램 종료가 된다
		
		System.out.println("프로그램 종료");
		
		// 언리치에이블 코드 : 도달할 수 없는 코드이다 , 탈출 조건이 없으면 나갈 수 없음
		// 그래서 반복문 이후 나오는 문장은 나올 수 없다
		
		
		
		
	} // main

} // end class
