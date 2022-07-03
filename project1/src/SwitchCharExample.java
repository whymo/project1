
//2022.03.03

public class SwitchCharExample {
	
	public static void main(String[] args) {
		
		//캐릭터에 66이 들어갔다 66이 대문자 A이거나 소문자 a이면 우수회원이다 ~
		// 스위치문은 정수 뿐만 아니라 문자도 가능하다
		char grade = 'B' ; //66
		
		switch(grade) {
			
		case 'A' :
		case 'a' :
			System.out.println("우수 회원입니다.");
			break;
		case 'B' : // 여기에는 실행문이 없다 , 대문자나 소문자 상관없이 일반회원이다 / 스위치문의 밀고내려가는 성질을
					// 이해하면 대문자 B에도 실행문을 넣는건 중복된 코드이다!, 코딩에서 중복은 피해야한다!
		case 'b' :
			System.out.println("일반 회원입니다.");
			break;
		default :
			System.out.println("손님입니다.");
		
		
		} // switch
		
	} // main

} // end class
