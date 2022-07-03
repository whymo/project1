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
public class ChildProduct<T, M, C> extends Product<T, M> {	// 3개까지는 괜찮은데 4개 이상은 잘못되고있따!
	
	   private C company;
	   
//	   public C getCompany() { return this.company; }
//	   public void setCompany(C company) { this.company = company; }
	   
} // end class

