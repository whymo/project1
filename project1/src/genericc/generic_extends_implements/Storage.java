//2022.03.24

package genericc.generic_extends_implements;

// 인터페이스는 롬복을 사용하지 않는다
// 인터페이스에는 생성자, 필드 없기때문에!
// 인터페이스는 클래스 사용시 사용한다!!
public interface Storage<T> {		// 저장장치
	
	
	// 규격 설정
	public abstract void add(T item, int index);		// 저장해야하고
	public abstract T get(int index);					// 끄집어낼 수 있어야 한다
		
} // interface
