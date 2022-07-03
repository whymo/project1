//2022.03.14


package org.zerock; 	// 패키지 먼저 만들고 패키지에 맞게 클래스 선언 
 
// java.으로 시작하는 패캐지들 => 자바표준패키지
// javax. 으로 시작하는 패캐지들 => 자바확장패키지

// 임포트 하지 않아도 자동으로 컴파일러가 컴파일할때 임포트 시킨다!
import java.util.Scanner;	// ctrl + shift + o 해주면 자동으로 import해준다!
import java.lang.Math;
import javax.accessibility.*;	// * : all(모두) 라는 의미이다! -> 모든 클래스, 타입은 내가 가져다 쓰겠다!
// 내가 가져다 쓸 장난감 상자를 적을거냐, 아님 장난감 상자 안에 장난감 이름을 적을것이냐?
// => 장난감 상자는 안쓰는 장난감까지 다 가져오고, 내가 어떤걸 쓰는지 남이 알기 쉽지 않다! 

public class TTT {
	
	public static void mains(String[] args) {
		
		Math.random();		//math는 내가 만든 클래스가 아님
		Scanner scanner = new Scanner(System.in);		// 컴파일오류가 나면 임포트 구문 넣어줘야한다
		
	} // main

} // end class
