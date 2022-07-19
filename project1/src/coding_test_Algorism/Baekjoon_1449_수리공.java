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
		Arrays.sort(arr);
		
		int count = 1;
		int idx = 0;
		
		for ( int i = idx + 1; i < arr.length; i++ ) {
			
			if ( ( arr[idx] + L - 1 ) < arr[i] ) {
				count ++;
				idx = i;
			} // inner for
			
		} // outer for
		
	} // main

} // end class
