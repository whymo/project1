// 2022.03.22

package interfacee.interface_extends;


public class ImplementationC implements InterfaceC {
	
	@Override
	public void methodA() {
		System.out.println("ImplementationA::methodA() invoked");
	}	//methodA()
	
	@Override
	public void methodB() {
		System.out.println("ImplementationB::methodB() invoked");
	} //methodB()
	
	@Override
	public void methodC() {
		System.out.println("ImplementationC::methodC() invoked");
	} //methodC()
}

