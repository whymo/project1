//2022.04.08

package threadd.exam01_createthread;

import java.awt.Toolkit;


// Thread 클래스를 상속받은 자식클래스를 만들고,
// 물려받은 메소드인 run() 메소드를 재정의함으로써,
// 새로운 쓰레드 객체를 생성
public class BeepThread extends Thread {
	
	
	@Override
	public void run() {		
		Toolkit toolkit = Toolkit.getDefaultToolkit();	
		
		for(int i=0; i<5; i++) {		
			toolkit.beep();
			try { Thread.sleep(500); } catch(Exception e) {}
		} // for
		
	} // run
	
} // end class

