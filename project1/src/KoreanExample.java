
//2022.03.08

public class KoreanExample {
	
	public static void main(String[] args) {
		
		// 필드를 사용하려면 참조변수명.필드명
		
		Korean k1 = new Korean("박자바", "011225-1234567");
		
		System.out.println("k1.name : " + k1.name);
		System.out.println("k1.ssn : " +  k1.ssn);
//		System.out.println("k1 : " +  k1); => this 찍어보기용
		
//		결과 =>		this : Korean@372f7a8d
//					k1 : Korean@372f7a8d
//		=> 참조변수 객체 주소와 this 둘다 같다
		
//		---
		
	Korean k2 = new Korean("김자바", "930525-0654321");
		
		System.out.println("k2.name : " + k2.name);
		System.out.println("k2.ssn : " +  k2.ssn);
//		System.out.println("k2 : " +  k2);	=> this 찍어보기용
		
//		결과 => this : Korean@2f92e0f4
//				k2 : Korean@2f92e0f4
//				
//			=> 논리적 주소값이 같다!
		
		
		
	} // main

} // end class
