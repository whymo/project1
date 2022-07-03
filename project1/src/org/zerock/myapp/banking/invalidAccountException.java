//2022.03.23

package org.zerock.myapp.banking;

import lombok.NoArgsConstructor;

//# 예외만들기
// 사용자 정의 예외클래스 선언 -> 비지니스 상 예외를 의미한다!
@NoArgsConstructor //=> 매개변수없는 기본 생성자를 만들어라! => 3. 롬복으로 만들기!!
public class invalidAccountException 
		extends RuntimeException {		// RuntimeException 상속받으면 invalidAccountException 이 예외 
//		extends Exception {				// CheckedException이 된다!
	
	
//		public invalidAccountException() {
//			;;
//			
//		} // default constructor => 1. 생략하면 만들어주지 않음 
		
	
		public invalidAccountException(String message) {
			
			super(message);	// 예외 메세지 저장하도록 부모타입 호출한것
			
		} //constructor => 2. 이미 다른 생성자가 선언되면 자바 컴파일러는 개입하지 않는다!
	
} // class
