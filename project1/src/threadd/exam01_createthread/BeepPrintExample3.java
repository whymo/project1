//2022.04.08

package threadd.exam01_createthread;

import java.awt.Toolkit;

// 3번째 실행 클래스 처럼 자식 클래스 쓰는 것 보다 2번 실행 클래스가 낫다
public class BeepPrintExample3 {
	
	
	public static void main(String[] args) {
		
		// 1. 자식 쓰레드 클래스를 이용해서, 쓰레드 객체 생성
//		Thread thread = new BeepThread(); 
//		
//		thread.start();
//		
////		-------
//		
//		for(int i=0; i<5; i++) {		
//			System.out.println("띵");	
//			
//			try { Thread.sleep(500); } 
//			catch(Exception e) {;;}
//		} // for
//		
//		-----------------------------------------------------------------------
		
		// 2. 익명자식객체 코딩 기법으로, Thread 클래스의
		//		"자식"객체를 빠르게 만드는 방법 사용
		Thread thread = new Thread() {
			
			@Override
			public void run() {		
//				Toolkit toolkit = Toolkit.getDefaultToolkit();	
				
//				for(int i=0; i<100; i++) {	
				for(;;) {
//					toolkit.beep();
					System.out.print("*");
					
					try { Thread.sleep(500); } 
					catch(Exception e) {;;}
				} // for
			} // run
		}; // 익명자식객체 생성
		
		thread.setName("yo-Thread");		// 디폴트 이름 룰 : Thread-N
		thread.start();	// 비프음 내는 쓰레드는 run 끝나는 순간 죽어버린다!
		
//		-------
		// 이걸 꼭 아래에 해야하는건가?! ㄴㄴ
		// 위로 올리면 별개로 실행된다
		// 메인 쓰레드가 찍는다!
//		for(int i=0; i<100; i++) {	
		for(;;) {	
			System.out.print(".");	
			
			try { Thread.sleep(500); } 
			catch(Exception e) {;;}
		} // for
		
		
//		==> 순차적이 아니라 각자 실행된다!!
//		==> 언제든 새로운 흐름을 만들고싶을때 쓰레드시켜라!
		
	} // main
	
} // end class

