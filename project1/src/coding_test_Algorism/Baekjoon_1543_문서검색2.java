package coding_test_Algorism;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Baekjoon_1543_문서검색2 {
	
	public static void main (String[]args) throws Exception {
		
		// br은 공백이 문서에 포함될 경우에는 인식하지 못한다.
		// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		
		// ============================================================================================
		// 문제 :
		// 문서와 검색하려는 단어가 주어졌을 때, 그 단어가 최대 몇 번 중복되지 않게 등장하는지 구하라!
		// ============================================================================================
		
		// 문서 ( ex. ababababa )
		// String str = br.readLine();
		String str = sc.nextLine();
		
		// 찾을 단어 ( ex. aba )
		// String word = br.readLine();
		String word = sc.nextLine();
		
		// 단어가 몇번 등장하는지 카운트하는 변수
		int count = 0;
		
		// 검색을 시작할 문서 인덱스 번호
		int idx = 0;
		
		// ============================================================================================
		
		for ( int i = idx; i <= str.length() - word.length(); i ++ ) {
			// 문서에서 단어를 검색할 때 a.length() - b.length()를 하는 이유는
			// 단어 b가 모두 나와야하기 때문에 b보다 문장길이가 작으면 더 이상 검색을 시작할 이유가 없기 때문이다.
			
			boolean check = true; // 중복된 단어가 맞는지 판단
			
			// ============================================================================================
			
			for ( int j = 0; j < word.length(); j++ ) {
				
				if ( str.charAt(i+j) != word.charAt(j) ) {
					check = false;
					break;
				} // if : 단어가 다르면
				
			} // inner for
			
			// ============================================================================================
			
			// 문서와 단어가 같을 경우 :
			// 등장횟수 +1을 해주고 그 다음부터 검색할 수 있도록 인덱스 조정
			
			if( check ) {
				
				// true일 경우
				count ++;
				idx += word.length(); // 다음 문자열부터 검색가능하도록 인덱스 조정
				i = idx - 1; // idx에서 -1을 하는 이유는 밖의 for에서 +1을 해주고 있기 때문이다.
				
			} else {
				
				// false인 경우
				idx ++;
				
			} // if - else check가 true일 경우와 false인 경우
			
			// ============================================================================================
			
		} // outer for
		
		// ============================================================================================
		
		System.out.println(count);
		
	} // main

} // end class
