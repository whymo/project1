//2022.03.29

package collectionframework.exam02_hashtable;

import java.util.*;


public class HashtableExample {
	
	
	public static void main(String[] args) {
		// Hashtable : HashMap과 내부 구현은 같으나, 차이점은 thread-safe 
		Map<String, String> map = new Hashtable<String, String>();

//		 요소 집어넣음
		map.put("spring", "12");
		map.put("summer", "123");
		map.put("fall", "1234");
		map.put("winter", "12345");
		
		System.out.println(map);
		
//		-------------------------------
		// 왜 System.in을 함? 자바 입출력 이후에 이해 됨
		Scanner scanner = new Scanner(System.in);	// 콘솔창에 사용자가 입력한 데이터를 스캐닝떠서 받는 것 
		
		// 무한루프 돌리기 => 무한루프를 돌릴거면 탈출조건부터 생각해라!
		while(true) {
			
			// 입력받기 위한 프롬프트(prompt) 메세지.
			System.out.println("아이디와 비밀번호를 입력해주세요");
			
//			-------------- 로그인 인증 로직!! ----------------------------------------
			System.out.print("아이디: ");	// 오른쪽으로 입력받기 위해서 print 사용
			String id = scanner.nextLine();
			
			System.out.print("비밀번호: ");
			String password = scanner.nextLine();
			
			System.out.println();
			
//			# User Authentication(사용자 인증)
//			id 집어넣은 키값이 map.containsKey 여기에 포함하고 있느냐
			if(map.containsKey(id)) { // 입력한 아이디가 존재! 
				
				if(map.get(id).equals(password)) {	// 문자열 비교 -> 입력한 암호도 일치! (탈출조건)
					System.out.println("로그인 되었습니다");	
					
					break; // 아이디도 존재하고 입력한 암호도 일치하면 무한루트 파괴!
				} else {  // 암호(비밀번호)가 틀리면
					System.out.println("아이디 또는 암호 일치하지 않습니다."); // 비밀번호가 일치하지 않습니다. 
//											=> 아이디는 맞고 비번이 맞지 않아도 비번이 틀리다고 알려주면 안됨
				} // if-else	
				
			} else { // 아이디가 존재하지 않으면
				System.out.println("입력하신 아이디 또는 암호가 존재하지 않습니다"); // 여기서도 아이디 존재하지 않다고 알려주면 안됨
			} // if-else
			
		} // while
		
	} // main
	
}  //end class
