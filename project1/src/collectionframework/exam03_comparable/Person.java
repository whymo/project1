//2022.03.30

package collectionframework.exam03_comparable;

import lombok.AllArgsConstructor;


@AllArgsConstructor
public class Person implements Comparable<Person> {
	
	public String name;
	public int age;
	
//	@AllArgsConstructor -> 이 롬복으로 대체
//	public Person(String name, int age) {
//		this.name = name;
//		this.age = age;
//	}
	
	@Override
	public int compareTo(Person o) {
		if(age<o.age) return -1;
		else if(age == o.age) return 0;
		else  return 1;
	} // compareTo
	
} // end class
