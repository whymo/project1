package coding_test_Algorism;

public class Programers_kakao_키패드 {
	
	public String solution(int[] numbers, String hand) {
		
        String answer = "";
        
        int left = 10; // * ( 왼쪽 손이 처음 시작하는 위치 저장 )
        int right = 12; // # ( 오른쪽 손이 처음 시작하는 위치 저장 )
        
        for ( int n : numbers ){
            
            if ( n == 1 || n == 4 || n == 7 ) {
                answer += "L";
                left = n; 
                // + 1, 4, 7은 왼쪽 손이 이동해야한다.
                // + 가운데 부분은 왼쪽이나 오른쪽 손 중 가까운 손이 해야하기에 손의 위치 저장
            } else if( n == 3 || n == 6 || n == 9 ) {
                answer += "R";
                right = n;
                // + 오른쪽 손이 움직인 후, 그 위치를 저장한다.
            } else {
                
                if( n == 0 ) {
                    
                    n = 11;
                    // + 0일 경우, 자리 위치로 보면 11번째 위치에 존재한다.
                    // + n이 0일때는 가운데이기에 오른쪽과 왼쪽 손 중 가까운 손이 해결해야 된다.
                    
                } // if
                
                int letflist = Math.abs(n - left) / 3 + Math.abs(n - left) % 3;
                // + Math.abs는 절대값을 반환한다.
                // + 이 식은 현재 쳐야될 키패드의 위치와 현재 왼손의 위치를 절대값으로 구한 것이다.
                
                int rightlist = Math.abs(n - right) / 3 + Math.abs(n - right) % 3;
                // + Math.abs는 절대값을 반환한다.
                // + 이 식은 현재 쳐야될 키패드의 위치와 현재 오른손의 위치를 절대값으로 구한 것이다.
                
                if ( letflist < rightlist ) {
                    // + 왼손이 더 가까울 경우에는 왼손이 한다.
                    answer += "L";
                    left = n;
                    
                } else if ( letflist > rightlist ) {
                    // + 오른손이 더 가까울 경우에는 오른손이 한다.
                    answer += "R";
                    right = n;
                    
                } else{
                    // + 거리가 같을 경우에는 오른손잡이인지 왼손잡이인지에 따라서 결정한다.
                    if(hand.equals("left")){
                        answer += "L";
                        left = n;
                    }else{
                        answer += "R";
                        right = n;
                    } // if - else
                    
                } // if - else if - else
                
            } // if - else if - else
                
        } // enhanced for
        
        return answer;
        
    } // solution
	
	public static void main(String[] args) {
		
		Programers_kakao_키패드 test = new Programers_kakao_키패드();
		
		int [] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
		String hand = "right";
		
		System.out.println(test.solution(numbers, hand));
		
	} // main

} // end class
