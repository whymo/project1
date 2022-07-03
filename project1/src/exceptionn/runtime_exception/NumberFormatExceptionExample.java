//2022.03.22

package exceptionn.runtime_exception;


public class NumberFormatExceptionExample {
	
	
	public static void main(String[] args) {
		
		
		String data1 = "100";
		String data2 = "a100";	// 문자 + 숫자 들어있음! 
		
		//parseInt("문자열") --> 정수 타입으로 바꿔주는 메소드!
		// 식별자규칙! : 대문자 + 카멜기법으로 적용! => 적어도 타입명이라는건 암! 타입명.메소드 => 정적멤버답게 호출
		int value1 = Integer.parseInt(data1);		// 인티저.parseInt -> 정적 메소드
		int value2 = Integer.parseInt(data2);
		
		int result = value1 + value2;
		
		System.out.println(data1 + "+" + data2 + "=" + result);
	} //main
	
} // end class

