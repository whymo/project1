//2022.03.28


package collectionframework.exam02_vector;

import java.util.List;
import java.util.Vector;
import java.util.function.Consumer;


public class VectorExample {
	
	public static void main(String[] args) { 
		
//		1. 생성
		
		List<Board> list = new Vector<Board>();		// <> : 타입추론연산자
	
		list.add(new Board("제목1", "내용1", "글쓴이1"));	// 리스트 만듬 0
		list.add(new Board("제목2", "내용2", "글쓴이2"));	// 1
		list.add(new Board("제목3", "내용3", "글쓴이3"));	// 2 => 2번 인덱스 삭제
		list.add(new Board("제목4", "내용4", "글쓴이4"));	// 3 => 떙겨져서 2
		list.add(new Board("제목5", "내용5", "글쓴이5"));	// 4 => 땡겨져서 3 => 3번 인덱스 삭제
		
//		------------
		
//		2. 삭제 => 밀고당기는 현상이 생긴다
		
		list.remove(2);		// 중간요소를 삭제 -> 땡기는 현상 발생
		list.remove(3);

//		--------------
		
//		3. 조회(트레버스)
		
		
		for(int i=0; i<list.size(); i++) {
			Board board = list.get(i);
			System.out.println(board.subject + "\t" + board.content + "\t" + board.writer);
		} // classical for
		
		for(Board board : list) {
			
			
		} // enhanced for
		
//		----------------
//		# 익명구현객체
		
		// void accept(T t);
		list.forEach(new Consumer<Board>() { // Board 정해짐

			@Override
			public void accept(Board t) {
				System.out.println(t.subject + "\t" + t.content + "\t" + t.writer);
			} // accept / method stub 생성됨
			

		});		// enhanced for 처럼 순회함!
		
//		------------------
		// 함수형 인터페이스는 무조건 람다로!
		
//		# 람다
		
//		 void accept(T t); 
		list.forEach(
				t -> 
					System.out.println(t.subject + "\t" + t.content + "\t" + t.writer)
					); // forEach
		
//		----------------------------
		
		list.forEach(
				t ->  System.out.println(t)); // forEach
		
//		------------------------------
		
		list.forEach(System.out::println); //forEach
		
//		enhanced for 문 역할을 메소드 내부에서 한다!
		
//		-------------------------------
		

		
	} // main
	
} // end class

