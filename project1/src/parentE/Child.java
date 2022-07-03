package parentE;


import lombok.AccessLevel;
import lombok.NoArgsConstructor;


@NoArgsConstructor(access=AccessLevel.PUBLIC)// access 이 속성으로 AccessLevel 여기에는 접근제한자가 있다 거기에서 PUBLIC 설정 
public class Child extends Parent {
	
	
	public String field2;
	
	
	public void method3() {
		System.out.println("Chile::method3() invoked.");
	} // method3

} // end class
