//2022.03.23

package genericc.none_generic_type;


public class Box {
	private Object object;					// 필드 타입을 조상 클래스인 Object 타입으로 선언!
	
	
	public void set(Object object) {		// 	Setter		// 조상클래스면 못들어갈 것이 없다 : 다형성-1
		this.object = object;
	} // set
	
	
	public Object get() {					//Getter
		return object;
	} // get
	
} // end class

