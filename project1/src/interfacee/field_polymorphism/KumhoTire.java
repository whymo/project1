// 2022.03.22

package interfacee.field_polymorphism;


public class KumhoTire implements Tire {
	
//	abstract  왜 빼야함? 구현되었기 때문에? 
	
	@Override
	public void roll() {
		System.out.println(" KumhoTire:: roll() invoked.");
	} // roll :  규격
	
} // end class
