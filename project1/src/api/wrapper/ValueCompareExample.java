//2022.03.24

package api.wrapper;


public class ValueCompareExample {
	
	// 자바 언어명세에는 , 아래의 규칙이있음:
	// 1) 박싱된 값을 비교하기 위해, 동등비교연산자를 사용하는 경우
	// 2) 아래의 조건에서만 가능하다!!
//	 		가. boolean 값(ture/false)을 가지고 있는 wrapper 객체는 비교 가능!
//			나. char 값을 가지고 있는 wrapper객체도 비교 가능
//				(문자의 범위 한정)
//			다. byte, short, int 값을 가진 wrapper 객체가 있을경우,
//				그 값을 범위가 -128~ +127까지의 범위값을 가지고 있는 경우만 비교 가능
	
//	 * 외울 수 없으니까, wrapper 타입 객체를 가지고 동등비교연산자를 비교하지 마라!!
//		해야할 경우는 언박싱해서 비교해라!
	
	public static void main(String[] args) {
		//다. 의 경우
		System.out.println("[-128~127 초과값일 경우]");
		
		Integer obj1 = 300;
		Integer obj2 = 300;
		System.out.println("==결과: " + (obj1 == obj2));
		System.out.println("언박싱후 ==결과: " + (obj1.intValue() == obj2.intValue()));
		System.out.println("equals() 결과: " + obj1.equals(obj2));
		System.out.println();
		
//		-----------이렇게 코딩하는 경우는 없다!---------------
		
		
		System.out.println("[-128~127 범위값일 경우]");
		
		Integer obj3 = 10;
		Integer obj4 = 10;
		System.out.println("==결과: " + (obj3 == obj4));
		System.out.println("언박싱후 ==결과: " + (obj3.intValue() == obj4.intValue()));
		System.out.println("equals() 결과: " + obj3.equals(obj4));
		
	} //main
	
} // end class
