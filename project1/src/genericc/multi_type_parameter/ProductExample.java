//2022.03.24

package genericc.multi_type_parameter;


public class ProductExample {
	
	
	public static void main(String[] args) {
		
//		* 제네릭타입 클래스의 인스턴스 생성(So, 구체타입 전달해야함!)ㄴ
//		Product<Tv, String> product1 = new Product<Tv, String>();
		// 제품 종류는 제품 모델은 string
		Product<Tv, String> product1 = new Product<>();

		
		product1.setKind(new Tv());				// setter 호출
		product1.setModel("스마트Tv");			// setter 호출
		
		Tv tv = product1.getKind();				// getter 호출
		String tvModel = product1.getModel();	// getter 호출
		
		System.out.println("product1 : " + product1);
		
//		----------------------------------------------------------------
		
//		Product<Car, String> product2 = new Product<Car, String>();
		Product<Car, String> product2 = new Product<>();

		product2.setKind(new Car());
		product2.setModel("디젤");
		
		Car car = product2.getKind();
		String carModel = product2.getModel();
		
		System.out.println("product2 : " + product2);
		
	} // main
	
} // end class
