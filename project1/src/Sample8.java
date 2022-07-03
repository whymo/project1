
public class Sample8 {
	
	{
		;; // pass : 아직 실행문장을 완성하지 못하거나, 준비가 안되었다!
	}
	
	// 변수 : 정의 + "유효범위 (***)"
	// 일반화 요약 : 
	//(1) 변수의 유효범위는, 자신이 선언된 블록 내부에서만 유효하다!!
	//(2) 변수는 자신의 유효범위가 끝나는 순산, 메모리에서 "파괴"된다!
	
	// 변수의 구분 : (1) 지역변수 : { 시작해서 } 끝나는 (2) 전역변수 -> 자바는 전역변수가 없다
	// local variable not used : 왜 변수 만들어놓고 사용 안함?
	// 여기서 지역변수 (local variable)이 무엇이냐? : 특정 블록 내부에서 선언된 변수
	// 전역변수(global) : 프로그램 전체에서 사용 가능한 변수 : 모든 class에서 사용 가능 -> 자바는 없다
	// 전역변수 때문에 같은 이름의 변수가 있으면 충돌 -> 치명적 디버그의 요소가 됨
	
	public static void main(String[] args) {
		// 변수의 유효범위 : 정의된 변수를 사용간능한 범위

		//사용자 정의블록이 보이기때문에 똑같은 변수(age)를 두번 선언할 수 없다!
//			int age = 40;	
	
		{
			int age = 23;
		
			System.out.println(age);
		} // 사용자 정의 블록 (User-defined block) #1
		
		{
			int age = 23;
			
			System.out.println(age);
		} // 사용자 정의 블록 (User-defined block) #2
		
		
//		System.out.println(age);
		// 유효범위를 초과해서 age에 빨간색이 뜸 
		
	} //main

} //end class
