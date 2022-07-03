//2022.03.30

package collectionframework.exam01_stack;

import java.util.Stack;

public class StackExample {
	
	
	public static void main(String[] args) {
		
		Stack<Coin> coinBox = new Stack<>();
		
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(10));
		
		System.out.println(coinBox);
		
//		-------------------------------
		
		// 왜 이걸 넣음? 뭐하는 로직? 순회하는 로직! traverse
		while(!coinBox.isEmpty()) {		// 컬렉션 안이 비어있느냐? 비어있지 않느냐?
			Coin coin = coinBox.pop();
			
			System.out.println("꺼내온 동전 : " + coin.getValue() + "원");
		} //while

	} // main
	
} // end class
