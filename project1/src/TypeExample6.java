
public class TypeExample6 {
	
	public static void main(String[] args) {
		
		byte byteValue = 10; //l이 없어서 int
		int intValue = byteValue; // 4byte = 변수(byte(1)) : 변수의 값을 끄집어내서 (10) 더 큰 그릇에 넣는다
		// 타입이 똑같아야 대입이 된다 (이 경우는 타입이 안맞음 근데 왜 들어감?)
		// byteValue 10이 int에 넣어준다 : 자바가 컴파일할때 타입을 자동으로 맞춰준다, 데이터 유실도 없다
		// : 자동형변환(promotion) 이라고 한다
		
		System.out.println(intValue);
		
		//---- 연산자는 타입이 같아야 실행된다!
		
		char charValue = '가';
		intValue = charValue;
		
		System.out.println("가의 유니코드=" + intValue);
		//문자열(문자가 나열)을 만드는 문법 : "" 더블 커테이션으로 만든다, 공백문자도 문자다
		// 문자열타입(String) + int타입 : 타입이 안맞음 -> 자동형변환은 작은타입~큰타입으로, String(class) > int
		// int를 String(참조타입)으로 바꿔버린다! 
		
		
		
		//------
		
	
		
		
		
		
	} //main

} // end class
