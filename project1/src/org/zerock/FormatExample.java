//2022.03.15

// 실습 : String.format

package org.zerock;

public class FormatExample {
	
	public static void main(String[] args) {
		String name = "Yoseph";
		int age = 23;
		double weight = 58.3;
		double height = 172.5;
		
//		%s : string 문자열
//		%d : 정수타입 변수
//		%f : 실수타입 변수 
//		String.format("formatting string", 가변인자); // 멋지게 찍으려고
//		String.format("1. name : %s", name);	// 포메팅 기호 하나면 오른쪽 하나 , 쌍이 맞아야한다
		
//		# 방법 1
//		System.out.println(
//			String.format("1. name : %s", name)
//				);
//		# 방법 2
		String result = String.format("1. name : %s", name);
		System.out.println(result);
		
//		# 실습
		result = String.format("2. age : %d" , age);
		System.out.println(result);
		
		
//		# 실습2
		result = String.format("name : %s, age : %s, weight : %s, height : %s" ,	// 타입 걱정 안해도 된다
				name, age, weight, height);			// 대신 순서는 맞아야한다! 쌍대로 맞게 찍는다
		System.out.println(result);
		
//		---------------------
		// 배열의 각 원소의 값을 하나의 문자열로 모두 출력하라!
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		// 이렇게라도 해보기!
		result = String.format("%s, %s, %s, %s, %s, %s, %s, %s, %s", 
				arr[0], arr[1], arr[2], arr[3], arr[4], arr[5], arr[6], arr[7], arr[8]);
		
		System.out.println(result);
		
		
		
	} // main

} // end class
