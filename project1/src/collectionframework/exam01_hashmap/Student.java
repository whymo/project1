//2022.03.29


package collectionframework.exam01_hashmap;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString
@EqualsAndHashCode
@AllArgsConstructor
public class Student {
	
//	학생이 가진 정보
	public int sno;	
	public String name;
	
//-------------------------@AllArgsConstructor 롬복으로 대체 가능--------------------------	
//	public Student(int sno, String name) {
//		this.sno = sno;
//		this.name = name;
//	} // @AllArgsConstructor 롬복으로 대체 가능

	
//	-----------------------@EqualsAndHashCode 어노테이션으로 대체 가능------------------
//	@Override
//	public boolean equals(Object obj) {
////		if(obj instanceof Student student) {		// 자바 16 이상에서만 쓸 수 있음 @sinse 16 and above
//		if(obj instanceof Student) {
//			Student student = (Student) obj;
//			
//			return (sno==student.sno) && (name.equals(student.name)) ;
//		} else {
//			return false;
//		} // if-else
//	} // equals
//
//	@Override
//	public int hashCode() {
//		return sno + name.hashCode();
//	} // hashCode
	
} // end class

