//2022.03.28

package collectionframework.exam01_arraylist;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ArraysAsListExample {
	
	public static void main(String[] args) {
		
		List<String> list1 = 
//				Arrays.<String>asList("홍길동", "신용권", "감자바");
				Arrays.asList("홍길동", "신용권", "감자바");		// 정적메소드 / 다형성-1

		System.out.println("list : " + list1); // list : [홍길동, 신용권, 감자바] => 현재 요소가 그대로 찍힘
		
		for(String name: list1) {
			System.out.println(name);
		} //enhanced for
		
//		---------------------
		
	
		
//		Integer integer = 1; // Auto-boxing
//		int i = integer; // Auto-Unboxing
		
		List<Integer> list2 = Arrays.asList(1, 2, 3); //다형성-1 / (1, 2, 3) 기본타입 들어감 => 오토박싱 /List<Integer> wrapper 타입
		
		for(int value : list2) {
			System.out.println(value);
		} // enhanced for
		
	} // main
	
} // end class
