//2022.03.28


package collectionframework.exam03_linkedlist;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class LinkedListExample {
	
	public static void main(String[] args) {
		
		List<String> list1 = new ArrayList<String>(); // 그냥 ArrayList
		List<String> list2 = new LinkedList<String>(); // 특화된 LinkedList // 요소 타입은 문자열로
		
//	-------------------------
		
		// 지역변수 선언, 왜? 시간 측정하는 리턴 타입이 long이다.
		long startTime; 
		long endTime;
		
//	------------------------
		
		startTime = System.nanoTime(); // 10억분의 1초 정확도로 현재시간을 반환
		
//		------- 이 for문 안쪽에 있는 코드가 얼마나 걸리는지를 측정함!---------
		
		for(int i=0; i<10000; i++) {
			list1.add(0, String.valueOf(i)); // 넣을때마다 뒤로 밀림
		} // classical for
		
		endTime = System.nanoTime(); // 10억분의 1초 정확도로 현재시간을 반환
		System.out.println("ArrayList 걸린시간: " + (endTime-startTime) + " ns");
		
//		---------------------------
		
		startTime = System.nanoTime();
		for(int i=0; i<10000; i++) {
			list2.add(0, String.valueOf(i));		// 0번 인덱스 추가 -> 계속 뒤로 밀림
		}// classical for
		
		endTime = System.nanoTime();
		System.out.println("LinkedList 걸린시간: " + (endTime-startTime) + " ns");
		
	} // main
	
} // end class



