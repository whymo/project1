package coding_test_Algorism;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Baekjoon_1543_문서검색 {
	
	public static void main (String[]args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 문제 :
		// 문서와 검색하려는 단어가 주어졌을 때, 그 단어가 최대 몇 번 중복되지 않게 등장하는지 구하라!
		
		// 문서 ( ex. ababababa )
		String a = br.readLine();
		
		// 찾을 단어 ( ex. aba )
		String b = br.readLine();
		
		// 단어가 몇번 등장하는지 카운트하는 변수
		int count = 0;
		
		// 검색을 시작할 문서 인덱스 번호
		int idx = 0;
		
		for ( int i = idx; i < a.length() - b.length(); i ++ ) {
			// 문서에서 단어를 검색할 때 a.length() - b.length()를 하는 이유는
			// 단어 b가 모두 나와야하기 때문에 b보다 문장길이가 작으면 더 이상 검색을 시작할 이유가 없기 때문이다.
			
			boolean check = true; // 중복된 단어가 맞는지 판단
			
		} // for
		
	} // main

} // end class
