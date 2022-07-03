//2022.04.08

package threadd.exam01_createthread;

import java.awt.Toolkit;

public class BeepPrintExample1 {
	
	
	public static void main(String[] args) {
		
		Toolkit toolkit = Toolkit.getDefaultToolkit();	
		
		for(int i=0; i<5; i++) {		// 1st. Task
			toolkit.beep();				// "띵" 소리 출력ㄴ
			
			try { Thread.sleep(500); } 	// 밀리초 단위로, 쓰레드의 실행흐름을 
			catch(Exception e) {;;}		// 지정된 시간동안 잠시 멈춤
		} // for
		

		for(int i=0; i<5; i++) {		// 2nd. Task
			System.out.println("띵");	// 컨솔로 출력하는 "띵"문자
			try { Thread.sleep(500); } catch(Exception e) {}
		} // for
		
	} // main
	
} // end class
