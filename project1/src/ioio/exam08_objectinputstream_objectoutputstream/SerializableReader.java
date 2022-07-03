//2022.04.05

package ioio.exam08_objectinputstream_objectoutputstream;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializableReader {
	
	
	public static void main(String[] args) throws Exception {
		
		System.out.println(">>> ClassA.field3 : " + ClassA.field3);	// 역 직렬화랑 상관이 없음 => 메소드 영역필드 => 값은 제대로 됨 => 하지만 이거로만 판단하기는 애매
		// 하지만 다른클래스인 여기서는 3이 왜 안나올까?
		// 여기서는 메소드 영역의 field3을 찍음! -> 이건 초기값을 준 이후로 바뀐 적이 없음!!
		// 바꾼것은 객체 안에서 바꾼 것이다! 그 객체는 직렬화 대상이자 힙 영역 객체이다!
		// 힙 영역 객체 바꾼거지, 메소드 영역의 객체를 바꾼것은 아니다!!
		
		// 1. 객체가 저장된 파일에 대한 입력스트림 생성
		FileInputStream fis = new FileInputStream("C:/Temp/Object.dat");
		
		
		// 2. 객체입력 보조스트림 생성
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		// 3. 보조스트림을 통해, 파일에 저장된 객체의 복원(이때, "역직렬화"수행됨)
		ClassA v = (ClassA) ois.readObject(); // 다형성-1로 반환된 객체로부터, 원래 자식객체로 강제로 빼냄!!
		
		// 4. 과연 복원된 객체의 다양한 유형의 필드의 값은 잘 복원될까?? 확인
		System.out.println("field1: " + v.field1);
		System.out.println("field2.field1: " + v.field2.field1);
		
		// 그래서 field3을 복원했을때 그대로 나온다!
		System.out.println("field3: " + v.field3);
//		System.out.println("ClassA.field3: " + ClassA.field3);	// 정적 멤버는 정적 멤버답게, 근데도 0이 출력됨! 
		// 객체가 복원될때는 힙에 생성된 객체로 복원됨!
		
		System.out.println("field4: " + v.field4);
		
	} // main
	
} // end class
