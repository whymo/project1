//2022.04.04

package ioio.exam03_scanner;

import java.util.Scanner;

import lombok.Cleanup;

public class ScannerExample {
	
	
	public static void main(String[] args) {
		
		
		// 내가 ENTER키를 눌러야지 작동함!		
		//  AutoCloseable -> 자원객체이다 -> 자원객체는 반드시 닫아줘야한다!
		
		@Cleanup("close")
		Scanner scanner = new Scanner(System.in);		// Scanner 객체 생성
		
		System.out.print("문자열 입력> ");				// 입력유도 프롬프트 메세지 출력
		String inputString = scanner.nextLine();		// 문자열로 받음
		System.out.println(inputString);		
		System.out.println();							
		
//		-----------
		
		System.out.print("정수 입력> ");
		int inputInt = scanner.nextInt();		// Int 메소드
		System.out.println(inputInt);
		System.out.println();
		
		
//		-----------
		
		System.out.print("실수 입력> ");
		double inputDouble = scanner.nextDouble(); // Double 메소드
		System.out.println(inputDouble);
		
		
//		scanner.reset();
		
//		scanner.close();
		
	} // main
	
} // end class
