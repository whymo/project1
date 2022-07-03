//2022.03.11

public class Person {
	
	// 상수는 두가지 final 상수 / static final 상수 => 이 둘은 틀리다!!
	// 원주율 같은 상수 -> static final 왜? final은 각 객체가 들고있는 
	//랩을 씌워서 상수로
	final String nation = "Korea";
	final String ssn;
	String name;
	
	public Person(final String ssn, final String name) {	// 생성자에서 호출된 값을 바꾸지 못하게 보호!!!
		this.ssn = ssn;
		this.name = name;
	} // constructor

} // end class
