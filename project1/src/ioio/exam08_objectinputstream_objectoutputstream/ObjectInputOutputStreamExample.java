//2022.04.05

package ioio.exam08_objectinputstream_objectoutputstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectInputOutputStreamExample {
	
	
	public static void main(String[] args) throws Exception {
		
//		# 객체의 직렬화(Serialization)를 통한 객체 입력 =====================================================================
		
		// 1. 지정된 파일에 객체를 저장하기 위한 바이트 기반의 파일출력스트림 생성
//		FileOutputStream fos = new FileOutputStream("C:/Temp/Object.dat");
//		
//		// 2. 파일 출력스트림에 객체출력보조스트림 연결(생성자 매개변수로)
//		ObjectOutputStream oos = new ObjectOutputStream(fos);		
//		
//		// 3. 다양한 참조타입의 객체를 출력(이때, 내부적으로 객체의 "직렬화"가 발생
//		//		조건 : 출력할 객체를 찍어낸 클래스는 기본적으로 Serializable 태그 인터페이스를
//		//				반드시 implements 해야함 (***)
//		oos.writeObject(10);		// Integer 객체 저장
//		oos.writeObject(3.14);		// Double 객체 저장
//		oos.writeObject(new int[] { 1, 2, 3 });	// 배열 객체를 저장
//		oos.writeObject(new String("홍길동"));	// 문자열 객체를 저장
//		
//		// 4. 출력스트림은 기본 출력버퍼를 가지고 있으니, 강제 flush 수행 
//		oos.flush();	
//		
//		// 5. 자원해제 : 보조스트림부터 닫고, 다음 기반 스트림을 닫는다!(순서)
//		oos.close(); fos.close();
		
//		# 객체의 역직렬화(De-Serialization)를 통한 객체 출력 ========================================================
		
		// 1. 여러 참조타입객체를 저장한 파일에 대한 바이트기반의 파일입력스트림 생성
		FileInputStream fis = new FileInputStream("C:/Temp/Object.dat");
		
		// 2. 객체입력보조스트림 생성(by the argument of the constructor)
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		// 3. 객체입력보조스트림의 readObject() 메소드로, 파일에 쓴 순서대로
		//		다시 객체를 읽어드림 :
		//		이때 내부적으로, 파일에 저장된 객체의 "역직렬화(De-Serialization)" 수행
		// 		조건 : 객체를 읽어드리는 JVM 메소드 영역에, 해당 참조타입의 클래스(Clazz객체)가
		//			있어야 하고, 파일에 객체를 저장할 때 사용된 클래스와 현재 파일로부터
		//			객체를 읽어드릴 때 사용하는 클래스(즉, 양쪽 시점의 클래스가 같아야 한다!)
		Integer obj1 = (Integer) ois.readObject();
		Double obj2 = (Double) ois.readObject();
		int[] obj3 = (int[]) ois.readObject();
		String obj4 = (String) ois.readObject();
		
		// 4. 자원해제 : 보조스트림부터 먼저 닫고, 기본 스트림을 닫는다!
		ois.close();
		
		fis.close();
		
		// 5. 제대로 역직렬화를 통해, 파일로부터 객체가 잘 복원되었는지 확인하기 위해 출력
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3[0] + "," + obj3[1] + "," + obj3[2]);
		System.out.println(obj4);
		
	} // main
	
} // end class
