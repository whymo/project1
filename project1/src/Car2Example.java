
//2022.03.08


public class Car2Example {
	
	public static void main(String[] args) {
		
		// 생성자, 필드초기화
		Car2 myCar = new Car2("검정", 3000); 	// ok
		
//		Car2 myCar = new Car2(); 				// xx -> 왜 오류가 날까? 
		
//		The constructor Car2() is undefined : 생성자 Car2가 정의되지 않았다
//		우리가 만든건 매개변수가 있는 생성자여서 이건 매개변수가 없어서 오류!
		
	} // main

} //end class
