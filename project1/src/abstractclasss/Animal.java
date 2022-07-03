package abstractclasss;

//추상 클래스를 통해, 적어도 "동물" 이라면, 반드시 가져야할 속상과 기능(행위)를
// 필드와 메소드로 선언하여, 이를 "규격"화 해서, 상속받는 자식 클래스가 반드시
// 이 "규격" 을 지키도록 해줌(어떻게?? 수단이?? => "추상메소드")

public abstract class Animal {
	public String kind;
	
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	} //breathe

	// "추상메소드"(abstract method):메소드의 시그니처만 있고, 구현부({})가 없음.
	// 이 추상클래스를 상속받는 모든 자식클래스에서는, 이 "추상메소드"를 반드시
	//구현(즉, 메소드 오버라이딩(재정의)해야함!
	// 만일 구현하지 않으면, 해당 자식클래스조사, "추상클래스"가 되어야함(아니면 오류발생!)
	public abstract void sound(); // 소리내라! ==> 반드시 재정의 해야함!!!
	
} // end class

