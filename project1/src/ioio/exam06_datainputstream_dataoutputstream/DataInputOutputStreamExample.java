// 2022.04.04ㄴ

package ioio.exam06_datainputstream_dataoutputstream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataInputOutputStreamExample {
	
	
	public static void main(String[] args) throws Exception {
		
		// 롬복으로 할때는 어떤 순서로 해야함? -> 순서를 정하는 속성이 없다! -> 확실하지 않음! 
		// try-with-resources 로 해줘야함! (자바언어의 문법)
		
		FileOutputStream fos = new FileOutputStream("C:/Temp/primitive.dat");
		DataOutputStream dos = new DataOutputStream(fos);
		
		dos.writeUTF("홍길동");	// 1. 문자열
		dos.writeDouble(95.5);	// 2. 실수
		dos.writeInt(1);		// 3. 정수
		
		dos.writeUTF("감자바");	// 4. 문자열
		dos.writeDouble(90.3);	// 5. 실수
		dos.writeInt(2);		// 6. 정수
		
		dos.flush();
		
		// * 근간이 되는 스트림과 보조스트림 자원해제를 할때에는,
		// 순서대로 합니다 : 1) 보조스트림부터 먼저 닫아 해제하고 -> 2) 근간이 되는 스트림 해제!
		dos.close();
		fos.close();
		
//		--------------------------------------------
		// # 읽을때 왜 write 순서대로 읽음??
		
		FileInputStream fis = new FileInputStream("C:/Temp/primitive.dat");	// 읽는것도 파일의 처음부터 읽는다
		DataInputStream dis = new DataInputStream(fis);
		
		for(int i=0; i<2; i++) {
			String name = dis.readUTF();		// 문자열
			double score = dis.readDouble();	// 실수
			int order = dis.readInt();			// 정수
			
			System.out.println(name + " : " + score + " : " + order);
		} // for
		
		dis.close();
		fis.close();
		
	} // main
	
}// end class

