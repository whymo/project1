//2022.03.24

package api.wrapper;


public class BoxingUnBoxingExample {
	
	
	public static void main(String[] args) {
		//1. Boxing
		Integer obj1 = new Integer(100);	// Deprecated (취소선) 영향을 받음 -> 중요도 떨어져서 사용되지 않은
		Integer obj2 = new Integer("200");
		
		Integer obj3 = Integer.valueOf("300"); // 앞으론 이렇게 생성해라!
		
		//2. Unboxing
		int value1 = obj1.intValue();			
		int value2 = obj2.intValue();
		int value3 = obj3.intValue();
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		
		// 3. Boolean의 박싱/ 언박싱
		
		Boolean bool1 = new Boolean(true);		// 박싱
		Boolean bool2 = new Boolean(true);
		
		Boolean bool3 = Boolean.valueOf(false);	// 박싱
		Boolean bool4 = Boolean.valueOf(true);	// 값으로부터 기본타입에 대응되는 wrapper타입 만듬?
		
		boolean bool5 = Boolean.parseBoolean("false"); // -> 문자열로부터 기본타입값 만듬
		System.out.println("bool5 : "+ bool5);
//		------------
		boolean b1 = bool1.booleanValue();
		boolean b2 = bool2.booleanValue();
		boolean b3 = bool3.booleanValue();
		boolean b4 = bool4.booleanValue();

		//오토 박싱 / 오토 언박싱
		//1. 오토박싱(Auto-boxing) -> 포장 클래스에 기본값이 대입될 경우
		Integer i = 1000; // rvalue는 순수한 값 / 왼쪽 기본타입 뭐가 됐든 기본타입보다 큰 것이 참조타입
						// 작은 타입에서 큰 타입으로 넣어졌을때 자동형변환이 되었다는 소리! (Wrapper 타입에 한해)
		
		//2. 오토 언박싱(Auto-unboxing) -> 기본타입에 포장 객체가 대입될 경우
		int i2 = i;   // 코끼리를 작은 냉장고에 밀어 넣어야함, 
//		int i2 = i.intValue(); // 이걸 대신 해주는 것임!!
		System.out.println("i2 : " + i2);
		
		int i3 = i2 + i;
		System.out.println("i3 : " + i3);
		
		int i4 = i3 + 500;
		System.out.println("i4 : " + i4);
		
	} //main
	
} // end class
