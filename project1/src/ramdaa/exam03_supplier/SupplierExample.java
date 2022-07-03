//2022.03.25

package ramdaa.exam03_supplier;


import java.util.function.IntSupplier;


public class SupplierExample {
	
	//데이터를 자체적으로 생산에서 공급하는 비지니스 로직이 필요할 때 적용하는
	// 함수적 인터페이스(Supplier)
	public static void main(String[] args) {
		
		// 주사위를 던져서 나온 숫자를 데이터로 공급
		// 메소드 시그니처 int getAsInt();
		IntSupplier intSupplier = () -> {
			int num = (int) (Math.random() * 6) + 1;
			
			return num;
		};
		
		int num = intSupplier.getAsInt();
		System.out.println("눈의 수: " + num);
		
	} // main
	
} // end class
