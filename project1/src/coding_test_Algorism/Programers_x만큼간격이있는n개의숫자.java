package coding_test_Algorism;

import java.util.Scanner;

public class Programers_x만큼간격이있는n개의숫자 {
	
	public long[] solution(int x, int n) {
        
        // 1. 정답을 담는 빈 배열 준비
        long[] answer = new long [n];
        
        // 2. 배열에 담을 원소를 구하는 임시 변수 준비
        long test = x;
        
        for ( int i = 0; i < n; i++ ){
            answer [i] = test;
            test += x;
        } // for
        
        return answer;
        
    } // end solution
	
	public static void main (String[] args) {
		
		Programers_x만큼간격이있는n개의숫자 test = new Programers_x만큼간격이있는n개의숫자();
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int n = sc.nextInt();
		
		System.out.println(test.solution(x, n));
		
	} // main

} // end class
