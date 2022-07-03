//2022.03.24

package genericc.generic_method;


public class Util {			//Utility class ==> 'Helper' class : 자잘한 클래스 구현하기 쉽게 정적 메소드로 구현
							// 예 : Math.random -> 정적 클래스
	
	//제네릭 메소드 선언 (정적 메소드)
	public static <T> Box<T> boxing(T t) {
//		Box<T> box = new Box<T>();
		Box<T> box = new Box<>(); 	// 이렇게도 사용 가능
		
		box.setT(t);				// 롬복이 만든 메소드 이름 : setT
		
		return box;
	} // boxing
	
} // end class
