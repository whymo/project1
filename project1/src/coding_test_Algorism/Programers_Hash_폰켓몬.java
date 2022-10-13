package coding_test_Algorism;

import java.util.HashSet;

public class Programers_Hash_폰켓몬 {
	
	public int solution(int[] nums) {
        
        // + 선택해야 하는 포켓몬의 수
        int pick = nums.length / 2;
        
//        // + 이를 Map에 저장
//        Map <Integer, Integer> map = new HashMap<>();
//        
//        // + map에 몇번째에 어느 포켓몬이 있는지 저장
//        for ( int i = 0; i < nums.length; i++ ){
//            map.put(i+1, nums[i]);
//        } // for
        
        // Set을 통해서 중복값 제거 
        HashSet<Integer> set = new HashSet<>();
        
        for ( int i : nums ){
            set.add(i);
        } // enhanced for
        
        // + 만약 선택해야 하는 포켓몬의 수보다 종류가 적으면 종류가 답
        // + 종류가 더 많으면 선택해야 하는 수가 답
        // + 문제는 최대로 선택할 수 있는 폰캣몬의 종류를 출력하는 것이다.
        if( set.size() > pick ){
            return pick;
        } else {
            return set.size();
        } // if - else
        
    } // solution

} // end class
