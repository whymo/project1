
public class TypeExample8 {
	
	public static void main(String[] args) {
		
		byte byteValue1 = 10;
		byte byteValue2 = 20;
		
		// 왜 lvalue를 byte타입으로 하면 안되지?? 
		byte byteValue3 = (byte) (byteValue1 + byteValue2); // (byte) 형변환 안하면 컴파일에러
		
		//Rvalue는 연산식임 : 피연산자 타입이 같아야하는데 byte으로 같음 그래서 덧셈이 수행됨
		//30이라는 결과물이 byte타입의 결과물일까 int타입의 결과물일까?
		//byte타입이였으면 오류가 안났음 / 연산자 결과물이 int type이다!!
		//그래서 byte type으로 형변환 해야한다
		//정수를 가지고 연산하면 기본 int로 가장한다!!! (연산식의 결과값)
		//int 타입보다 큰 값이면 long으로 가장한다!!
		
		int intValue1  = byteValue1 + byteValue2;
		
		
		System.out.println(intValue1);
		
		
	} //main

} // end class
