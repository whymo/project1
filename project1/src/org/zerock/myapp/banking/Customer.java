//2022.03.23

package org.zerock.myapp.banking;

// 손님
public class Customer {
		
	String name;	// 이름
	String ssn;		// 신분증
	
	
	// 계좌이체를 요청해야함
	void requestTransfer() { // 사용관계! -> 항상 이용하는것이 아니다!
		Teller teller = new Teller();
		
		// 소스 계좌
		Account sourceAccount = new Account("yoyo", "12-123-1234", "Bank1");
		sourceAccount.setBalance(5000000);
		
		// 타겟 계좌
		Account targetAccount = new Account("Trinity", "123-456", "Bank2");
		targetAccount.setBalance(0);
		
		
		Money transferMoney = new Money(1000000);	// 이체시킬 금액
		
		
		try {
		boolean isSuccess = teller.processRequest(sourceAccount,targetAccount ,transferMoney); 		// 텔러한테 요청하기
		
			if(isSuccess) {		// 이체 성공
				System.out.println("친구야 힘내!!");
			}  // if
			
		} catch(invalidAccountException | InsufficentBanlanceException e) {
			System.out.println("친구야 이체가 안되네?!");
			
			e.printStackTrace();					// *** 이게 필요하다!
			
		} // try-catch
		
	} //requestTransfer
	
} // end class
