//2022.03.23

package org.zerock.myapp.banking;

import lombok.Getter;

public class Money {
	@Getter int amount;       // 돈 얼마있는지 양!
	
	public Money(int amount) {
		
		this.amount = amount;
	} 
} // end class
