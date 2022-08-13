package coding_test_Algorism;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_2810_컵홀더 {
	
	public static void main(String[] args) throws Exception {
		
		// ==============================================================
		// 문제 :
		// 극장의 한 줄에는 자리가 N개가 있다. 
		// 서로 인접한 좌석 사이에는 컵홀더가 하나씩 있고, 
		// 양 끝 좌석에는 컵홀더가 하나씩 더 있다. 
		// 또, 이 극장에는 커플석이 있다. 커플석 사이에는 컵홀더가 없다.
		//  이때, 이 줄에 사람들이 모두 앉았을 때, 컵홀더에 컵을 꽂을 수 있는 최대 사람의 수를 구하는 프로그램을 작성하시오. 
		// 모든 사람은 컵을 한 개만 들고 있고, 자신의 좌석의 양 옆에 있는 컵홀더에만 컵을 꽂을 수 있다.
		// S는 일반 좌석, L은 커플석을 의미하며, L은 항상 두개씩 쌍으로 주어진다.
		// ==============================================================
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 1. 좌석의 수를 입력받을 변수 저장
		int N = Integer.parseInt(br.readLine());
		
		// 2. 좌석의 위치, 종류 입력받는 변수
		String seat = br.readLine();
		
		// 3. 컵홀더에 넣을 수 있는 컵의 수
		// + 좌석의 종류가 무엇이든 컵홀더가 1개는 존재하기에 1부터 시작한다.
		// + 만약 좌석이 s일 경우에는 count를 1을 증가시키면 되고,
		// + 만약 L이 나올 경우에는 반드시 다음이 L이기에 다음으로 넘어감과 동시에 1을 증가시키면 된다. 
		int count = 1;
		
		for ( int i=0; i< N; i++ ) {
			
			// 4. 현재의 좌석이 일반인지 커플인지 추출하기
			char now = seat.charAt(i);
			
			if ( now == 'S' ) {
				
				// + 만약 일반좌석이면 양쪽에 컵홀더가 있기에 1을 더하면 된다.
				// + 양쪽이기에 + 2를 해야된다고 생각할 수도 있으나,
				// + 양쪽 끝이 아닌 이상 +1만 하면되며,
				// + count를 1부터 시작하기에 1만 더하면 된다.
				count ++;
				
			} else if ( now == 'L' ) {
				
				// + 커플석의 경우에는 가운데에 컵홀더가 없으며, 2좌석이 연달아 있기에
				// + for 반복문에서 i를 다음으로 넘긴후에 count +1을 해주면 된다. 
				i ++;
				count ++;
				
			} // if - else if
			
		} // for : 컵 꽂는 최대 수 구하기
		
		// 5. 그러나 S좌석만 있을 경우에는 사람의 수보다 컵홀더의 수가 많을 수 있다.
		// + 그렇기에 사람의 수보다 컵홀더의 수가 많을 경우에는 사람의 수로 조정해야 한다.
		if ( count > N ) {
			count = N;
		} // if
		
		System.out.println(count);
		
	} // main

} // end class
