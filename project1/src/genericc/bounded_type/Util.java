//2022.03.24

package genericc.bounded_type;


public class Util {
	
	// 제네릭 정적 메소드 선언
//	 Number : 정수 , 실수 공통 클래스 -> 숫자라면 다 허용되는 클래스
//	 Number 자식 타입이 무엇인지 모름 -> open type hierarchy 계층구조 보고 확인
	
	public static <T extends Number> int compare(T t1, T t2) {		// T를 제약함
		
		// T에 지정한게 Integer라고해서 doubleValue 못하는게 아니다!!
		// 단, 실수값도 나오도록 하는걸 원하는데 Integer로 해버리면 실수값이 안나옴!
		double v1 = t1.doubleValue(); 
		double v2 = t2.doubleValue();
		
//		Integer i = 100;
//		i.intValue();
//		i.doubleValue();		// 왜 더블벨류도 있을까?! : 정수던 실수던 Number가 규격을 물려줘서,
								// 값을 변환해서 사용할 수 있어서!
		
//		* 자식 타입은 다 구현하라해서 할 수 있음!!
//		Integer.compare(0, 0);
//		Long.compare(0, 0);
		
		return Double.compare(v1, v2);
		
	} // compare
	
} // end class

//System.out.println(t1.getClass().getName());
//System.out.println(t2.getClass().getName());