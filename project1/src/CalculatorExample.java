import java.util.Arrays;

// 2022.03.10


public class CalculatorExample {
	
	public static void main(String[] args) {
		System.out.println("args: " + Arrays.toString(args));
		
		// new는 객체를 생성하고 필드 초기화가 안됐기 때문에 생성자를 , 객체를 반환?
		Calculator myCalc = new Calculator();		// 전자계산기 객체 생성
		
		// poweron  단순하게 호출만으로 끝냄 , 돌려주는 값 받을 값 없음
		// 이렇게 객체 참조변수명.메소드 호출로 끝내는 실행문장도 있다!
		myCalc.powerOn();							// 메소드 호출
		
		// plus 메소드 호출  : 
		int result1 = myCalc.plus(5, 6);			// 메소드 호출
		System.out.println("result1: " + result1);

//		---
		
		// 지역변수
		byte x = 10;
		byte y = 4;
		
		// int 타입의 매개변수가 두개 있다.
		// 각각의 매개변수에 10, 4 넣고 나눗셈을 리턴한다 
		double result2 = myCalc.divide(x,y);		// 메소드 호출
		System.out.println("result2: "  + result2);
		
		// 되돌려주는 값이 없어서 lvalue가 없다
		myCalc.powerOff();
		
	} // main
} // end class
