
// 2022.03.02


public class IfDiveExample {
	
	public static void main(String[] args) {
		
//		int num = (int)(Math.random()*6) + 1; 
		// 무작위로 난수 생성 : 1(offset), 6개(length) 정수 추출 / 오프셋과 랭쓰로 접근
		// 직관적이지 않은 코드
		// 로또번호처럼 : 1 ~ 45 까지 뽑아내라! 1(from) ~ 45(to)
		
		//변수는 하나에 한줄씩!
		int from = 1;
		int to = 45;
		
		// length를 자동으로 생성하게 하면? *** 이 코드 자주 쓰인다
		int num = (int)(Math.random()*(to-from + 1)) + from; 
		
		System.out.println(num);
		
//		if(num==1) {
//			System.out.println("1번이 나왔습니다.");
//		} else if(num==2 ) {
//			System.out.println("2번이 나왔습니다.");
//		} else if(num==3) {
//			System.out.println("3번이 나왔습니다.");
//		} else if(num==4) {
//			System.out.println("4번이 나왔습니다.");
//		} else if(num==5) {
//			System.out.println("5번이 나왔습니다.");
//		}  else {
//			System.out.println("6번이 나왔습니다.");
//		} // if-else
		
		
	} //  main

} // end class
