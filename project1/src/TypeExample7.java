
public class TypeExample7 {
	
	public static void main(String[] args) {
		
		int intValue = 44032; //keycode값
		char charValue = (char) intValue; 
		//타입이 안맞음 2byte = 4byte promotion 안됨,  강제로 해야한다 () 이 안에 타입
		
		System.out.println(charValue);
		
		//--------
		
		long longValue = 500; // 500은 2byte만으로 충분하다
		
		intValue = (int) longValue;
		
		System.out.println(intValue);
		
//	-------
		
		double doubleValue = 3.14;
		
		intValue = (int) doubleValue; // 4byte = 8byte -> 8 쪼개야함
		
		System.out.println(intValue);
		
		//왜 소수점 아래가 날라갔지? 실수(소수점)는 정수와 다르게 보관형식이 다르다
		//자바언어의 기본 원칙! 쪼갠 바이트가 모잘라서가 아니라, 실수 -> 정수로 바뀌면 실수 부분을 버려버린다!
		//정수를 바꿔서 보관해라 명령해서 실수를 보관할 수 없다!
		// ** 소수점 버리고싶을때 이렇게 사용한다!!!
		
//		double doubleValue = 3.14;
//		
//		longValue = (long) doubleValue; // int대신 long으로 하면? 그래도 3 나옴 run 됨!
//		
//		System.out.println(longValue);
		
//		
	} //main

} //end class
