
public class TypeExample9 {
	
	public static void main(String[] args) {
		
//		double number1 = 10.23;
//		byte number2 = 20;
//		
//		//int result = number1 + number2; // double type에서 int로 못한다
//		//왜??? number1은 실수, number2는 정수 --> 이 타입은 double 타입이 된다
//		
//		double result = number1 + number2; 
//		//--> double로 바꿔줘야한다!
//		
//		System.out.println(result);
//		
		
//		byte number1 = 10;
//		byte number2 = 20;
//		
//		double result = number1 + number2; 
//		// --> 왜 30.0이 나옴?
//		// double 타입으로 결과값이 나와서 .0이 붙는다
//		//Lvalue가 실수라면 실수 타입 결과물로 나온다!!
		
//		System.out.println(result);
//		
		
		
		//---> 소수점 버리고싶으면? 강제형변환
		byte number1 = 10;
		byte number2 = 20;
		
		double result = number1 + number2; 
	
		
		System.out.println((int)result);
		// ---> 결과값을 int로 강제형변환 하면 된다!!
		
		
	} // main

} // end class 
