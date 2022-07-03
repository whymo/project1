package ramdaa.exam01_no_arguments_no_return;

public class example {
	
	public static void main(String[] args) {
		
		mymy ii;
		
		ii = () -> {
			
			String str = "안녕";
			
			System.out.println(str);
			
		}; // 람다식 : ii에 선언된 추상메소드를 Overriding하는 익명구현객체를 생성 
		
		ii.method(); 	//ii에 선언된 추상메소드 호출(다형성-2)
		
	} // main

}
