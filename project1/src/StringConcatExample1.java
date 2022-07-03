
// 2022.03.02

public class StringConcatExample1 {
	
	//문자열 연결(string concatenation) 연산자 : '+'
	public static void main(String[] args) {
		
		//참조타입 > 기본타입
		//문자열을 만들때는 "" 더블코테이션
		String str1 = "JDK" + 6.0; // 6.0이 문자열로 형변환 됨 
		
		// + : 이항연산자 "특정" : 스트링 타입의 문자열 타입
		// str1은 이미 스트링타입 그래서 형변환이 없다
		String str2 = str1 + " 특징";
		
		System.out.println(str1);		
		System.out.println(str2);
		
//		-----
		// 표현식(Expression => 연산식)이 아무리 많은 연산자와 피연산자로 구성되어있더라도,
		// 그 실행결과는 단 1개의 값(=스칼라, Scalar)이 생성
		//표현식의 구성이 아무리 복잡해도, 단 한개의 항이라도 문자열이 있으면, 결국 실행결과는 문자열!
		
		// int 타입 정수 3
		// jdk 문자열이여서 3이 형변환 -> jdk3 -> 3.0 형변환 -> jdk33.0
		String str3 = "JDK" + 3 + 3.0;
		
		// 3 + 3.0 = 6.0 -> 형변환
		String str4 = 3 + 3.0 + "JDK";

		System.out.println(str3);		
		System.out.println(str4);
		
		// 문자열로 다 바뀌어버린다 연산의 방향대로 계산할거 하고 (왼쪽부터)
		
	} // main

} // end class
