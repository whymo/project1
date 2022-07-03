// 2022.03.22

package interfacee.field_polymorphism;


public class HankookTire implements Tire {
	
	
	// 추상메소드 구현하라고 내려보냈기 때문에 오버라이딩 해야한다! 
	// 구현하기 싫으면 class 앞에 abstract 넣어야한다! 추상 클래스가 되어야한다!
	
	@Override
	public void roll() {
		System.out.println("HankookTire :: roll() invoked."); //=> 메소드 호출로그
	
	} // roll
	
} // end class

