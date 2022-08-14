package coding_test_Algorism;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Programers_완주하지못한선수 {
	
	public String solution(String[] participant, String[] completion) {
        
	//      ====================================================================
	//      제약 :
	//      마라톤 경기에 참여한 선수의 수는 1명 이상 100,000명 이하입니다.
	//      completion(완주한 사람의 배열)의 길이는 participant의 길이보다 1 작습니다.
	//      참가자의 이름은 1개 이상 20개 이하의 알파벳 소문자로 이루어져 있습니다.
	//      참가자 중에는 동명이인이 있을 수 있습니다. (***)
	     
	//      단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다.
	//      ====================================================================
	//      참고 : 출처: https://coding-grandpa.tistory.com/entry/프로그래머스-완주하지-못한-선수-해시-Lv-1 [개발자로 취직하기:티스토리]
	     
	     String answer = "";
	     
	//      ====================================================================
	     
	     HashMap <String, Integer> run = new HashMap <String, Integer>();
	     // String이 key이고, Integer이 value이다.
	     // Integer이 있는 이유는 동명이인을 구분하기 위해서이다.
	     
	     for ( String runner : participant ) {
	         
	         run.put( runner, run.getOrDefault(runner, 0) +1 );
	         // 참여자를 run이라는 HashMap객체에 저장
	         
	         // run.getOrDefault(runner, 0) +1 : 
	         // map에 runner의 value값이 있으면, 이를 가져오고 없으면 0을 디폴트값을 가져온다.
	         // 이를 하는 이유는 동명이인이 있을 경우에는 key값인 러너의 이름은 같으나 value의 값은 달라야 하기 때문이다.
	         // 즉, 새로운 이름의 러너일 경우에는 value를 디폴트 값으로 0을 가져온 후 +1을 하여 ( 러너이름, 1 )이 되지만
	         // 만약 이미 동명의 러너가 run이라는 HashMap에 있을 경우에는 value에 +1을 더해서 2, 3, 4로 저장한다.
	         
	     } // enhanced for1 : 참여자에서 1명씩 빼온다.
	     
	//      ====================================================================
	     
	     for ( String runner : completion ) {
	         
	         run.put( runner, run.get(runner) -1 );
	         // 이렇게 되면, 완주자는 value의 값이 0이 되고 비완주자는 1 이상이 된다. (**)
	             
	     } // enhanced for2 : 완주한 사람을 하나씩 빼온다.
	     
	//      ====================================================================
	     
	     Iterator < Map.Entry<String, Integer> > iter = run.entrySet().iterator();
	     // map.entry는 key와 value의 값을 동시에 가져오는 메소드이다.
	     // Iterator는 집합체에서 정보를 얻어 온다.
	     // Iterator의 메소드에는 hasNext(), next(), remove()가 있다. (***)
	     // 즉 run에 있는 key와 value값을 가져오는 반복해서 읽어들이는 Iterator 객체를 만든 것이다.
	     
	//      ====================================================================
	     
	     while( iter.hasNext() ) {
	         
	         Map.Entry<String, Integer> entry = iter.next();
	         // iter로 읽은 run의 key와 value를 entry에 저장
	         
	         if ( entry.getValue() != 0 ) {
	             
	             answer = entry.getKey();
	             // 키 값인 러너의 이름을 가지고 와라
	             
	         } // if - value의 값이 0이 아니라면 ( 완주하지 못한 자라면 )
	         
	     } // while - 다음 정보가 있을때까지 무한 반복 ( 끝까지 읽는다. )
	         
	     return answer; // 완주하지 못하는 선수 ( 1명 )
	     
	 } // end solution
	
	public static void main(String[] args) {
		
		String [] participant = {"A", "B", "C", "D"};
		String [] completion = {"A", "B", "D"};
		
		Programers_완주하지못한선수 test = new Programers_완주하지못한선수();
		
		System.out.println(test.solution(participant, completion));
		
	} // main

} // end class
