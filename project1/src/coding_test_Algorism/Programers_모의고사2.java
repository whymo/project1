package coding_test_Algorism;

import java.util.ArrayList;
import java.util.List;

public class Programers_모의고사2 {
	
	public int[] solution(int[] answers) {
        
        // ============================================================================
        // 수포자 3명이 각각 다음과 같은 방법으로 문제를 찍을 때,
        // 정답이 든 answer 배열이 주어질 때, 가장 많은 문제를 맞힌 사람이 누구인지 배열에 담아 반환하라
        
        // 수포자 1 :  1 -> 2 -> 3 -> 4 -> 5 -> 1 ..
        // 수포자 2 :  ( 2, 1 ) -> ( 2, 3 ) -> ( 2, 4 ) -> ( 2, 5 ) -> ( 2, 1 ) ...
        // 수포자 3 :  ( 3, 3 ) ->  ( 1, 1 ) -> ( 2, 2 ) -> ( 4, 4 ) -> ( 5, 5 ) -> ( 3, 3 ) ...
        
        // 시험은 최대 10,000 문제로 구성되어있다
        // 문제의 정답은 1, 2, 3, 4, 5중 하나이다.
        // 가장 높은 점수를 받은 사람이 여럿일 경우, return하는 값을 오름차순 정렬해야 한다.
        // ============================================================================
        
		// 2차원 배열 : 각 수포자의 찍는 패턴을 지정해 준다.
        int[][] patterns = {
        		{ 1, 2, 3, 4, 5 },
        		{ 2, 1, 2, 3, 2, 4, 2, 5 },
        		{ 3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
        };
        
        // 각 수포자들이 몇 문제를 맞았는지 저장하는 배열 생성
        int [] check = new int [3];
        
        // 각 수포자들이 몇 문제를 맞는지 체크
        for( int i = 0; i < check.length; i++ ) {
        	
        	for ( int j = 0; j < answers.length; j++ ) {
        		
        		// 정답이 맞는지 확인하기 위해서 정답의 j번째와
        		// 수포자들이 이번에 찍은 번호가 서로 맞는지 확인하기 위해서
        		// 먼저, 수포자들이 이번에 몇번으로 찍을 차례인지 확인해야 하는데,
        		// 그러기 위해서는 수포자가 찍는 총 패턴의 길이가 몇인지 구하여 이를
        		// 번호 수 % 패턴의 길이로 연산하여 나머지를 통해 구한다.
        		if( patterns[i][ j % patterns[i].length ] == answers[j] ) check[i]++;
        		
        	} // inner for
        	
        } // outer for
        
        // 가장 높은 점수를 구한다.
        int max = Math.max(check[0], Math.max(check[1], check[2]));
        
        // 가장 많이 맞힌 사람을 구한다.
        List<Integer> list = new ArrayList<>();
        for ( int i = 0; i < check.length; i++ ) {
        	// i + 1을 하는 이유는 배열의 경우 인덱스 번호가 0번부터 시작되기 때문이다.
        	if( max == check[i] ) list.add(i + 1);
        } // for
        
        // 정답 배열 생성
        int [] answer = new int [list.size()];
        int count = 0;
        
        for ( int a : list ) {
        	answer[count ++] = a;
        } // enhanced for
            
        return answer;
        
    } // solution

} //end class
