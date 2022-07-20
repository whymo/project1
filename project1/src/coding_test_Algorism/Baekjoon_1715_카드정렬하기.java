package coding_test_Algorism;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Baekjoon_1715_카드정렬하기 {
	
	public static void main (String [] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 카드의 수
		int N = Integer.parseInt(br.readLine());
		
		// 최소 비교 횟수를 구하는 변수 생성
		long sum = 0;
		
		// 카드를 원소로 가지는 우선순위 큐 객체 생성
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		// + 우선순위 큐는 일반 큐와 다르게 선입선출이 아닌
		// + 우선순위에 따라서 나오게 된다.
		
		// 우선순위 큐에 원소 넣기
		for ( int i = 0; i < N; i++ ) {
			pq.add(Integer.parseInt(br.readLine()));
		} // for
		
		while( pq.size() > 1 ) {
			
			int a = pq.poll();
			int b = pq.poll();
			
			// 2개를 더한 숫자를 sum에 저장
			sum += ( a + b );
			
			// 큐에 앞에서 더한 값을 새로 추가
			pq.add(a+b);
			
		} // while : 사이즈가 1일때는 다 더해서 결과만 남은 상태이다.
		
		System.out.println(sum);
		
	} // main

} // end class
