package coding_test_Algorism;

public class Programers_hide_phone_number2 {
	
    public String solution(String phone_number) {
        
        char[] ch = phone_number.toCharArray();
        // 받은 문자열을 char타입의 배열로 변환해서 저장
        
        for ( int i = 0; i < ch.length - 4; i++ ){
            
            ch[i] = '*';
            // 배열의 i번째 원소를 *로 바꾸어 저장
            
        } // for
        
        return String.valueOf(ch);
        // ch를 문자열로 변환해서 출력
        
    } // solution

} // end class
