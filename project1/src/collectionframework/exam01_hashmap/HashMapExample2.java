//2022.03.29

package collectionframework.exam01_hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample2 {
	public static void main(String[] args) {
		
//		다형성-1
//		key는 학생객체로, 값(value)은 정수로(Integer)
		Map<Student, Integer> map = new HashMap<Student, Integer>();
//		Map<Student, Integer> map = new HashMap<>(); // 이렇게도 가능
		
		map.put(new Student(1, "홍길동"), 95);
		map.put(new Student(1, "홍길동"), 95);
		
		System.out.println("총 Entry 수: " + map.size());
		
		System.out.println(map);
		
	} // main
	
} //end class

