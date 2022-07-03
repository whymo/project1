
public class VariableExample1 {
	
	//2022.02.25
	
	public static void main(String[] args) {
	//10을 변수 value의 초기값으로 저장 ,  정의가 됨
		int value = 10;
		
		//변수 value 값을 읽고 10을 더하는 산술 연산을 수행
		//연산의 결과값을 변수 result의 초기값으로 저장
		int result = value + 10;
		
		//변수 result 값을 읽고 콘솔에 출력
		//systemout에는 Lvalue가 없다, 무조건 Lvalue가 필수는 아니다!
		System.out.println(result);
	} // main

} // end class
