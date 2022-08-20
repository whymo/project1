package coding_test_Algorism;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Baekjoon_15903_카드합체놀이 {
	
	public static void main (String[] args) throws Exception {
		
		// ==========================================================================
		// 문제 :
		// 아기 석환이는 자연수가 쓰여진 카드를 n장 갖고 있다.
		// 카드 합체 놀이는 이 카드들을 합체하며 노는 놀이이다. 
		// 카드 합체는 다음과 같은 과정으로 이루어진다.
		// ==========================================================================
		// 1. x번 카드와 y번 카드를 골라 그 두 장에 쓰여진 수를 더한 값을 계산한다. (x ≠ y)
		// 2. 계산한 값을 x번 카드와 y번 카드 두 장 모두에 덮어 쓴다.
		// ==========================================================================
		// 이 카드 합체를 총 m번 하면 놀이가 끝난다.
		// m번의 합체를 모두 끝낸 뒤, n장의 카드에 쓰여있는 수를 모두 더한 값이 이 놀이의 점수가 된다. 
		// 이 점수를 가장 작게 만드는 것이 놀이의 목표이다.
		// 참고 : https://suhyeokeee.tistory.com/153
		// ==========================================================================
		// + 이를 위해서는 작은 수끼리 더해야 한다.
		// + 그래야 작은 수가 덮어 씌워지게 된다.
		// ==========================================================================
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 1. n과 m을 입력받자! ( 공백으로 구분 )
		String [] arr1 = br.readLine().split(" ");
		
		// + 카드의 수
		int n = Integer.parseInt(arr1[0]);
		
		// + 합체하는 총 번수
		int m = Integer.parseInt(arr1[1]);
		
		// 2. 카드를 저장할 배열 생성
		long [] card = new long [n];
		
		// 2. 입력받을 문자열을 구분하여, 배열에 넣기
		String [] arr2 = br.readLine().split(" ");
		
		for ( int i = 0; i < n; i++ ) {
			
			card[i] = Long.parseLong(arr2[i]);
			
		} // for
		
		// 3. 카드 합체 진행
		for ( int i = 0; i < m; i++ ) {
			
			// + 정렬을 반복문 안에 넣는 이유는 
			// + 수정된 카드가 생기면 또 작은 수끼리 더해야 되기 때문이다.
			Arrays.sort(card);
			
			// + 임시변수 sum에 가장 작은 수 2개를 구해서 이를 덮어 씌운다.
			long sum = card[0] + card[1];
			card[0] = sum;
			card[1] = sum;
			
		} // for2
		
		// 4. 카드에 있는 수 더하기
		long answer = 0;
		
		for ( int i = 0; i < n; i++ ) {
			answer += card[i];
		} // for3
		
		System.out.println(answer);
		
	} // main

} // end class
