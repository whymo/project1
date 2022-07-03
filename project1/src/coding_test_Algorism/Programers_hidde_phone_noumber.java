package coding_test_Algorism;

public class Programers_hidde_phone_noumber {
	
	public String solution(String phone_number) {
        
        StringBuilder answer = new StringBuilder(phone_number);
        // StringBuilder에 핸드폰 번호를 받아 넣어 준 후
        // StringBuilder의 내장함수인 setCharAt을 사용했다.
        
        for ( int i = 0; i < phone_number.length() -4; i++ ) {
        	
            answer.setCharAt(i, '*');
            // setCharAt은 i번째 인덱스에 '*'를 대체해서 넣겠다는 의미이다.
            // 즉 인덱스 0번부터 총 문자열길이에서 -4를 한 인덱스 번호까지 *로 대체하겠다는 의미이다.
            
        } // for
        
        return answer.toString();
        // 문자열로 변환해서 출력해야 한다.
        
    } // solution

} // end class
