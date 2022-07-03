// 2022.03.22

package interfacee.interface_extends;


public class Example {
	
	public static void main(String[] args) {
		ImplementationC impl = new ImplementationC();	// 구현객체 생성
		
		InterfaceA ia = impl;		// 다형성-1 (부모 : interfaceA)
		ia.methodA();				// 다형성-2
		
//	-----------------------------
		
		
		InterfaceB ib = impl;		//다형성-1 (부모 : interfaceB)
		ib.methodB();				//다형성-2

//		----------------------
		// 메소드 C만 가능할 줄 알았는데 아님! B랑 A다 내려받았기 때문에 메소드A,B,C 다 가능하다!!
		InterfaceC ic = impl;		//다형성-1 (부모 : interfaceC)
		ic.methodA();				// 다형성-2
		ic.methodB();
		ic.methodC();
		
	} // main
	
} // end class

