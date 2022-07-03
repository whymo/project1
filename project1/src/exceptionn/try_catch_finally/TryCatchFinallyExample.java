//2022.03.22


package exceptionn.try_catch_finally;


public class TryCatchFinallyExample {
	
	
	public static void main(String[] args) {
				
		try {		// try -> 내가 작성한 코드가 호출한 코드가 예외가 의심될때 그런 코드를 try 블럭으로 감싸기!
			Class clazz = Class.forName("java.lang.String2");
		} catch(ClassNotFoundException e) {		// 예외가 발생했다! catch 블록에서 잡기!! (예외클래스 e)
//	ClassNotFoundException -> happy path?	 e가 뭐임?? exception! 캐치하는 용도로 사용!
			System.out.println("클래스가 존재하지 않습니다.");
		} // try-catch
		
		// final은 반드시 넣어야하는것은 아니다!! 옵셔널이다!!
		
	} // main
	
} // end class

