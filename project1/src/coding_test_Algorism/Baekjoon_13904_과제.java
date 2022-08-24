package coding_test_Algorism;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Baekjoon_13904_과제 {
	
	public static void main(String[] args) throws Exception {
		
		// ==============================================================
		// 문제 :
		// + 웅찬이는 과제가 많다. 하루에 한 과제를 끝낼 수 있는데, 
		// + 과제마다 마감일이 있으므로 모든 과제를 끝내지 못할 수도 있다.
		// + 웅찬이는 가장 점수를 많이 받을 수 있도록 과제를 수행하라
		// ==============================================================
		// + 첫 줄에 정수 N (1 ≤ N ≤ 1,000)이 주어진다. ( 과제의 수 )
		// + 다음 줄부터 N개의 줄에는 각각 두 정수 d와 w가 주어진다.
		// + d는 과제 마감일까지 남은 일수를 의미하며,
		// + w는 과제의 점수를 의미한다.
		// ==============================================================
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// + 1. 과제의 수를 입력받는다.
		int N = Integer.parseInt(br.readLine());
		
		// + 2. 과제를 저장하는 리스트 객체를 받는다.
		List<Home> list = new ArrayList<>();
		
		// + 3. 날짜가 가장 긴것 부터 해야 되기에 변수 생성
		int max = 0;
		
		// + 4. 과제의 마감일과 점수 저장
		for ( int i = 0; i < N; i++ ) {
			
			// + 한줄을 읽은 후, 공백으로 마감일과 점수를 구분
			String [] input = br.readLine().split(" ");
			
			int d = Integer.parseInt(input[0]); // 마감일
			int w = Integer.parseInt(input[1]); // 점수
			
			// + 데이터를 리스트에 넣기
			list.add(new Home(d, w));
			
			// + 가장 긴 날짜 저장
			max = Math.max(max, d);
			
		} // for
		
		// + 5. 점수를 저장할 변수 생성
		int sum = 0;
		
		// + 6. 마감일이 가장 늦은 날부터 순회
		for ( int i = max; i >= 1; i-- ) {
			
			Home answer = new Home(0, 0);
			
			// + 같은 날짜일때 점수가 큰 문제를 구한다.
			for ( Home h : list ) {
				
				// + i는 max부터 시작해서 -1씩 진행되는데
				// + 그렇게 되면, h.d >= i는 내림차순으로 진행된다.
				if( h.d >= i ) {
					
					if( answer.w < h.w ) {
						
						answer = h;
						
					} // inner if
					
				} // if
				
			} // inner for : 하나씩 꺼내서 비교
			
			sum += answer.w;
			list.remove(answer);
			
		} // for2
		
		System.out.println(sum);
		
	} // main
	
	// + 과제날과 점수를 저장할 Class 생성 
	static class Home {
		
		int d;
		int w;
		
		Home(int d, int w){
			this.d = d;
			this.w = w;
		} // Constructor
		
	} // Home

} // end class
