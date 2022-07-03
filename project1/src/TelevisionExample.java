//2022.03.11

public class TelevisionExample {
	
	public static void main(String[] args) {
		
		// 대전제2 : 정적멤버는 정적 멤버답게 사용해라!
		
		System.out.println(Television.info);
		
		Television obj = new Television();
		System.out.println(obj.info); //=> 이건 대전제2 어기는것임
		
	} //main

} // end class
