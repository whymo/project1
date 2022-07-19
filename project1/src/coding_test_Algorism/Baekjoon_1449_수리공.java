package coding_test_Algorism;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baekjoon_1449_수리공 {
	
	public static void main (String [] args) throws IOException {
		
		// 물이 새는 곳을 공백으로 구분
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String [] sarr = br.readLine().split(" ");
		
		// 물이 새는 곳의 수
		int N = Integer.parseInt(sarr[0]);
		
		// 테이프의 길이
		int L = Integer.parseInt(sarr[1]);
		
		// 물이 새는 곳을 원소로 가지는 배열
		int [] arr = new int[N];
		
		// 물이 새는 곳이 적힌 문자열을 공백으로 나눠 배열에 넣음
		sarr = br.readLine().split(" ");
				
		// 배열에 원소 집어 넣기 ( String타입 -> int타입의 배열로 옮김 )		
		for ( int i = 0; i < N; i++ ) {
			arr[i] = Integer.parseInt(sarr[i]);
		} // for
		
		// 배열을 오름차순으로 정렬하기
		// 1 5 9 2 6 4 이렇게 들어오면 정확한 계산이 불가능하기에 정렬이 필요하다.
		Arrays.sort(arr);
		
		// 테이프의 수
		int count = 1;
		
		int idx = 0;
		
		for ( int i = idx + 1; i < arr.length; i++ ) {
			
			// arr[idx]의 의미는 arr 0번째인 첫번째 원소부터 테이프를 붙이면
			// 양쪽 끝에 0.5씩 여유분을 두어야 하기 때문에 arr[0] + 테이프 길이 -1만큼 붙일 수 있다.
			// 만약 테이프의 길이가 끝났는데, 다음 원소가 존재할 경우 +1을 해줘야 한다.
			if ( ( arr[idx] + L - 1 ) < arr[i] ) {
				
				count ++;
				idx = i;
				
			} // inner for
			
		} // outer for : 원소 1부터 시작하는 이유는 0번부터 붙이기에 0번은 당연히 테이프가 붙기에 0번은 무시가 가능하다.
		
		System.out.println(count);
		
	} // main

} // end class
