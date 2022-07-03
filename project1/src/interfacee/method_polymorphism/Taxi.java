// 2022.03.22

package interfacee.method_polymorphism;

public class Taxi implements Vehicle {
	
	@Override
	public void run() {
		System.out.println("Taxi::run() invoked.");
	} // run
	
} // end class
