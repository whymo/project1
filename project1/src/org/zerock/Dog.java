//2022.03.17
// 자식 객체

package org.zerock;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Dog extends Animal {
	
	
	@Override
	public void sound() {
		System.out.println("Dog::sound() invoked.");	
		
		System.out.println("멍멍!!");	
		
	} // sound
	
	

} // end class
