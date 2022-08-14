package coding_test_Algorism;

import java.util.Scanner;

public class Programers_직사각형별찍기 {
	
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        // 1. 세로
        for ( int i = 0; i < b; i++ ){

            // 2. 가로
            for ( int k = 0; k < a; k++ ){
                System.out.print("*");
            } // inner for

            // 3. 다음줄로 넘어가기
            System.out.println("");

        } // outer for

    } // end main

} // end class
