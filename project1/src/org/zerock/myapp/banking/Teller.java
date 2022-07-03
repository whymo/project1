//2022.03.23

package org.zerock.myapp.banking;

import lombok.NoArgsConstructor;

//은행원
@NoArgsConstructor
public class Teller {

	// Teller는 필드가 필요한것이 아니라 기능이 필요하다!
	// 계좌이체 요청을 받아야한다!
	boolean processRequest(Account source, Account target, Money transferMoney) 
			throws invalidAccountException, InsufficentBanlanceException {		// 잘됐으면 true 안됐으면 false 
		
		//1. 소스 계좌와 타겟계좌 모두 유효하면 수행
		if(source.isValid() & target.isValid()) {	// happy path : 이체를 수행한다
			//2. 소스계좌에 잔고가 있는지 확인해야
			int sourceBalance = source.getBalance();	// 소스계좌 잔고
			int transMoney = transferMoney.getAmount(); // 이체할 돈
					
			if(sourceBalance >transMoney) {			// 잔고확인 소스계좌가 이체할돈보다 많으면 (happy path)
				
				if(source.withdraw(transMoney)) {	//소스계좌에서 transMoney 이것만큼 돈을 빼달라, 소스계좌에서 출금이 성공하면
					
					boolean isSuccess = target.deposit(transMoney);
					
					System.out.println("이체 성공");
					
					return isSuccess;				// 여기서 종료
					
//				} else {							// 소스계좌에서 출금이 실패하면?
//							// 그럴경우는 없으니까 이 else블럭 고려하지 않는다!!
				} // if
				
			} else {								// 잔고부족!!! 2. 예외발생시킴 (Unexpected condition)
				// throw new 잔고부족을 의미하는 예외객체;
				throw new InsufficentBanlanceException("잔고부족");
			} // if-else
			
			//바깥 if 블록에서 무엇을 리턴해야할까? => throw, return 같은 역할
			
			return true;
			
		} else {									//Alternative Path 	// 1. 예외를 발생시킴! (계좌가 유효하지 않은 경우) -> 우린 대안경로 안함 
		 // throw new 계좌가 유효하지 않음을 의미하는 예외객체;	
		throw new invalidAccountException("유효하지 않은 계좌");	// 이렇게하면 throws 키워드로 알려줘야함! 없는데 오류나지 않는 이유는? 
													//런타임 익셉션이라서 컴파일러가 확인하지 못함 run 해야지만 예외가 보임
		} // if-else
//		
//		return false;			// 
	} //processRequest
	
} // end class
