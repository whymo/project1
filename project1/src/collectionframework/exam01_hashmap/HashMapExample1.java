//2022.03.29

package collectionframework.exam01_hashmap;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class HashMapExample1 {
	
	public static void main(String[] args) {
		//Map 컬렉션 생성
		// map 안에 들어갈 요소와 타입을 정해야함!
		Map<String, Integer> map = new HashMap<String, Integer>();
//		Map<String, Integer> map = new HashMap<g, Integer>(); => 이것도 가능
		
//		--------------------------------------------------즉석 과제------

		//객체 저장
		map.put("신용권", 85);
		map.put("홍길동", 90);	// 중복
		map.put("동장군", 80);
		map.put("홍길동", 95);	// 중복 -> 키가 중복되기 때문에, 기존거 삭제하고 들어감
		System.out.println("총 Entry 수: " + map.size());
		// => 중복으로 Entry수는 3개가 나온다
		
//		중복이 발생하면 기존의 값을 버리고 새로운 값을 넣는다!! **
		
//		----------------------------------------------------
		
		//객체 찾기		
		System.out.println("\t홍길동 : " + map.get("홍길동"));	// 키값을 알면 바로 뽑아낼 수 있음
		System.out.println();
		
//		-----------------------------------------------------
		
		//객체를 하나씩 처리 (순회)	
		// map 컬렉션에 있는 모든 요소들의 키(key)만 뽑아서, set<key> 객체로 되돌려줌
		Set<String> keySet = map.keySet();						
		
		Iterator<String> keyIterator = keySet.iterator();		// 외부반복자(iterator)를 이용한 순회
		
		while(keyIterator.hasNext()) {
		  String key = keyIterator.next();
		  
		  Integer value = map.get(key);
		  System.out.println("\t" + key + " : " + value);
		  
//		  keyIterator.remove();
		}	// while
		
//		-----------------
		
//		for(String key : map.keySet() ) {
//			
//			 Integer value = map.get(key);
//			  System.out.println("\t" + key + " : " + value);
//			  
//		} // enhanced for
		
		System.out.println();	
		
//		-----------------------------------------------------
			
		
		//객체 삭제
		map.remove("홍길동");
		System.out.println("총 Entry 수: " + map.size());
		
//		-------------------------------------------------------
		
		//객체를 하나씩 처리
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet(); // 요소 자체를 끄집어내서 순회?
		
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		
		while(entryIterator.hasNext()) {
		  Map.Entry<String, Integer> entry = entryIterator.next();
		  
		  String key = entry.getKey();
		  Integer value = entry.getValue();
		  System.out.println("\t" + key + " : " + value);
		} // while
		
//		-------------------------
		
//		for(Entry<String, Integer> key : map.entrySet()) {
//			
//			
//			  String key = entry.getKey();
//			  Integer value = entry.getValue();
//			  
//			  System.out.println("\t" + key + " : " + value);
//			  
//		} // enhanced for
//		
//		System.out.println();
		
//		-------------------------------------------------------
//		Entry<String, Integer> entry = key;
		
		//객체 전체 삭제
		map.clear();
		System.out.println("총 Entry 수: " + map.size());
		
	} // main
	
} // end class

