//2022.03.24

package genericc.generic_method;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
@Getter
@NoArgsConstructor
public class Box<T> {
	
	// 필드명 : t
	private T t;
	
//	* 게터세터 이거 대신 롬복으로 어노테이션 붙이기!
//	public T get() { return t; }
//	public void set(T t) { this.t = t; }
	
} // end class
