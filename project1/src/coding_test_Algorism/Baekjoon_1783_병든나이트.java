package coding_test_Algorism;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Baekjoon_1783_병든나이트 {
	
	public static void main(String[] args) throws Exception {
		
		// ===============================================================================================
		// 문제 :
		// 병든 나이트가 N × M 크기 체스판의 가장 왼쪽아래 칸에 위치해 있다. 
		// 병든 나이트는 건강한 보통 체스의 나이트와 다르게 4가지로만 움직일 수 있다.
		// 1. 2칸 위로, 1칸 오른쪽
		// 2. 1칸 위로, 2칸 오른쪽
		// 3. 1칸 아래로, 2칸 오른쪽
		// 4. 2칸 아래로, 1칸 오른쪽
		// + 단! 이동횟수가 4를 초과하면, 5번째 이동부터는 1 ~ 4번 이동이 모두 가능해야만 이동이 가능하다.
		// ===============================================================================================
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		// 이동 최대횟수
		int count = 0;
		
		if ( N == 1 ) {
			count = 0; 
		} else if ( N == 2 ) {
			// 시작하는 위치는 이동에서 빼줘야 하기 때문에 -1을 해줘야 한다.
			// 2인 이유는 세로가 2인 경우 2, 3번을 반복하면서 움직여야 하는데,
			// 그러면 오른쪽으로 2칸씩만 움직임이 가능하다.
			count = ( M - 1 ) / 2;
			
			if ( count > 3 ) {
				count = 3;
			} // 원래는 4까지 가능하나 출력시 +1을 해줄 예정이니 3으로 고정
			
		} else if ( M < 7 ) {
			
			// 세로 길이가 2이상이라면 최대 움직임을 위해서
			// 오른쪽으로 1칸씩 움직이는 1번과 4번 방식을 사용해야 하는데
			// 그러면 세로 길이에서 시작하는 위치 뺀 값이 최대 움직임이다.
			// + 7로 제한을 둔 이유는 세로길이 3이상 가로길이 8이상부터는 이동횟수 제한이 풀리기 때문이다.
			count = M - 1;
			
			if ( count > 3 ) {
				count = 3;
			}
			
		} else {
			
			// 4회를 초과하기 위해서는 1 - 4번까지의 조건을 모두 만족해야 하기에
			// 그렇게 되면 가로로 6칸 움직이고, 세로는 시작위치와 동일한 위치로 된다.
			// 그러면 기본 횟수를 4를 한 후에, 그 다음 이동이 가능한 횟수를 구하면 되는데
			// 그러면 처음위치를 빼야하기 때문에 M - 6(가로로 이동한 수)에서 -1(처음위치)를 하여
			// M - 7에서 기본횟수인 4를 더하면 된다.
			// 어차피 이 이후에는 1씩 이동하기에 M - 7 + 4가 정답이다.
			count = M - 7 + 4;
					
		} // if - else if - else
		
		System.out.println(count + 1);
		
	} // main

} // end class
