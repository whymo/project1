//2022.3.21s

package abstractclasss;

//public abstract class Cat extends Animal {		// 자식 클래스를 추상클래스로 만듬
public class Cat extends Animal {
	
	
	public Cat() {
		this.kind = "포유류";
	} //default constructor => 매개변수 없는 생성자

	
	// 부모인 추상클래스에 선언된 "추상메소드"를 반드시 구현(재정의, overridiong)해야 함!
	// 만일, 자식 클래스에서 구현(재정의)하지 않으면, 자식 클래스조차 "abstract" 키워드로
	// 추상클래스화 해야함!(왜? 강제사항인 규경을 지키지 않았기 때문에)
	@Override
	public void sound() {
		System.out.println("야옹");
	} // sound
	
} // end class
