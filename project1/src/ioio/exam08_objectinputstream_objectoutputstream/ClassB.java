//2022.04.05

package ioio.exam08_objectinputstream_objectoutputstream;

import java.io.Serializable;

import lombok.NoArgsConstructor;


@NoArgsConstructor // => 롬복으로 만들어도 직렬화 되는지 , 직렬화 과정에서 롬복이 문제 없는지! => 없다!
public class ClassB  
	implements Serializable { // un Serializable => 이렇게하면 오류!
	
	
	int field1;
	
} // end class

