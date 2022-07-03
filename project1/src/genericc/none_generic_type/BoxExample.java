//2022.03.23


package genericc.none_generic_type;


public class BoxExample {

	
	public static void main(String[] args) {
		
		Box box = new Box();		// 인스턴스 메소드니까 박스 객체 생성
		
		box.set("YOYO");			// set 메소드 호출
		
		String name = (String) box.get();	// 문자열을 상자안에서 끄집어내려고함! : 강제형변환 필요 왜?
					// get 필드 타입 object다 보니 그대로 반환한다. lvalue 조상타입 rvalue 자식타입
					// 다형성 -1 에 의해 들어감. 다형성-1에서 자식객체 빼내려면 강제형변환 해야한다.
					// 단, 강제형변환이 프로그램 수행시 성능에 좋지 않은 영향을 준다!
		
//		# 강제형변환없이 상자를 만들수는 없을까?!
//		그래서 나온게 제네릭이다!!
//		------------
		
//		box.set(new Apple());		//  애플 객체
//		Apple apple = (Apple) box.get();
	} // main

} // end class
