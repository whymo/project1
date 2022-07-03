//2022.3.21

package org.zerock;

import java.util.Arrays;

import lombok.extern.log4j.Log4j2;


// ********************************************** //
//  Pattern Matching for instanceof (Preview)
// ********************************************** //

// 1. JAVA 12에 도입된 또 다른 미리보기 기능은 `instanceof` 에 대한 패턴일치(pattern matching)입니다.
//	  	- Ref: https://www.baeldung.com/java-pattern-matching-instanceof

// 2. 이전 JAVA 버전에서는, 예를들어 `instanceof` 와 함께 `if 문`을 사용할 때, 
//	  해당 기능에 액세스하기 위해, 객체를 명시적으로 강제 형변환(type casting) 해야 했습니다.
//		- Ref: https://www.baeldung.com/java-instanceof

// 3. JAVA 12에서는 다음 명령문에서 직접 새로운 형변환된 변수를 선언할 수 있습니다.

// 4. 컴파일러는 자동으로 type casted 변수를 주입합니다.

//@Log4j2
public class PatternMatchingForInstanceof {

	
	public static void main(String[] args) {
//		log.trace("main({}) invoked.", Arrays.toString(args));
		
		Object obj = "Hello, World!";
//		log.info("obj: {}, type: {}", obj, obj.getClass().getName());
		
//		-------

		// Example1 - Previous example.
		
		if(obj instanceof String) {
			String s = (String) obj;
			
			int length = s.length();
			 System.out.println("length: {}"+ length);
			
		} // if
		
//		-------

		// Example2 - New example.
		
		if(obj instanceof String s) {
			int length = s.length();
			 System.out.println("length: {}" + length);

		} // if


	} // main

} // end class
