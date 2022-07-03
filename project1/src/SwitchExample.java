
//2022.03.03

public class SwitchExample {
	
	public static void main(String[] args) {
		
		int to = 1;
		int from = 6;
		
		int num = (int)(Math.random()*(to-from+1)) + from;
		
		System.out.println("num= " + num);
		
		// 왜 케이스마다 break가 있을까?
		// 실행문자 다 수행 시켰으면 이걸로 switch문 끝내라! 라는 의미
		switch(num) {
		case 1 :
			System.out.println("1번이 나왔습니다.");
			break;	// 현재 블록을 깨뜨려라! 나와라!
		case 2 :
			System.out.println("2번이 나왔습니다.");
			break;
		case 3 :
			System.out.println("3번이 나왔습니다.");
			break;
		case 4 :
			System.out.println("4번이 나왔습니다.");
			break;
		case 5 :
			System.out.println("5번이 나왔습니다.");
			break;
		case 6 :
			System.out.println("5번이 나왔습니다.");
			break;
		default : // 모든 케이스랑 일치하지 않으면 실행됨
			System.out.println("6번이 나왔습니다.");
			
			// break: --> 디폴트에 브레이크는 필요 없다 왜냐면 중괄호인 블록 끝을 만나면 끝나기 때문에!
			// 디폴트는 항상 마지막에 나와야 하는가?
			// 디폴트는 위에있던 중간에 있던 상관없다! 하지만! 위에 놓으면 break;을 넣어야 한다!
			// 스위치문은 break를 넣지 않으면 쭉 실행된다ㅇ
			
		} // switch
		
		// default값이 나올 기회가 없다?
		// 만약 case6에 6번이 나왔습니다로 하고 default에 7,8,9가 나온다 하면 그럴리는 없으니까 default 지워줘도 된다
		
		
	} // main

} // end class
