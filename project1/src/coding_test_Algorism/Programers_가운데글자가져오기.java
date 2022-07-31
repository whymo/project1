package coding_test_Algorism;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Programers_가운데글자가져오기 {
	
	// =========================================================
    // 문제 :
    // 단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요.
    // 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.
    // =========================================================
    
    public String solution(String s) {
        
        String answer = "";
        
        int middle = s.length() / 2;
        
        if ( s.length() % 2 == 0 ) {
            
            // 짝수라면
            // 문자열.substring(시작인덱스번호, 끝인덱스번호); (****)
        	// 인덱스 번호는 0부터 시작하기 때문에 -1을 해줘야 한다.
        	
            // 끝 인덱스 번호는 포함되지 않는다.
            // 시작 인덱스는 포함이 된다.
            answer = s.substring( middle - 1, middle + 1 );
        
        } else {
            
            // 홀수라면
        	// 문자열.substring(시작인덱스번호, 끝인덱스번호); (****)
        	// 홀 수일 경우에는 오히려 2로 나눈 수에서 +1을 해줘야 하지만
        	// 인덱스 번호는 0부터 시작하기에 그냥 middle부터 시작하면 된다.
            answer = s.substring( middle, middle+1 );
        
        } // if : 짝수일때는 2글자 홀수일때는 1글자를 반환
        
        return answer;
        
    } // solution
	
    // =========================================================
    
	public static void main (String[]args) throws Exception {
		
		Programers_가운데글자가져오기 test = new Programers_가운데글자가져오기();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		
		System.out.println(test.solution(s));
		
	} // main

} // end class
