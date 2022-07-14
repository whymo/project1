package coding_test_Algorism;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Baekjoon_16953 {
	
	//==========================================================================
	// 문제 :
	// 정수 A를 B로 바꾸려고 한다. 가능한 연산은 다음과 같은 두 가지이다.
	// 1. 2를 곱한다.
	// 2. 1을 수의 가장 오른쪽에 추가한다. 
	// 두가지 방법을 조합해서 A를 B로 바꾸는데 필요한 연산의 최솟값을 구해보자.
	//==========================================================================
	static long a; // a는 시작하는 숫자
	static long b; // b는 도달해얗 하는 숫자
	//==========================================================================
	static int count; // 최소한의 숫자
	//==========================================================================
	
	static int bfs() {
		
		Queue<Long> q = new LinkedList<>();
		// 큐 클래스를 사용한다.
		// 큐는 먼저 들어간 자료가 먼저 나오는 구조로 구성되어 있다.
		// 큐는 한 쪽 끝은 프런트(front)로 정하여 삭제 연산만 수행하고,
		// 다른 쪽에서는 리어(rear)로 삽입 연산만 수행한다.
		// 큐는 주로 BFS에서 사용된다.
		
		q.add(a);
		
		while(!q.isEmpty()) {
			
			int size = q.size();
			// q의 사이즈(길이)를 변수로 넣는다.
			
			for( int i = 0; i < size; i++ ) {
				
				long temp = q.poll();
				// 큐에서 하나를 빼서 변수에 저장한다.
				// 큐는 먼저 들어간 자료가 먼저 나오기에, 첫번째 원소가 나온다.
				// 처음에는 a가 그대로 나온다.
				
				if( temp == b ) { return count + 1; } 
				// if - 만약 b에 도달했다면 횟수를 반환 및 추출
				// 횟수는 1부터 시작하기에 +1을 해줘야 한다.
				
				if ( temp * 2 <= b ) q.add(temp*2);
				// 만약 temp * 2가 b 이하라면 큐에 temp *2한 숫자를 넣는다. ( 방법 1 )
				
				if( ( temp * 10 + 1 ) <= b ) q.add( (temp * 10) + 1 );
				// 만약 오른쪽에 1을 더한 숫자가 b 이하라면 temp에 오른쪽에 1을 더한 숫자를 큐에 넣는다. ( 방법 2 )
				
				// 이렇게 되면 큐에는 바뀐 숫자 1개만 존재하게 된다.
				// 단 바뀐 숫자가 b 초과일 경우에는 큐에 아무것도 들어가지 않기에 큐가 비어지게 된다.
				
			} // for : q의 길이만큼 반복
			
			count ++;
			
		} // while : q가 비어질때까지 무한반복
		
		return -1;
		// 만약 b가 될 수 없다면 -1을 출력
		
	} // bfs 메소드
	
	public static void main(String[] agrs) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		// 시작하는 숫자
		a = Long.parseLong(st.nextToken());
		
		// 되어야 하는 숫자
		b = Long.parseLong(st.nextToken());
		
		System.out.println(bfs());
		
	} // main

} // end class
