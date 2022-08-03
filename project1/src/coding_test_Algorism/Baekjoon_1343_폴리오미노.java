package coding_test_Algorism;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Baekjoon_1343_폴리오미노 {
	
	public static void main(String[] agrs) throws Exception {
		
		// =========================================================
		// 문제 :
		// 민식이는 다음과 같은 폴리오미노 2개를 무한개만큼 가지고 있다. ( AAAA와 BB )
		// 이제 '.'와 'X'로 이루어진 보드판이 주어졌을 때, 민식이는 겹침없이 'X'를 모두 폴리오미노로 덮으려고 한다. 
		// 이때, '.'는 폴리오미노로 덮으면 안 된다.
		// 폴리오미노로 모두 덮은 보드판을 출력하는 프로그램을 작성하시오.
		// + 만약 덮을 수 없으면 -1을 출력한다.
		// =========================================================
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 문자열을 받는 변수
		String s = br.readLine();
		
		// 문자열을 A와 B로 변환하는 메소드에 넣어 변환
		String answer = polio(s);
		
		System.out.println(answer);
		
	} // main
	
	public static String polio (String s) {
		
		// =================================
		// 정답을 담을 변수 생성
		// =================================
		String ans = "";
		
		// =================================
		// 폴리오미노 변수 생성
		// =================================
		String A = "AAAA";
		String B = "BB";
		
		// =================================
		// 문자열을 폴리오미노로 변환
		// =================================
		// XXXX를 String A로 변환해 준다.
		s = s.replaceAll("XXXX", A);
		// XX를 String B로 변환해 주고, 이를 정답 변수에 넣음
		ans = s.replaceAll("XX", B);
		
		// =================================
		// 만약 전부 변환되지 않을 경우 == X를 포함할 경우
		// =================================
		if (ans.contains("X")) {
			ans = "-1";
		} // if
		
		// =================================
		// 정답 반환
		// =================================
		return ans;
		
	} // polio

} // end class
