//2022.03.23

package org.zerock.myapp.banking;

import lombok.Getter;
import lombok.Setter;

// 소스계좌
public class Account {
	
	//고유속성
	String owner;				// 계좌주인
	String number;		//계좌번호
	String bank;			//은행명
	
	//상태필드 => 필드초기화 해줘야함!
	// 정수가 필요함
	//게터세터 롬복
	@Getter @Setter int balance = 0;				// 잔고
	boolean valid = true;			// 상태 : 계좌의 유효여부
	
	
	public Account(String owner, String number, String bank ) {
		this.owner = owner;
		this.number = number;
		this.bank = bank;
	} //constructor
	
	
	// 기능은 뭐가 필요할까?
	// 소스 계좌에 입금과 출금을 이용한다!
	// 휴면계좌인지 범죄에 이용되어서 락 계좌인지 상태를 알 수 있어야 한다!
	boolean deposit(int money) {		 //입금
		
		balance = balance + money;
		
		return (balance >= 0) ? true : false;
		
	}//deposit
	
	boolean withdraw(int money) {		// 출금
		
		balance -= money;
		
		return (balance - money) >= 0;
	
	}//withdraw
	
	boolean isValid() {
		
		return false;
	} //isValid
	
	// 자바 빈즈 클래스? 게터세터 
	
} // end class
