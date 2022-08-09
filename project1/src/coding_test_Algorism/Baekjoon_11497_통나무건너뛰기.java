package coding_test_Algorism;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baekjoon_11497_통나무건너뛰기 {
	
	public static void main(String[] args) throws Exception {
		
		// ==============================================================
		// 문제 :
		// 남규는 통나무를 세워 놓고 건너뛰기를 좋아한다.
		// 그래서 N개의 통나무를 원형으로 세워 놓고 뛰어놀려고 한다. 
		// 남규는 원형으로 인접한 옆 통나무로 건너뛰는데, 
		// 이때 각 인접한 통나무의 높이 차가 최소가 되게 하려 한다.
		// 통나무 건너뛰기의 난이도는 인접한 두 통나무 간의 높이의 차의 최댓값으로 결정된다.
		// ==============================================================
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		// 1. 테스트를 몇 번할지 저장하는 변수 T
		int T = Integer.parseInt(br.readLine());
		
		// 2. 테스트할 때 사용할 배열 변수 arr
		int [] arr;
		
		// 3. 테스트 하기
		for ( int i = 0; i < T; i++ ) {
			
			// 4. 배열의 원소가 몇 개인지 저장하는 변수 N
			int N = Integer.parseInt(br.readLine());
			arr = new int [N];
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			
			// 5. 배열에 원소 넣기
			for ( int j = 0; j < N; j++ ) {
				arr[j] = Integer.parseInt(st.nextToken());
			} // inner for : 배열에 원소 넣기
			
			// 6. 배열 오름차순으로 정렬하기
			Arrays.sort(arr);
			
			// 7. 차이를 최소화하기 위해서는 가운대에 큰수를 양쪽에는 작은수를 배치해야 한다.
			// + 그러기 위해서는 작은 순서대로 오른쪽 왼쪽 순서대로 배치하면 된다.
			
			// + 양쪽에 배치하기 위한 인덱스 번호를 저장할 변수 생성
			// + 인덱스 번호는 0번부터 시작하기에 N - 1을 해야 한다.
			int left = N - 1;
			int right = 0;
			
			// + 정렬 후의 배열을 저장할 배열 생성
			int [] ans = new int [N];
			
			// + 새로운 배열에 정렬
			for ( int k = 0; k < N; k++ ) {
				
				if ( k % 2 == 0 ) {
					ans[left --] = arr[k];
				} else {
					ans[right ++] = arr[k];
				} // if : 홀수인지 짝수인지에 따라서 배치
				
			} // inner for2
			
			// 8. 인접한 원소끼리 차이 구하기
			// + 가장 최대로 차이나는 것 구하기
			int answer = 0;
			
			for ( int o = 1; o < ans.length; o++ ) {
				// + Math.abs는 절대값을 반환한다.
				answer = Math.max( answer, Math.abs( ans[o] - ans[o - 1] ) );
			} // inner for3
			
			// + 가장 마지막 원소와 가장 첫번째 원소도 비교
			answer = Math.max(answer, Math.abs(ans[0] - ans[N - 1]) );
			
			System.out.println(answer+ " ");
			
		} // outer for
		
	} // main

} // end class
