//2022.03.28

package collectionframework.exam01_hashset;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString
@EqualsAndHashCode
@AllArgsConstructor
public class Member extends Object{
	public String name;
	public int age;
	
//# 롬복 대체
//	public Member(String name, int age) {
//		this.name = name;
//		this.age = age;
//	}

//# @EqualsAndHashCode 롬복 대체
//	@Override
//	public boolean equals(Object obj) {
//		if(obj instanceof Member) {
//			Member member = (Member) obj;
//			return member.name.equals(name) && (member.age==age) ;
//		} else {
//			return false;
//		}
//	} // equals
//
//	public int hashCode() {
//		return name.hashCode() + age;
//	} // hashCode
	
} // end class
