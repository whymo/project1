//2022.03.17
// 자식 객체

package org.zerock;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Cat extends Animal {
	
	
	@Override
	public void sound() {
		System.out.println("Cat::sound() invoked.");
		
		System.out.println("냐옹~");	
		
	} // sound
	
	

} // end class
