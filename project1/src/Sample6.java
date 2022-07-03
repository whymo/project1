
public class Sample6 {
	
	public static void main(String[] args) {
		
		// 한개의 실행문의 끝은 ;(세미콜론)으로 마감처리한다
		// Lvalue(변수선언) = Rvalue(변수의 초기값)
		
		int age = 1+2+3+4; // age 이름의 변수를 "정의"한다!
		
		// 변수의 정의 = 변수선언 + 초기화(초기값을 넣어줘야함) Rvalue 넣기
		// 변수는 "정의"까지 완성되어야만 사용가능하다!!(**)
		
		//문자열 = 여러개의 문자들을 엮어놓은것을 의미
		String name = "jiyeon";
		
		age = 23;
		
		// 마지막에 넣은 값만 적용 
		name = "한지연1";
		name = "한지연2";
		name = "한지연3";
		name = "한지연4";
		
		// 1: 남성, 2: 여성 ,int : 정수, final : 랩을 씌워준다
		final int gender = 2;

		// gender = 1; 이렇게 변경하려고 하면 오류가 생긴다

		
		System.out.println(name);
			
		
	} // main

} // end class
