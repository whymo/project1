//2022.3.21

package abstractclasss;


public class Dog extends Animal {
	
	
	public Dog() {
		this.kind = "포유류";
	} // default constructor
	

	// 부모인 추상클래스에 선언된, "추상메소드" (강제규격)를 구현(재정의)
	@Override
	public void sound() {
		System.out.println("멍멍");
	} // sound
	
} // end class