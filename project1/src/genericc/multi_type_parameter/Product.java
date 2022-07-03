//2022.03.24

package genericc.multi_type_parameter;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//제네릭 타입 클래스의 선언 - 멀티타입 파라미터를 가짐(T , M)
//선언할 때니까 구체타입을 받을 타입 파라미터를 선언하고
// 그 T를 어디에 써야할까 고민!
// 어노테이션을 어디에 쓸 수 있는지 배웠음 : 필드, 타입선언부(모든 필드에 게터세터 만들어라) ...

@ToString
@Getter					
@Setter
@NoArgsConstructor
public class Product<T, M> {
	
//	# 선언
	private T kind;
	private M model;
	
//	* 이 아래 지워도 게터세터 생성 되었음! 어노테이션을 붙여서
//	public T getKind() { return this.kind; }
//	public M getModel() { return this.model; }
//	
//	public void setKind(T kind) { this.kind = kind; }
//	public void setModel(M model) { this.model = model; }
	
} //end class

