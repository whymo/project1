//2022.03.24

package genericc.generic_method;


public class BoxingMethodExample {
	
	
	public static void main(String[] args) {
		
//		Utility class에 선언된, 제네릭 정적 메소드 호출
		
//		가능하면 생략하지 말고 사용해라!
		Box<Integer> box1 = Util.<Integer>boxing(100);	// 인티저인데 왜 기본값 주는거 가능? 왜? 
														// Wrapper 타입 사용해서  Aoto-Boxing됨!
//		Box<Integer> box1 = Util.boxing(100);			// 100(int) ==> 100(Integer)    
		
		// 오토 언박싱
		int intValue = box1.getT();
	
		System.out.println("box1 : " + box1);
		
//		---------------
		
//		Box<String> box2 = Util.boxing("홍길동");
//		String strValue = box2.getT();
		
//		System.out.println("box2 : " + box2);

	} // main
	
} // class
