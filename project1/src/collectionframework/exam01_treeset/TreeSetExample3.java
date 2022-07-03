package collectionframework.exam01_treeset;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample3 {
	
	
	public static void main(String[] args) {
		
		TreeSet<String> treeSet = new TreeSet<String>();
		
		//TreeSet은 요소의 타입이 숫자타입뿐만 아니라, 아래와 같이 문자열도
		// 이진트리로 자동정렬이 됩니다!
		treeSet.add("apple");
		treeSet.add("forever");		
		treeSet.add("description");
		treeSet.add("ever");
		treeSet.add("zoo");
		treeSet.add("base");
		treeSet.add("guess");
		treeSet.add("cherry");
		
		System.out.println(treeSet);
		
		// 범위 검색
		System.out.println("[c~f 사이의 단어 검색]");
		NavigableSet<String> rangeSet = treeSet.subSet("c", true, "f", true);
		for(String word : rangeSet) {
			System.out.println(word);
		} // for

	} //main
	
} // end class
