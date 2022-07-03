//2022.03.15

package org.zerock;

//# 과제8 => factorial 구하기
//
// # 
//1) n! -> n factorial
//재귀함수란?
//하나의 함수에서 자신을 다시 호출하여 작업을 수행하는 방식으로 문제해결하는 방법
//if n = 2, 2! = 1 x 2
//if n = 3, 3! = 1 x 2 x 3
//if n = 7, 7! = 1 x 2 x 3 x 4 x 5 x 6 x 7
//
//2) n!에서, n의 숫자가 몇일때 여러분 pc로 답이 안나오는지 알려주세요!
//* 곱셈밖에 없다
//* 증감식 1씩 증가시키기
//* 상당히 빠르게 스택값이 올라감
//* for문 / self infition? 메소드 안에서 자기를 다시 호출하는 
//* 완성시켜라!!!
//* 조원마다 자기 생각이 다르기 때문에 여러개를 만들어 봐라!!
//* 시간도 카운트 해보기! -> 

public class Example13 {
	
	public static void main(String[] args) {
		
		long num = 1;
		long fac = 1;
		
		for(int i = 1; i <= num; i++) {
			fac = fac * i;
			
			System.out.println(num + "! =" + fac);
			
			
			if(fac <= 0)
				
				break;
			
			num++;
			
		} // for
		
//			System.out.println(num + "! =" + fac);
			System.out.println(num + "!" + "에서 부터 출력오류 발생 !");
			

	} // main

} // end class

