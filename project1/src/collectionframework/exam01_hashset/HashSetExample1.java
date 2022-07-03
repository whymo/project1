//2022.03.28


package collectionframework.exam01_hashset;


import java.util.*;

import lombok.AllArgsConstructor;


public class HashSetExample1 {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java");
		set.add("iBATIS");
		
//		------------------
		
		
		int size = set.size();
		System.out.println("총 객체수: " + size);
		
//		------------------
		
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) { // hasNext false면 while문 빠져나오기
			String element = iterator.next();
			System.out.println("\t" + element);
		} //while
		
//		-----------------
		
		set.remove("JDBC");
		set.remove("iBATIS");
		
		System.out.println("총 객체수: " + set.size());
		
		for(String element : set) {
			System.out.println("\t" + element);
		} // enhanced for
		
		set.clear();		
		if(set.isEmpty()) { System.out.println("비어 있음"); }
		
	} // main
	
} // end class

