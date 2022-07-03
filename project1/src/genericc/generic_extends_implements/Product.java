//2022.03.24

package genericc.generic_extends_implements;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
@Getter
@NoArgsConstructor
public class Product<T, M> {
	
	private T kind;
	private M model;
	
	
//# @Setter	@Getter 어노테이션 붙여서 생략
//	public T getKind() { return this.kind; }
//	public M getModel() { return this.model; }
//	
//	public void setKind(T kind) { this.kind = kind; }
//	public void setModel(M model) { this.model = model; }
	
} // end class

//-------------------------------------------

@NoArgsConstructor
class Tv {
	;;
	
} // end class