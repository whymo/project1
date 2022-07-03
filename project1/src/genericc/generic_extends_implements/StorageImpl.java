//2022.03.24

package genericc.generic_extends_implements;

import lombok.ToString;

@ToString
// # 구현 클래스
public class StorageImpl<T> implements Storage<T> {	// StorageImpl : 자식 | Storage<T>  얘가 승계해야한다
	private T[] array;		
	
	
	public StorageImpl(int capacity) {
		this.array = (T[]) (new Object[capacity]);		// Object 만들고 형변환 해야한다!
	} // constructor
	
	@Override
	public void add(T item, int index) {		// 규격이 내려온다
		array[index] = item;
	} // add

	@Override
	public T get(int index) {
		return array[index];
	} // get
	
} // end class / 강사님은 end interface 라고 했음!? ㄴ
