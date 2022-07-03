// 2022.03.10

// # 이건 설계도일 뿐
public class Calculator {
	// 두 칸 띄우기
	
	
	void powerOn() {							// 아무값도 되돌려주지 않는다
		System.out.println("전원을 켭니다.");
	}
	// 메소드 사이에는 한칸씩 띄우기
	// 나를 실행하려면 두개 int 값이 필요합니다!
	int plus(int x, int y) {				// 정수타입의 값을 되돌려줌
		int result = x + y; 				//int 타입의 result 변수	
		return result;
	} // plus
	
	double divide(int x, int y) { 			// 실숱타입 값을 되돌려줌
		double result = (double)x / (double)y; // 정수를 가지고 나눗셈을 해버리면 실수가 나오지 않기 때문에
											// 결과가 실수가 나오도록 double을 넣어준다
		
		return result;
	} //divide
	
	void powerOff() {
		System.out.println("전원을 끕니다");
	} //power Off

} // end class
