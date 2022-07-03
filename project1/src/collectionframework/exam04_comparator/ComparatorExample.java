//2022.03.30

package collectionframework.exam04_comparator;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;


public class ComparatorExample {
	
	public static void main(String[] args) {
		/*
		TreeSet<Fruit> treeSet = new TreeSet<Fruit>();
		//Fruit이 Comparable을 구현하지 않았기 때문에 예외 발생
		treeSet.add(new Fruit("포도", 3000));
		treeSet.add(new Fruit("수박", 10000));		
		treeSet.add(new Fruit("딸기", 6000));
		*/
		
		// 외부객체 비교자
//		TreeSet<Fruit> treeSet = new TreeSet<Fruit>(new DescendingComparator());
		
		Comparator<? super Fruit> comparator = new DescendingComparator();
		
	
		TreeSet<Fruit> treeSet = new TreeSet<>(comparator);
		treeSet.add(new Fruit("포도", 3000));
		treeSet.add(new Fruit("수박", 10000));		
		treeSet.add(new Fruit("딸기", 6000));
		
		System.out.println(treeSet);
		
//		-----순회 (traverse)
//		Iterator<Fruit> iterator = treeSet.iterator();
//		
//		while(iterator.hasNext()) {
//			Fruit fruit = iterator.next();
//			System.out.println(fruit.name + ":" + fruit.price);
//		} // while
		
	} // main
} // end class
