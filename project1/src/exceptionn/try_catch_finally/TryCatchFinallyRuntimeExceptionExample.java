//2022.03.22

package exceptionn.try_catch_finally;


public class TryCatchFinallyRuntimeExceptionExample {
	
	public static void main(String[] args) { // args -> {} 빈 값을 준다!

		String data1 = null;
		String data2 = null;
		
		try {	// 예외 코드 적기
			data1 = args[0];		// 빈 배열이여서 예외 발생! 0번 인덱스가 없다!
			data2 = args[1];
			
			int result = Integer.parseInt(args[1]);		// 두번째 원소 정수로 바꿔서 result에 넣어라
			
			System.out.println("result : " + result);
			
		} catch(ArrayIndexOutOfBoundsException e) {		// catch하기! / 예외 객체를 변수 e에 넣어준다!
			System.out.println("실행 매개값의 수가 부족합니다.");
			System.out.println("[실행 방법]");
			System.out.println("java TryCatchFinallyRuntimeExceptionExample  num1  num2");
			
			return;		// 이 문장을 만나는 즉시, 메소드의 실행을 종료시키고,
						// 만일 뒤에 값(리터럴, 변수, 표현식 등)이 오면, 호출자에게 반환한다!
		} // try-catch
		
//	-----------------------------------------------------------
		
//		try { 
//			int value1 = Integer.parseInt(data1);
//			int value2 = Integer.parseInt(data2);
//			int result = value1 + value2;
//			System.out.println(data1 + "+" + data2 + "=" + result);
//		} catch(NumberFormatException e) {
//			System.out.println("숫자로 변환할 수 없습니다.");
//		} finally {
//			System.out.println("다시 실행하세요.");
//		} // try-catch-finally
		
	} // main
	
} // end class

