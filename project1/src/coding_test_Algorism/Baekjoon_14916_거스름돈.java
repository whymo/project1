package coding_test_Algorism;

import java.util.Scanner;

public class Baekjoon_14916_거스름돈 {
	
	public static void main(String[] agrs) {
		
		// ===============================================================
		// 문제 :
		// 손님이 2원짜리와 5원짜리로만 거스름돈을 달라고 한다. 
		// 2원짜리 동전과 5원짜리 동전은 무한정 많이 가지고 있다. 
		// 동전의 개수가 최소가 되도록 거슬러 주어야 한다. 
		// 거스름돈이 n인 경우, 최소 동전의 개수가 몇 개인지 구하시오.
		// ===============================================================
		
		Scanner sc = new Scanner(System.in);
		
		// 1. 거슬러 줘야 하는 금액
		int N = sc.nextInt();
		
		// 2. 동전의 개수를 저장할 변수
		int count = 0;
		
		// 3. 동전의 최소한의 개수 구하기
		while ( true ) {
			
			// 4. 최소한의 동전을 위해서는 5원부터 해야 한다.
			if ( N % 5 == 0 ) {
				count += N / 5;
				break;
			} else {
				N -= 2;
				count ++;
			} // if - else
			
			// 5. 나눠지지 않을 경우
			// + 5와 2로 구성되는 수일 경우 결국 마지막에 0이 되기에,
			// + if( N % 5 == 0 )에서 break를 통해 나올 수 있다.
			// + 하지만 나누어 떨어지지 않을 경우에는 -2로 인해 음수가 된다.
			if ( N < 0 ) {
				System.out.println(-1);
				return;
			} // if
			
		} // while
		
		System.out.println(count);
		
	} // main

} // end class
