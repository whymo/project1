package coding_test_Algorism;

public class Programers_서울에서김서방찾기 {
	
	// =================================================================
    // 문제 :
    // String형 배열 seoul의 원소 중 "Kim"의 위치 x를 찾아, 
    // "김서방은 x에 있다"는 String을 반환하는 함수, solution을 완성하세요.
    // seoul에 "Kim"은 오직 한 번만 나타나며 잘못된 값이 입력되는 경우는 없습니다.
    // =================================================================
    // seoul = { "Jane", "Kim" };
    // return -> "김서방은 1에 있다"
    // + 인덱스 번호를 그대로 사용하면 될 것 같다.
    // =================================================================
    // equals 메소드는 비교하고자 하는 대상의 내용 자체를 비교하지만, (****)
    // == 연산자는 비교하고자 하는 대상의 주소값을 비교합니다.
    // 즉, 참조타입을 ==로 비교하게 되면 객체의 주소값으로 파악하게 되어 답이 나오지 못한다.
    // 출처: https://kmj1107.tistory.com/207 [토순이네집:티스토리]
    // =================================================================
    
    public String solution(String[] seoul) {
        
        // 김서방의 인덱스 번호를 저장할 변수 생성 
        int k = 0;
        
        for ( int i = 0; i < seoul.length; i++ ){
        
            if ( seoul[i].equals("Kim") ){
                k = i;
                break;
            } //if
            
        } // 배열 안 확인
        
        String answer = "김서방은 " + k + "에 있다";
        return answer;
        
    } // solution
	
	public static void main (String [] args ) {
		
		String [] seoul = { "Jane", "Kim" };
		
		Programers_서울에서김서방찾기 fingkim = new Programers_서울에서김서방찾기();
		
		System.out.println(fingkim.solution(seoul));
		
	} // main

} // end class
