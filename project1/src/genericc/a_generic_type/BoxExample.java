//2022.03.24

package genericc.a_generic_type;

//# 제네릭 타입이 강제형변환을 어떻게 줄여주는지!
public class BoxExample {
	
	
	public static void main(String[] args) {
		
		// 제네릭타입 클래스로부터 인스턴스 생성
//		Box<String> box1 = new Box<String>();		// 제네릭 타입 사용 -> 객체 생성 / 자바 7까지는 양쪽을 맞춰야함
		
		// Rvalue의 <> : 타입추론 연산자
		Box<String> box1 = new Box<>();		// 하지만 자바 8부터는 rvalue에는 생략해도 괜찮다!
		
		box1.set("hello");					// setter 메소드 호출
		String str = box1.get();			// getter 메소드 호출

		
		System.out.println("box1 : " + box1);
		
//		--------------
		
		// 제네릭타입 클래스로부터 인스턴스 생성
//		Box<Integer> box2 = new Box<Integer>();		// 제네릭 타입 사용 -> 객체 생성
		Box<Integer> box2 = new Box<>();
		
		box2.set(6);						// setter 메소드 호출
		
		// wrapper 타입 2번째 특징 오토박싱 언박싱
		int value = box2.get();				// getter 메소드 호출 // 객체를 기본타입에 담아도 오류 안남
		
		System.out.println("box2 : " + box2);
		
//		--------------
		
		//정수타입 : 	 참조타입(Wrapper Type)
		// byte =========> Byte
		// char =========> Character
		// short ========> Short
		// int ==========> Integer
		// long =========> Long
		
		// 실수타입 : 
		// float ========> Float
		// double =======> Double
		
		//논리 타입
		//boolean -=====> Boolean
		
		
		
		
		
		
		
		
	} // main
	
} // end class
