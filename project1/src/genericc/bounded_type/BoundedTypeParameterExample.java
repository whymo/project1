//2022.03.24

package genericc.bounded_type;


public class BoundedTypeParameterExample {
	
	
	// 제한된 타입파라미터를 가진, 제네릭 메소드를 "사용할때",
	// 구체타입으로 아무것이나 지정못하고, 오로지 Number 타입 또는 그 자식타입만
	// 지정 가능하다!!
	public static void main(String[] args) {
		
		//String str = Util.compare("a", "b"); (x)
		
		// 정수는 int -> 기본타입은 안되니까 래퍼타입인 -> Integer 
		// 10, 20 대소를 비교
		// 실수로 비교하려고 했으면 인자값도 실수값을 줘야함 (10 이면 10.0으로 넣어줘야함)
		int result1 = Util.<Double>compare(10.0, 20.0);		// 1st. invoke generic method
//		int result1 = Util.<Double>compare(10.0, 10.0);		// 0 이 나옴
		
		System.out.println(result1); // 결과가 -1 나옴 왜? 왼쪽이 작으면 -1
		
//		-----------------------------------
		// number 타입보다 작은 자식타입으로 해야한다!
		// 하나는 실수, 하나는 정수면 어떤 타입으로 해야함?
		// double으로 해야함 왜? 비교할때 
		// 이항 연산자 두개 타입 비교할때 큰 타입으로 맞춰서!
		
		int result2 = Util.<Double>compare(4.5, 3.0);		// 2nd. invoke generic method
		
		System.out.println(result2);		// 1이 나옴! 왼쪽이 커서!
		
	} //main
	
	// 자바표준 라이브러리에서, 정렬등을 수행하기 위해서, 
	// 두 숫자(정수이든, 실수이든)의 대소를 비교할때, 아래와 같이 
	// 비교결과를 반환하도록 규칙화 되어있음 :
	// number1, number2 가 있다고 할때,
//	if(number1 == number2) 이면, ==> return 0을 한다
//	if(number1 < number2) 이면, ==> return <음수값> : 보통 -1 반환
//	if(number1 > number2) 이면, ==> return <양수값> : 보통 +1 반환

} // end class
