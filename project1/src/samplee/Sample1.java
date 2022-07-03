package samplee;


public class Sample1 {

	public static void main(String[] args) {
	
//		Runnable task = null;
//		
//		task = () -> {
//			
//			System.out.println("실행문");
//			
//		};
//		
//		task.run();
//		
////------------------------------------------
//		
//		task = () -> System.out.println("실행문");
//	
//		task.run();
		
//		--------------------------
////
//		I1 sample;
//		
//		sample = (n, a) -> System.out.println("name : " + n + " age : " + a);
//		
//		sample.method("지연", 55);
		
		
//		-------------------------------
		
// # public abstract double method(String name, int age);	//   매개변수 있고 리턴타입 있음

		
		I1 sample;
		
		sample = (n, a) -> {
			
			System.out.println("name : " + n + "age : " + a);
			
			 return a;			// 여기에 뭐가 들어가야할지?
			 
		};
		
		sample.method1("jiyeon", 55);
		
		
		
	} // main
	
} // end class
