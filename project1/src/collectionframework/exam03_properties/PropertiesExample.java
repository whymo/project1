
//2022.03.29

package collectionframework.exam03_properties;

import java.io.FileReader;
import java.net.URLDecoder;
import java.util.Properties;

//Properties :  설정 정보를 가지고있는 파일!
public class PropertiesExample {
	
	
	public static void main(String[] args) throws Exception {
		
//		1. properties map 객체 생성
		Properties properties  = new Properties();
		
//		----------
		
//		# clazz 객체를 얻어내는 방법 3가지
//		(1) 타입명.class 속성을 이용하는 방법
			 Class clazz1 =PropertiesExample.class;	
//		(2) 참조타입변수명.getClass() 를 이용하는 방법 -> 조상 클래스 Object가 물려주는
			 Class clazz2 = properties.getClass();
//		(3) FQCN 이름과 Class.forName(FQCN)를 이용하는 방법
			 Class clazz3 = Class.forName("java.util.Properties");
		
		System.out.println("1. clazz1 : " + clazz1);
		System.out.println("2. clazz2 : " + clazz2);
		System.out.println("3. clazz3 : " + clazz3);
//		==> ToString 메소드 오버라이딩 하고있다!
		
		System.out.println("4. clazz2 == clazz3 : " + (clazz2 == clazz3));
		System.out.println("5. clazz1 == clazz3 : " + (clazz1 == clazz3));	// clazz1은 PropertiesExample 실행 클래스를 받고있어서 다르다
		
		System.out.println("===================");	
		
//		----------------------------------------------------------------------------

		
//		2. 지정된 ***.properties 파일을 로딩(loading) 하여,
//			1 에서 생성한 properties map 객체로 저장
		String path = 
				PropertiesExample.class.getResource("TTT.properties").getPath();	// 타입명.클래스 -> 클래쯔객체 얻는 방법
		// 예제와 다르게 properties 파일을 TTT로 해놔서 "TTT.properties" 이 부분을 고쳐야 한다!!
		
		System.out.println("1. path : " + path);
		
		path = URLDecoder.decode(path, "utf-8");	// 이건 web에 가서 배운다!
		System.out.println("2. path : " + path);
		
		properties.load(new FileReader(path));		// *** : 로딩 및 map에 저장 => 파일을 읽어낼 수 있는 FileReader
		
		
//		3. properties 맵객체에 저장된 개별 속성(property)를 사용
//			이때,  properties에 있는 getProperty(속성명) 메소드를 호출해서 값을 얻어냄!!
		String value1 = properties.getProperty("option1"); 	// getProperty  리턴 타입은 string 문자열이다!
		String value2 = properties.getProperty("option2");
		String value3 = properties.getProperty("option3");
	
		
		
//		4. 얻어낸 각 속성값을 출력
		System.out.println("option1 : " + value1);
		System.out.println("option2 : " + value2);
		System.out.println("option3 : " + value3);

	}
}

