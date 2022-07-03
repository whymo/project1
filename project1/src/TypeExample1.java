
public class TypeExample1 {
	
//2022.02.28
	
	public static void main(String[] args) {
		
		int intVar = 10;
		long longVar = 10l;
		//대문자 or 소문자 l 을 적기
		
		float floatVar = 3.14159f;
		//소문자 or 대문자 f 
		//-> l이나 f를 넣지 않으면 정수는 int 타입으로 실수는 double 타입으로 가정한다.
		
		double doubleVar = 3.14159;
		
		boolean isMale = false;
		
		char charVar = 'A';  	//char charVar = 'AB';
		// 문자는 ''으로 막기 , 두개이상 문자를 넣을 수 없다
		
		//char charVar = '1'; 	// 문자로서의 1
		//char charVar = '한';		// UTF-8 파일
		// char 타입은 그릇에 들어가는 값은 문자마다 할당되어있는 정수로 되어있는 코드가 들어감
		
	} //main

} // end class
