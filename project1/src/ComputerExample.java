// 2022.03.10


public class ComputerExample {
	
	public static void main(String ... args) {
		System.out.println("args: " + args);
		
		//---
		
		// 가변인자 
		
		Computer myCom = new Computer();
		
		int[] values1 = {1, 2, 3};						// 변수에 넣어줌 		
		int result1 = myCom.sum1(values1); 				// 메소드 호출 : 매개변수는 배열
		
		System.out.println("result1: " + result1);
		
		//--
		
		int result2 = myCom.sum1(new int[] {1, 2, 3, 4, 5});		// 왜 이때 new int[] 함?
		// 배열 선언과 배열 객체가 다른 실행문이면 값의 목록만으로는 안되고 이렇게 만들어야한다
		// 호출해서 바로 넣어주려니까 new int를 사용해야함

		
		System.out.println("result2: " + result2);
		
		//----
		
		myCom.sum2();		// 
		
		//-----
		
		int result3 = myCom.sum2(1, 2, 3);
		System.out.println("result3:  " + result3);
		
		//----
		
		int result4 = myCom.sum2(1, 2, 3, 4, 5);
		System.out.println("result4:  " + result4);
		
		
	} // main

} // end class
