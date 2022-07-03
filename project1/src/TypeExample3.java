
public class TypeExample3 {
	
	public static void main(String[] args) {
		
		// 문자 A를 표현하는 방법
		char c1 = 'A'; 	// 문자를 직접 저장
		char c2 = 65; 	// 십진수로 저장 (대문자 A의 keycode)
		char c3 = '\u0041'; 	// 16진수로 저장 (-> 유니코드라고 한다) 싱글커테이션 넣기
		
//	--
		
		char c4 = '가'; // 문자를 직접 저장
		char c5 = 44032; // 십진수로 저장
		char c6 = '\uac00'; // 16진수로 저장
				
//	--
				
		int uniCode = c1; // 유니코드 얻기
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
		System.out.println(uniCode);
		
		
	
	} //main

} //end class
