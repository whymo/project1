//2022.03.22

package exceptionn.runtime_exception;

import java.util.Arrays;

/*public class ArrayIndexOutOfBoundsExceptionExample {
	public static void main(String[] args) {
		String data1 = args[0];
		String data2 = args[1];
		
		System.out.println("args[0]: " + data1);
		System.out.println("args[1]: " + data2);
	}
}*/

public class ArrayIndexOutOfBoundsExceptionExample {
	
//---------------------ex-----------------------------------------------	
	String name;
	int age;
	
	public ArrayIndexOutOfBoundsExceptionExample(String name, int age) {
		this.name = name;
		this.age = age;		
	} // constructor
	
//	=> 여기서 매개변수 인자값 나이가 몇인지, 이름이 뭔지 모름!
//--------------------------------------------------------------------------	
	
	// main 메소드 호출 주체는 jvm(자바 버츄얼 머신)
	// main called by JVM "main" thread 이름이 메인이라고 하는 쓰레드가 있는데 메인쓰레드가 밀고 내려감 
	public static void main(String[] args) {	// 인자값을 여태 줘본적이 없다! -> 아무것도 안주면 빈 배열이 됨! null이 아님 
		
		System.out.println(Arrays.toString(args)); // 2. 찍어보기
												
		if(args.length == 2) {		// 1. 우리가 준 전달인자는 10까지이다. 3,4를 붙여서 9개를 줬다. 적어도 2개는 아니여서 else!
									// 3. 문자 두개를 넣어봄 dog cat //4. if문 돌아감!
			String data1 = args[0];	
			String data2 = args[1];
			
			System.out.println("args[0]: " + data1);
			System.out.println("args[1]: " + data2);
		} else {		// 원소가 2개가 아니라면 else 블록 사용방법을 알려주자!
			System.out.println("[실행 방법]");
			System.out.print("java  ArrayIndexOutOfBoundsExceptionExample  ");	// 그냥 print는 행을 바꾸지 않고, 그 옆에 찍는다
			System.out.print("값1  값2");
		} // if-else
		
	} // main
	
} //end class

