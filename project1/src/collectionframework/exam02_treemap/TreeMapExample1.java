//2022.03.30

package collectionframework.exam02_treemap;

import java.util.Map;
import java.util.TreeMap;


public class TreeMapExample1 {
	
	
	public static void main(String[] args) {
		
		// 변수의 타입명 : TreeMap => 장점 검색!!
		TreeMap<Integer,String> scores = new TreeMap<Integer,String>();
		
//		scores.put(new Integer(87), "홍길동");
		scores.put(87, "홍길동");
		scores.put(98, "이동수");
		scores.put(75, "박길순");
		scores.put(95, "신용권");
		scores.put(80, "김자바");
		
		System.out.println(scores);
		
//		------------------------------
		
		Map.Entry<Integer, String> entry = null;
		
		// 가장 처음 entry가 뭐냐? => 작은값부터 큰값순서라서 첫번째는 가장 작은 값이다
		entry = scores.firstEntry();
		System.out.println("가장 낮은 점수: " + entry.getKey() + "-" + entry.getValue());
		
//		---
		
		entry = scores.lastEntry();
		System.out.println("가장 높은 점수: " + entry.getKey() + "-" + entry.getValue() + "\n");
		
		
//		---
		
		entry = scores.lowerEntry(95);
		System.out.println("95점 아래 점수: " + entry.getKey() + "-" + entry.getValue());
		
//		---

		
		entry = scores.higherEntry(95);
		System.out.println("95점 위의 점수: " + entry.getKey() + "-" + entry.getValue() + "\n");
		
//		---

		entry = scores.floorEntry(95);	// 이 메소드가 calculrator 의 덧셈 기능을 하는것!
		System.out.println("95점 이거나 바로 아래 점수: " + entry.getKey() + "-" + entry.getValue());
		
//		---

		
		entry = scores.ceilingEntry(new Integer(85));
		System.out.println("85점 이거나 바로 위의 점수: " + entry.getKey() + "-" + entry.getValue() + "\n");
		
//		---

		// # 가장 낮은 키값을 가지고있는 사람들부터 끄집어냄
		while(!scores.isEmpty()) {
			entry = scores.pollFirstEntry();
			System.out.println(entry.getKey() + "-" + entry.getValue() + "(남은 객체 수: " + scores.size() + ")");
		} // while
		
	} // main
	
} //end class
