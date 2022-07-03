//2022.04.05

package ioio.exam08_objectinputstream_objectoutputstream;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

// 자식객체만 직렬화하면 부모객체는 상관이 없을까? -> 상관 있다!!
// 상속과 객체의 (역)직렬화의 관계 : (******)
// (1) 만약 부모 클래스가 Serializable 하면, 자식 클래스가 Not-Serializable 해도, 직렬화/역직렬화 가능!
// (2) 만약 부모 클래스가 Serializable 하지 않고, 자식 클래스만 Serializable 하면, 직렬화/역직렬화 불가능!

// (2)번 케이스 예제 문제 
// ===> 부모 클래스 필드 직렬화 안됨!!!
public class Child 
	extends Parent 	// 부모객체가 먼저 생성
	implements Serializable {
	
	public String field2;	// 직렬화 됨
	
//	========================================================
//	** 그래서 아래의 코드가 중요하다!
	
	// # 객체의 직렬화 수행시, 아래의 메소드를 재정의 하면, 이 메소드가 대신 호출됨
	private void writeObject(ObjectOutputStream out) throws IOException {
       System.out.println("Child ::writeObject(out) invoked.");
		
	   out.writeUTF(field1);		// 부모필드 먼저 쓰게 함! => 직렬화를 하는게 아니라 문자열을 출력하는 메소드
	   out.defaultWriteObject();	// 버츄얼머신이 수행하는 직렬화 코드 **
	} // writeObject

	// 객체의 역직렬화 수행시, 아래의 메소드를 재정의 하면, 이 메소드가 대신 호출됨
	private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
       System.out.println("Child ::readObject(in) invoked.");
		
	   field1 = in.readUTF();		// writeUTF 썻으니 readUTF로 수행!	=> 출력된 문자열을 읽는 read 메소드!
	   in.defaultReadObject();		// 원래 버츄얼 머신이 수행하던 메소드 호출 => 직렬화된 필드 복원
	} // readObject
	
//	==> 메소드 오버라이딩이 아니다! / 부모도 직렬화가 필요할때 이 메소드들을 구현하면 된다!! ** 
//	==> 객체의 직렬화나 역직렬화 수행시, chile 클래스에 이 메소드가 있다면 한번 기회를 줌!!
//	==> ObjectOutputStream 여기에는 out.defaultWriteObject(); 원래 직렬화하는 메소드가 있다
//	==>  out.writeUTF(field1); : 그래서 부모로 물려받은 이 필드는 내가 직접 출력 시키겠다!
	
} // end class
