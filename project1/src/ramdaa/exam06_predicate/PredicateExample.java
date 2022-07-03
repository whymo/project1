//2022.03.28

package ramdaa.exam06_predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

// 표준 함수적 인터페이스(consumer/supplier/function/operator/predicate)에 선언된 추상메소드는,
// 특정 비지니스 로직을 염두해 두고 만든 추상메소드가 아니다!

public class PredicateExample {
	private static List<Student> list = Arrays.asList(
			new Student("홍길동", "남자", 90),
			new Student("김순희", "여자", 90),
			new Student("감자바", "남자",  95),
			new Student("박한나", "여자", 92)
	);
	
//  Predicate : 추상메소드 하나 가지고 있다		
//    boolean test(T t);
	public static double avg(Predicate<Student> predicate) {	
		int count = 0, sum = 0;
		for(Student student : list) {
			if(predicate.test(student)) {	// 이거 true/false에 따라
				count++;
				sum += student.getScore();	// 부합하면 
			} // if
		} // enhanced for
		
		return (double) sum / count;      // 마지막 순서
	} // avg
		
	public static void main(String[] args) {
		double maleAvg = avg( t ->  t.getSex().equals("남자") );
		System.out.println("남자 평균 점수: " + maleAvg);
			
//		-------------------------------------------------------------
		
		double femaleAvg = avg( t ->  t.getSex().equals("여자") );
		System.out.println("여자 평균 점수: " + femaleAvg);
	} // main
} //end class
