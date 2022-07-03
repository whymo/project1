//2022.04.04

package ioio.exam01_file;

import java.io.File;
import java.net.URI;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileExample {
	
	
	public static void main(String[] args) throws Exception {
		
		File dir = new File("C:/Temp/Dir");
		File file1 = new File("C:/Temp/file1.txt");	// 없을수도 있지만 오류가 나지 않는다
		File file2 = new File("C:/Temp/file2.txt");
		
		// 특정 로컬자원을 지칭할때 file:/// 규약이다!
		File file3 = new File(new URI("file:///C:/Temp/file3.txt"));	// URI 타입의 생성자 매개변수
		
//		# 처음보는 객체 만나면 찍어봐라
//		System.out.println("1. dir : " + dir);
//		System.out.println("2. file2 : " + file2); // 포인팅하고있는 경로 나옴! toString 오버라이딩

		
//		---------
		
		// 파일 디렉토리 존재하냐? 안하면 만들어라!
		if(dir.exists() == false) {  dir.mkdirs();  }	// mk : 만들어라  dirs : 디렉토리"들"을
		if(file1.exists() == false) {  file1.createNewFile();  }
		if(file2.exists() == false) {  file2.createNewFile();  }
		if(file3.exists() == false) {  file3.createNewFile();  }
		
//		# Temp 폴더 가면 생성되어있다!
		
//		----------

		File temp = new File("C:/Temp");
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd   a   HH:mm"); // a : 오전 오후 포맷팅 기호
		
		System.out.println("1. sdf : " + sdf);
		
		File[] contents = temp.listFiles();	//  1.listFiles : 모든 파일 / 단 알아서 리컬시브 하지 않음(찾아 들어가지 않음)
		
		System.out.println("날짜              시간         형태       크기    이름");
		System.out.println("-------------------------------------------------------------------");
			
		for(File file : contents) {
			
			System.out.print(sdf.format(new Date(file.lastModified()))); // 2. 포맷 적용 / lastModified : 최종 수정시간
			
			if(file.isDirectory()) {
				System.out.print("\t<DIR>\t\t\t" + file.getName());		// \t : 탭키 \n : 엔터키 // 3.
			} else {
				System.out.print("\t\t\t" + file.length() + "\t" + file.getName()); // 4.
			} // if-else
 			System.out.println();
 			
		} // enhanced for
		
	} // main
	
} // end class
