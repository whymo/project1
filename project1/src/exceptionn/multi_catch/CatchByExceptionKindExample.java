//2022.03.23

package exceptionn.multi_catch;

public class CatchByExceptionKindExample {
	
	public static void main(String[] args) {
		
		try {
			//ArrayIndexOutOfBoundsException 예외가 발생가능한 코드
			String data1 = args[0];
			String data2 = args[1];
			
//			---------------------
			
			//NumberFormatException 예외가 발생가능한 코드
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			
//			----------------
			
			int result = value1 + value2;
			System.out.println(data1 + "+" + data2 + "=" + result);
		} catch(ArrayIndexOutOfBoundsException e) {					// 자식타입 (runtimeException의)
			System.out.println("실행 매개값의 수가 부족합니다.");
		} catch(Exception e) {										// 최상의 클래스 Exception 타입
			System.out.println("실행에 문제가 있습니다.");
		} finally {												// 예외 발생하던 안하던 무조건 실행된다
			System.out.println("다시 실행하세요.");
		} //try-catch-catch-finally
		
	} // main
	
} // end class