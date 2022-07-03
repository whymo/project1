package coding_test_Algorism;

public class Programers_수박수박수_Algorism {
	
    public String solution(int n) {
        
        char [] arr = new char [n];
        
        for ( int i = 0; i < arr.length; i++ ) {
        	
        	if( i % 2 == 0 ) { 		
        		arr[i] = '수';
        	} else {
        		arr[i] = '박';
        	} // if - else
        	
        } // for
        
        return String.valueOf(arr);
        
    } // solution

} // end class
