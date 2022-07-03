//2022.03.23

package exceptionn.multi_catch;

import java.net.Socket;
import java.net.UnknownHostException;

// #다중 catch
public class MultiCatchExample {
	
	private static void staticMethod(String name) throws Exception {		// 뭔 오류던 다 날 수 있다!(최상위 부모 클래스여서)
//		;;
////		throw new Exception();	// 예외타입 생성자	다형성-1에 의해 자식타입은 다 던질 수 있다!
//		
		throw new IllegalArgumentException();	// IllegalArgumentException 얘는 자식타입 
//												//--> 자식타입을 던져도 throws가 부모
////		타입이면 다형성-1에 의해서 가능하다!
	} // staicMethod
		
	public static void main(String[] args) throws Exception {
		

//		try {
			//ArrayIndexOutOfBoundsException 예외가 발생가능한 코드
//			String data1 = args[0];
//			String data2 = args[1];
//			
////			--------
//			//NumberFormatException 예외가 발생가능한 코드
//			int value1 = Integer.parseInt(data1);
//			int value2 = Integer.parseInt(data2);
//			
////			------
//			int result = value1 + value2;
//			
//			System.out.println(data1 + "+" + data2 + "=" + result);
			
			
//			MultiCatchExample.staticMethod();
			MultiCatchExample.staticMethod("1000");
			
//		} catch(ArrayIndexOutOfBoundsException | NumberFormatException e) {		// 예외처리 1
//			System.out.println("실행 매개값의 수가 부족하거나 숫자로 변환할 수 없습니다..");
//		} catch(Exception e) {													// 예외처리2
//			System.out.println("알수 없은 예외 발생");
//		} finally {																// (optional) 항상 실행할 코드 작성
//			System.out.println("다시 실행하세요.");
//		} //try-catch-catch-finally
//		
	} // main
	
} // end class

