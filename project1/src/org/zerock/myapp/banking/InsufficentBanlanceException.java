//2022.03.23

package org.zerock.myapp.banking;


import lombok.NoArgsConstructor;

//# 예외만들기
@NoArgsConstructor		// 디폴트 생성자 생성됨
public class InsufficentBanlanceException 
	extends RuntimeException {
	
	public InsufficentBanlanceException(String message) {
		
		super(message);	//RuntimeException 얘 최상위 Exception 타입에 있다! 그래서 super로 호출
		
	} //InsufficentBanlanceException
	

} // end class
