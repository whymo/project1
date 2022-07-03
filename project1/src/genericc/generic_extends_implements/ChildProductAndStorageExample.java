//2022.03.24


package genericc.generic_extends_implements;

// # 실행클래스
public class ChildProductAndStorageExample {
	
	public static void main(String[] args) {
		
		// 모델 tv , 모델명 string ,  회사명 string
		ChildProduct<Tv, String, String> product = new ChildProduct<>(); 
		
		product.setKind(new Tv());
		product.setModel("SmartTV");		//  문자열
		product.setCompany("Samsung");		//  문자열
		
//		------------------------------
		
		// 타입 파라미터 <T>
		// Tv를 넣겠다!
		Storage<Tv> storage = new StorageImpl<Tv>(100);
//		Storage<Tv> storage = new StorageImpl<>(100); 		// 이렇게도 가능

		storage.add(new Tv(), 0);
		Tv tv = storage.get(0);
		
		System.out.println("- storage:" + storage); // 0번 인덱스에 tv 하나만 넣어서 이렇게 나온다
		
	} // main
	
} // end class
