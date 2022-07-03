//2022.03.29

package collectionframework.exam01_treeset;

import java.util.NavigableSet;
import java.util.TreeSet;


public class TreeSetExample2 {
	
	public static void main(String[] args) {
		
		TreeSet<Integer> scores = new TreeSet<Integer>();
		
		scores.add(87);
		scores.add(98);
		scores.add(75);
		scores.add(95);
		scores.add(80);
		
		System.out.println(scores);
		
//		------------------------------
		
		NavigableSet<Integer> descendingSet = scores.descendingSet();
		
		for(Integer score : descendingSet) {
			System.out.print(score + " ");
		} // enhanced for
		System.out.println();
		
//		-------
		
		
		NavigableSet<Integer> ascendingSet = descendingSet.descendingSet();
		
		for(Integer score : ascendingSet) {
			System.out.print(score + " ");
		} // enhanced for
		
	} //main
	
} // end class
