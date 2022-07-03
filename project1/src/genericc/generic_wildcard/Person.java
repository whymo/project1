//2022.03.24

package genericc.generic_wildcard;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
@AllArgsConstructor			// 필드를 매개변수를 갖는 생성자를 만들어줌!
public class Person {
	private String name;
	
	
//	public Person(String name) {
//		this.name = name;
//	} // constructor

	
//	public String getName() { return name; } -> @Getter 어노테이션 붙임
//	public String toString() { return name; } -> @ToString 어노테이션 붙임
	
}
