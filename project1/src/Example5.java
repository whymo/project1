
// 2022.03.03
// 과제
// 조민주님 코드

public class Example5 {
	
	// # 과제 : 과연, 동굴에서 빠져나오려면, 며칠이 걸릴까요?
	
//	(1) 여러분이 길을 걸어가다가, 동굴에 빠졌습니다.
//	(2) 동굴의 깊이는 100미터 입니다.
//	(3) 하루동안 열심히 올라가면, 20미터를 올라갑니다.
//	(4) 자는 동안에는 5미터를 다시 미끄러져 내려갑니다.
	
//	기준값 : 동굴(100미터), 하루동안 올라가는 거리(20미터), 미끄러지는 거리(5미터)
//	주의 : 며칠에 걸쳐 올라갔는데, 내가 동굴에서 빠져나왔는지 아닌지를 언제 판단해야하느냐? (조건문)
//	주의 2 : 만일 딱 100미터 올라왔다고 가정하면, 그럼 이 거리를 동굴을 빠져나왔다고 생각할 수 있느냐?
	
	
	
	public static void main(String[] args) { 
		
		final int cave = -100;
		final int climb = 20;
		final int slide = -5;
		int move = 0;
		int days = 0;
		
		while((cave + move) <= 0 ) { // 실행문
			
		move += climb;
		days++;
			
			System.out.println("현재 올라온 거리 : "+ move + "m"); // 낮에 올라간 후의 현재 거리 확인 
			
			if((cave + move) <= 0) {
				
				move += slide;
				System.out.println("미끄러지고 난 후의 거리 : "+ move + "m"); // 밤에 미끄러진 현재 거리 확인 
			
			} // if - 밤
			
			System.out.println("날짜 : "+ days + "일"); // 오늘의 날짜 확인
			
			
		} // while - 낮 - 밤
		
		
		System.out.println("동굴에서 빠져나오는데 걸린 날짜는 총 "+ days + "일 입니다."); // 총 며칠 걸렸는지 확인
		
		
	} // main

} // end class
