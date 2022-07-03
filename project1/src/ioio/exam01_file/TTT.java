//2022.04.04

package ioio.exam01_file;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TTT {
	
	public static void main(String[] args) {
		
		// # 날짜를 찍어보다 (옛날 방식)
		
		Date now = new Date(); 	
		
		System.out.println("1. now : " + now);
		
		System.out.println("-----------------------------------------");
		
		// # 우리나에게 익숙한 날짜 및 시간형식 : 2022/04/04 - 10:35:52
		
		String pattern = "yyyy/MM/dd - HH:mm:ss.SSS";
		DateFormat df = new SimpleDateFormat(pattern); // 다형성-1 
		
//		df.format(now);		// 위에 now 객체 형성해놔서 => 변수에 담지 않고 
		
		System.out.println("2. now : " + df.format(now)); // => 바로 찍을 수 있다
	
		
	} // main

} // end class
