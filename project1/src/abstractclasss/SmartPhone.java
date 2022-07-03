//2022.3.21

package abstractclasss;


public class SmartPhone extends Phone {		// 상속받음
	
	
	// 1. 생성자
	public SmartPhone(String owner) {
		super(owner);			// 부모가 있어야 자식도 있다!!
	} // SmartPhone constructor
	
	// 2. 메소드
	public void internetSearch() {
		System.out.println("인터넷 검색을 합니다.");
	} // internetSerch method
	
} // end class
