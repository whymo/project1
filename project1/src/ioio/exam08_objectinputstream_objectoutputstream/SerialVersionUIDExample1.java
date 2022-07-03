//2022.04.05

package ioio.exam08_objectinputstream_objectoutputstream;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerialVersionUIDExample1 {
	
	// # SerialVersionUID 무슨 역할을 하는지?!
	
	public static void main(String[] args) throws Exception {
		
		// 1. 파일에 대한 출력스트림 생성
		FileOutputStream fos = new FileOutputStream("C:/Temp/Object.dat");
		
		// 2. 객체를 파일에 출력하기 위한, 객체출력보조스트림 생성
		ObjectOutputStream oos = new ObjectOutputStream(fos);		
		
		// 3. 직렬화할 객체를 생성( Serializable 함)
		ClassC classC = new ClassC();
//		classC.field1 = 1; 	// int 타입의 인스턴스필드 초기화
		
		// 4. 객체 출력
		oos.writeObject(classC);
		
		// 5. 자원 해제
		oos.flush();	
		
		oos.close();  
		fos.close();	
		
	} // main
	
} // end class
