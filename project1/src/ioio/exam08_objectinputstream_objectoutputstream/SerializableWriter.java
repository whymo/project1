//2022.04.05

package ioio.exam08_objectinputstream_objectoutputstream;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializableWriter {
	
	
	public static void main(String[] args) throws Exception {
		
		// 1. 파일에 대한 출력스트림 생성
		FileOutputStream fos = new FileOutputStream("C:/Temp/Object.dat");
		
		// 2. 객체를 파일에 출력하기 위한, 객체출력보조스트림 생성
		ObjectOutputStream oos = new ObjectOutputStream(fos);		
		
		// 3. 직렬화할 객체를 생성하고, 필드값을 초기화
		ClassA classA = new ClassA();
		classA.field1 = 1;
		classA.field2.field1 = 2;	// 부품관계의 필드도 같이 따라서 직렬화 될까?? (***) 
		
		//아래 두 최기화 모드 0으로 나옴 왜? 
		// 이게 과연 정적 필드 값을 바꾼것일까??
		classA.field3 = 3;			// 정적필드는 직렬화에서 제외	// 문법상 틀림, 정적 멤버는 정적  멤버답게! // 초기화
		ClassA.field3 = 3;			// 참조변수대신, 클래스명으로 수정!
		
		
		classA.field4 = 4;			// transient 필드도 직렬화에서 제외
		
		
		System.out.println("***** " + classA);		// field3 이 안보임! -> clazz 소속이기 때문에!!
		
		// 3을 부여해서 3으로 출력됨
		System.out.println("\t1. " + classA.field3);	// 값은 3이 나옴
		System.out.println("\t2. " + ClassA.field3);	// 값은 3이 나옴
		
		// 4. 파일에 객체를 출력(직렬화 발생)
		oos.writeObject(classA);
		
		// 5. 자원정리
		oos.flush();	
		
		oos.close();
		fos.close();	
		
	} // main
} // end class
