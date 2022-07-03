//2022.03.28

package collectionframework.exam01_arraylist;

import java.util.*;

import collectionframework.exam03_properties.PropertiesExample;

public class ArrayListExample {
	
	// list : (1) 순서보장 : 인덱스 번호를 사용하여 조작 (2) 중복허용 (3) 빈번한 추가삭제가 적어야만 효율적
	public static void main(String[] args) {
		
//		1. 리스트 컬렉션 생성 (C)
		
		// 제네릭을 사용하면 강제형변환이 사라진다!
		// lvalue(부모타입) =  rvalue(자식타입, 구현클래스)
		List<String> list = new ArrayList<String>();	// 배열과 비슷하게 저장한다 / 다형성-1
//		List<String> list = new ArrayList<String>();
		
		
		list.add("Java");	// 인덱스 0 에는 Java
		list.add("JDBC");	// 인덱스 1 에는 JDBC
		list.add("Servlet/JSP"); // 인덱스 2
		list.add(2, "Database");	// add(index, String) => 인덱스번호2에 데이터베이스를 넣어라
									// 인덱스 번호 2번에 Database를 넣고 인덱스 번호 2번에 있던 Servlet/JSP는 3번으로 밀림
		list.add("iBATIS"); // 인덱스 번호 4번 왜?  2번에 있던 Servlet/JSP가 3번으로 밀려서
		
		
//		---------------------------------------------------------------
		
//		2. 리스트의 컬렉션 사용 (C)

		int size = list.size();		// 몇개인지 확인
		
		System.out.println("총 객체수: " + size);		
		System.out.println();
		
//		--------------
				
//		(R)
		
		String skill = list.get(2);		// 내가 원하는 특정 인덱스 번호만 얻고싶을때 : get 사용
		
		System.out.println("2: " + skill);	// 2에는 Database가 들어가있다!
		System.out.println();
		
//		---------------

//		* 리스트 트레버스 할 수 있다 (R)
		
//		for(int i=0; i<list.size(); i++) {
//			String str = list.get(i);
//			System.out.println(i + ":" + str); // 모든 요소를 순서대로 찍는다!
//		} // classical for
		
//		-----------------
		
		// enhanced for의 사용조건 : Iterable 인터페이스의 구현객체
		for(String str : list) {
			
			System.out.println(">> str : " + str);
			
		} // enhanced for
		
		System.out.println(); 
	
		
//		---------------
		
//		3. 삭제하기 (D)
				
		list.remove(2);
		list.remove(2);
		list.remove("iBATIS");	// 요소 객체를 지정하여 삭제도 가능!	
		
//		---------------
		
		for(int i=0; i<list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + ":" + str);
		} // classical for
		

		
	} //main
	
} // end class

