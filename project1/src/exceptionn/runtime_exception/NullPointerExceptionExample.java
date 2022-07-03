//2022.03.22

package exceptionn.runtime_exception;


// # 1. NullPointerException 
public class NullPointerExceptionExample {
	
	
	public static void main(String[] args) {
		
		String data = null;
		
		System.out.println(data.toString());
		
//	=>Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.toString()" because "data" is null
//	at exceptionn.runtime_exception.NullPointerExceptionExample.main(NullPointerExceptionExample.java:14)
		
//		#1. java.lang.NullPointerException 이게 발생한 예외의 이름!!
		
//		ㄴ값(객체 메소드)을 가지고 있지 않는데 가지고 있는 것 처럼 값을 호출했다!!!
		
		
		
		
	} // main
	
} // end class

