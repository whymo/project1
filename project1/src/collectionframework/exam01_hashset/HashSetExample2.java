//2022.03.29

package collectionframework.exam01_hashset;


import java.util.*;


public class HashSetExample2 {
	
	public static void main(String[] args) {
		Set<Member> set = new HashSet<Member>();
		
		// add 할때마다 중복을
		set.add(new Member("홍길동", 30));
		set.add(new Member("홍길동", 30));	// 불가! (중복판단)
		
		System.out.println("총 객체수 : " + set.size());
		
		System.out.println(set);

	} // main
	
} // end class

