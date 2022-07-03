// 2022.03.10

public class TTTTExample {
	
	public static void main(String[] args) {
		
		TTTT tttt = new TTTT(); 	//  객체 생성
		
		tttt.method1();				// 메소드1에서 메소드 2를 호출하도록 설정했음
									// 다른 클래스에서 메소드 호출할때는 도트 연산자(.) 필요
									
//		결과 :
//		method1() invoked. -> 앞방향으로 호출되다가
//		method2() invoked.
//		method3() invoked. -> method3이 끝나야 method2가 끝남 method2가 끝나야 method1이 끝남 / 역으로 돌아온다
	} // main

} // end class
