
// 2022.03.02
// 브레인스토밍 예제문제

public class Example2 {
	
	// 로또 번호 범위 내에서, 무작위 정수를  6개를 추출하고,
	// 이 추출된 6개 번호가 아래 번호들과 일치해서, 1등인지 아닌지 판단하여
	// 1등이면 1등, 아니면 꽝이라고 출력하시오
	// 1등 당첨번호 : 12, 3, 7, 17, 23, 44
	// (1) 과연 변수는 몇개가 필요하고 그 타입은 무엇으로 할까?
	// (2) 추출된 6개 번호를 어떻게 1등 번호와 비교할까?
	

	public static void main(String[] args) {
		
		int to = 1;
		int from = 45;
		
		int num1 = (int)(Math.random()*(to-from+1)) + from;
		int num2 = (int)(Math.random()*(to-from+1)) + from;
		int num3 = (int)(Math.random()*(to-from+1)) + from;
		int num4 = (int)(Math.random()*(to-from+1)) + from;
		int num5 = (int)(Math.random()*(to-from+1)) + from;
		int num6 = (int)(Math.random()*(to-from+1)) + from;
	

		if(
			(num1 != (num2 & num3 & num4 & num5 & num6)) &
			(num2 != (num3 & num4 & num5 & num6)) &
			(num3 != (num4 & num5 & num6)) &
			(num4 != (num5 & num6)) &
			(num5 != num6)
			) {
			System.out.println("내 번호: " + num1 + "," + num2 + "," + num3 + "," + num4 + "," + num5 + "," + num6);	
		} // 중복 방지
		
		System.out.println("1등 번호: 12, 3, 7, 17, 23, 44");
		
		if(
				(num1 == 12 | num1 == 3 | num1 == 7 | num1 == 17 | num1 == 23 | num1 == 44)&
				(num2 == 12 | num2 == 3 | num2 == 7 | num2 == 17 | num2 == 23 | num2 == 44)&
				(num3 == 12 | num3 == 3 | num3 == 7 | num3 == 17 | num3 == 23 | num3 == 44)&
				(num4 == 12 | num4 == 3 | num4 == 7 | num4 == 17 | num4 == 23 | num4 == 44)&
				(num5 == 12 | num5 == 3 | num5 == 7 | num5 == 17 | num5 == 23 | num5 == 44)&
				(num6 == 12 | num6 == 3 | num6 == 7 | num6 == 17 | num6 == 23 | num6 == 44)
				) {
			System.out.println ("1등");
		} else {
			System.out.println("꽝");
		} // 1등 번호와 내 번호 비교
		
		
		// 중복 숫자 나옴
		
		
	} // main

}  // end class
