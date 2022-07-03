
//2022.03.08


public class StudentExample {
	
	public static void main(String[] args) {
		
		//
		Student s1 = new Student();
		
		System.out.println("s1 변수가 Student 객체를 참조합니다.");
		System.out.println(s1); // 주소가 나옴
		
//		--
		
		Student s2 = new Student();
		
		System.out.println("s2 변수가 Student 객체를 참조합니다.");
		System.out.println(s2); // 주소가 나옴
//		--
		
		System.out.println(s1==s2);
		System.out.println(s1!=s2); // new는 이미 찍어낸걸 다시 찍어내지 않는다!
		
	} // main
	

} // end class
