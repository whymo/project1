package samplee;

import java.util.HashSet;
import java.util.Set;

public class TTT {
	
	public static void main(String[] args) {
		
		Set<String> set = new HashSet<>();
		
		int i = 0;
		
		while(true) {
		
			++i;
			
			set.add(new String("OBJECT-" +i));
			
			System.out.print('.');
			
			try {
				Thread.sleep(10); // 얘를 만나면 지정된 시간동안 잠자다가 다시 실행
			} catch (InterruptedException e) {;;}		
			
		} //while
		
//		set.clear();  // 무한루프 밖이라서 실행 안됨
		
	} //main

} //end class
