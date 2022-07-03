


// ********************************************** //
//  (1) JAVA12 - Switch Expressions (Preview)
// ********************************************** //

// JAVA 12 에 도입된 가장 인기있는 기능은 `Switch Expressions` 입니다.

// 1. 새로운 switch 문은 더 간결하고 읽기 쉽습니다.
// 2. 또한 break 문에 대한 필요성을 제거합니다. 										(***)
// 3. 코드실행은 첫번째 일치 이후에 이루어지지 않습니다. 								(***)
// 4. 또 다른 주목할만한 차이점은 switch 문을 변수에 직접 할당할 수 있다는 것입니다. 	(***)
//    이전에는 불가능했습니다.
// 5. 값을 반환하지 않고 스위치 표현식에서 코드를 실행 할 수도 있습니다. 				(***)
// 6. 이전 구문과 새 구문 중에서 선택할 수 있습니다.
//	  JAVA 12 Switch Expression 은 확장일 뿐, 대체가 아닙니다. 							(***)

//********************************************** //
// (2) JAVA13 - Switch Expressions (JEP 354)
//********************************************** //

//1. 처음에 JAVA 12 에서 Switch Expression 을 보았습니다.
//	- Ref: https://www.baeldung.com/java-switch#switch-expressions

//2. JAVA 13의 Switch Expression 은, 새 `yield 문`을 추가하여, 이전 버전을 기반으로 합니다.
//	- Ref: https://openjdk.java.net/jeps/354

//3. `yield`를 사용하여, 이제 Switch Expression 에서, *값*을 효과적으로 *반환* 할 수 있습니다 .

//4. 이제 새 스위치를 사용하여, *전략패턴*을 쉽게 구현할 수 있습니다.
//  	- Ref: https://www.baeldung.com/java-strategy-pattern

//5. 현재 Switch Expression 은 `JAVA 14 이상`에서만 지원됩니다. (***)

//********************************************** //
// (3) JAVA 14 ~ 17 - Switch Expressions (JEP 361)
//********************************************** //

//1. JAVA 12에서 미리보기(Preview) 기능으로 처음 도입되었으며, 
//2. JAVA 13에서도 미리보기(Preview) 기능으로만 계속되었습니다.
//3. 그러나 이제 스위치 표현식 이 표준화되어 개발 키트의 일부가 되었습니다 .

// 이것이 의미하는 바는, 이 기능을 이제 개발자가 실험할 미리보기(Preview) 모드뿐만 아니라,
// 프로덕션 코드에서도 사용할 수 있다는 것 입니다.

public class NewSwitchExpression {

	
	public static void main(String[] args) {
		
		
		// Case 1 - 실행문장 수행 (JAVA12)
		
		// 값을 생성하지 않고 그냥 실행문장 수행
		// switch문은 값을 생성하려고 만드는 것이 아니다!
		
		int number = 10;
		
		switch(number) {
			case 1 -> System.out.println(1);				// 중괄호기호({})를 없애서, 블록을 생략한 경우 (생략하지마라!)
			
			case 2 -> {										// 중괄호기호로 블록(block)을 생성한 경우
				System.out.println(2);
			}
			
			case 10 -> {
				System.out.println(10);
			}
			
//			default -> {									// 값을 생성하여 반환하지 않는 경우는, default case 생략가능
//				System.out.println("No match found.");
//			}
		} // switch expression
		
//		--------
		
		// 단순 값을 반환할때는 케이스2 사용
		// Case 2 - 여러 값을 매칭시켜 실행문장 수행 (JAVA12)
		int number2 = 5; // 정의
		
		// 케이스 값을 쉼표 , 찍고 여러개로 지정 가능하다!
		// 화살표들 가독성 위해 맞춰주기
		switch(number2) {
			case 1, 2 		-> System.out.println("1 or 2");		// 하나의 case에 비교대상을 다중값으로 설정가능!
			case 5 			-> System.out.println("3 or 4 or 5");
			
			// 값을 생성하여 반환하지 않는 경우는, default case 생략가능
//			default			-> System.out.println("No match found.");
		} // switch expression
		
//		--------
		
		// Case 3 - 값을 생성하여 반환하는 표현식으로 사용 (JAVA12)		
		int number3 = 10;

		// (주의) A switch expression should have a `default case`
		//        값을 생성하여 반환하는 switch expression 인 경우는 default 생략불가!
		//        (왜? default 경우라도, 값은 생성하여 반환해야 하니까....)
		// Rvalue 값은 하나다
		int result3 = switch(number3) {
			case 1 	-> 1;
			case 2 	-> 2;
			case 10 -> 10;
			
			
			default -> -1;			// 생략불가 - 값을 반환해야 함
		};	// switch expression
		
		System.out.println("result3: " + result3);
		
//		--------
		
		// 케이스4는 복잡한 로직할때 이용
		// Case 4 - 값을 생성하되, 복잡한 로직을 수행하여 값을 생성하여 반환하는 경우 (JAVA13 이상)
		int number4 = 1;
		
		// (주의) A switch expression should have a `default case`
		//        값을 생성하여 반환하는 switch expression 인 경우는 default 생략불가!
		//        (왜? default 경우라도, 값은 생성하여 반환해야 하니까....)
		
		
		int result4 = switch(number4) {
		
			// 복잡한 로직을 통해, 값을 생성/반환해야 하는 경우는, `yield` 키워드로 값 반환 (***)
			// `return` 키워드 사용불가 (***)
			case 1, 2 		-> {
				
				;; //(실행문장 넣으면 됨) -> Lvalue에 들어간다
				
				// (일드) yield -> 값을 생성해서 반환해라
				yield 1 + 2;
			}
			
			// 복잡한 로직을 통해, 값을 생성/반환해야 하는 경우는, `yield` 키워드로 값 반환 (***)
			// `return` 키워드 사용불가 (***)
			case 3, 4, 5	-> {	
				System.out.println("3 + 4 + 5 return");
				
				yield 3 + 4 + 5;
			}
			
			default			-> -1;		// 생략불가 - 값을 반환해야 함
		}; // switch expression4
		
		System.out.println("result4: " + result4);

	} // main

} // end class
