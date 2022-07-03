//2022.03.23
//2022.03.24

package genericc.a_generic_type;

import lombok.NoArgsConstructor;
import lombok.ToString;

// generic_type 중, 제네릭을 클래스에 적용 ==> "제네릭 클래스"

@ToString					// 출력물 이쁘게 만들어주는 어노테이션
@NoArgsConstructor			// 디폴트생성자 만들어주기
public class Box<T> {		// T -> 타입 파라미터! 
							// 이 box 사용해서 객체 생성하려할때 타입 파라미터에 값을 줘야한다?
	private T t;			// 필드 선언 / (String은 클래스 참조타입의 이름이다.)
	
	
	// 메소드(Getter/Setter)선언
	public T get() { return t; }		 // GET
	public void set(T t) { this.t = t; } //SET // set뒤에 t -> integer가 된다
	
} // end class
