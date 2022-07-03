//2022.04.08

package threadd.exam01_createthread;

import java.awt.Toolkit;

// 람다식으로 Runnable 타입 구현객체 만들고  하는게 실무적이고 좋다!!
public class BeepPrintExample2 {
	
	// 이전 예제1의 2가지 작업(비프음출력, 띵 문자 출력)을
	// worker thread 를 만들어서, 동시에 수행시키자!
	public static void main(String[] args) {
		
		// 1. 작업쓰레드(worker thread)를 만드는 첫번째 방법
//		Runnable beepTask = new BeepTask();		// 비프음은 얘가 내고
//		Thread thread = new Thread(beepTask);	// 쓰레드 클래스를 이용해서 쓰레드 객체 생성해야하는데, 
												// 쓰레드가 가진 생성자 중에 Runnable 구현 객체 받도록 되어있다!
		
//		thread.start();
		
//		for(int i=0; i<10; i++) {		
//			System.out.println("띵");		// 메인 쓰레드는 "띵" 을 출력하고
//			
//			try { Thread.sleep(500); } 
//			catch(Exception e) {;;}
//		} // for
		
//		==> 순차가 아니라 띵 출력과 비프음이 같이 들린다!!
		
		
//		----------------------------------------------------------------
		
//		# 익명구현객체 사용
		
		//2. 작업 쓰레드(worker thread)를 만드는 두번째 방법
//		Thread t = new Thread(new Runnable() {	
//		}
		
//		Thread thread = new Thread(new Runnable() {
//			
//			@Override
//			public void run() {
//				System.out.println("Anonymous :: run() invoked.");
//				
//				Toolkit toolkit = Toolkit.getDefaultToolkit();	
//				
//				for(int i=0; i<10; i++) {		
//					toolkit.beep();
//					
//					try { Thread.sleep(500); } 
//					catch(Exception e) {;;}
//				} // for
//				
//			} // run
//			
//		}); // 익명구현객체코딩 기법으로 만든 익명구현객체
//		
//		thread.start();
//		
////		2번째 Task-------
//		
//		for(int i=0; i<10; i++) {		
//			System.out.println("띵");		// 메인 쓰레드는 "띵" 을 출력하고
//			
//			try { Thread.sleep(500); } 
//			catch(Exception e) {;;}
//		} // for
		
		
//		----------------------------------------------------------------
		
//		# 람다 익스프레션 -> 가장 권장하는 방법
		
		//3. 작업 쓰레드(worker thread)를 만드는 세번째 방법
		Thread thread = new Thread(() -> {
			System.out.println("Lambda :: run() invoked.");
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			
			
			for(int i=0; i<10; i++) {		
				toolkit.beep();
				
				try { Thread.sleep(500); } 
				catch(Exception e) {;;}
			} // for
		});
		
		thread.start();
		
//		3번째 Task-------
		
		for(int i=0; i<10; i++) {		
			System.out.println("띵");		// 메인 쓰레드는 "띵" 을 출력하고
			
			try { Thread.sleep(500); } 
			catch(Exception e) {;;}
		} // for
		
	
	} // main
	
} // end class


