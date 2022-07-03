//2022.03.30

package collectionframework.exam01_stack;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

//# 동전 모델링

@ToString
@AllArgsConstructor
public class Coin {
	
	@Getter private int value;	// 고유속성
	
	
//	------------@@AllArgsConstructor-------------
//	public Coin(int value) {
//		this.value = value;
//	} //Coin
	
//	------------@Getter-------------
//	public int getValue() {
//		return value;
//	}
	
} //end class

