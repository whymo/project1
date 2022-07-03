//2022.04.01


package ioio.exam01_system_in_out;

import java.io.InputStream;

public class SystemInExample1 {
	
	
	public static void main(String[] args) throws Exception {		
		
		System.out.println("== 메뉴 ==");
		System.out.println("1. 예금 조회");
		System.out.println("2. 예금 출금");
		System.out.println("3. 예금 입금");
		System.out.println("4. 종료 하기");
		
		System.out.print("메뉴를 선택하세요: ");
		
	
//		2) 표준입력 (Standard Input)				-----> System.in
//		-> "키보드"의 입력을 받을 수 있는 기능 제공
		InputStream is = System.in;
		
		// 입력 스트립이 키보드랑 연결되어있는 상태!
		char inputChar = (char) is.read();	// read() 메소드 어떤 역할을 하는지 -> 읽을 데이터가 있을 때까지 기다린다!!(blocking 된다)
		
		// read() 메소드가 blocking 상태여서 switch문 실행 안됨
		switch(inputChar) {
		
			case '1':
				System.out.println("예금 조회를 선택하셨습니다.");
				
				break;
				
			case '2':
				System.out.println("예금 출금를 선택하셨습니다.");
				
				break;
				
			case '3':
				System.out.println("예금 입금를 선택하셨습니다.");
				
				break;
				
			case '4':
				System.out.println("종료 하기를 선택하셨습니다.");
				
				break;
				
		} // switch	
		
	} // main
	
} // end class
