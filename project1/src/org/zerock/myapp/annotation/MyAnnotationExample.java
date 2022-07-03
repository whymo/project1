//2022.03.15

package org.zerock.myapp.annotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MyAnnotationExample {
	
////메소드 영역에, 아래의 서비스 타입에 대한 정보를 모두 가지고 있는
////clazz 객체가 없으면, new 연산자로 객체를 생성할 수가 없음.
////즉, classNotFoundException 이란 오류가 발생!
//Service s = new Service(null, 10);
//---------------------------------
	
//	java reflection API를 이용하여, Service 클래스에 붙여놓은
//	MyAnnotation 이름의 어노테이션 정보를 이용 
	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// clazz : 클래스 파일을 버츄얼 머신이 구동될때 
		Class clazz = Service.class;		// 모든 객체 들고있는 clazz객체 달라!
		System.out.println("1. clazz: " + clazz);
		
		
		//배열의 타입이 메소드이더라! / 메소드도 객체임
		Method[] methods = clazz.getDeclaredMethods();		//왜 이걸 호출해야지? 시그니처 확인해야함 -> static 없음 : 인스턴스 메소드
//														인스턴스 메소드 사용하려면 객체 생성해야함!! -> 위에서 얻음
		for(Method method : methods) {
			System.out.println(method);
		} // enhanced for
		
//		-----
		
		Method instanceMethod = methods[0];
		Method staticMethod	=	methods[1];
		
//		------
		boolean isPresent = instanceMethod.isAnnotationPresent(MyAnnotation.class);		// 타입명.class 왜 지정함? -> .class는 앞에 있는걸 불러오는?
																						//MyAnnotation 이 타입의 어노테이션이 붙어있느냐를 검사함
		//

		System.out.println("2. MyAnnotationPresent : " + isPresent);		// true 나옴 -> 붙어있다는 뜻
		
//		------
			
		MyAnnotation myAnnotation = 
				instanceMethod.getAnnotation(MyAnnotation.class);
		System.out.println("3. MyAnnotation : " + myAnnotation);

//		-----------------------------------------------------------
		
		// 안에 어노테이션을 호출해주는거다!
		// 위에 true로 붙어있다고 했으니 그걸 달라! , 시그니처 확인하고 써라!
		String value = myAnnotation.value();
		int number = myAnnotation.number();
		
		System.out.println(
				String.format("value : %s, number : %d", value,number)		// 포메팅해서 찍어봄!
				);
//		format : 정적 메소드  : 클래스명.format-> 그래서 정적 메소드
		
//		-------------------------------
		
		//인스턴스 메소드 호출시키다
//		instanceMethod.invoke(value, args)

//		----
		
//		Object:
//		MyAnnotation 불어있는 메소드가 호출될때,
//		메소드 호출로그를 우리가 직접 코딩하는게 아니라,
//		자동으로 메소드 호출로그를 출력하는 기능을 구현하는데 
//		어노테이션의 메타데이터를 사용하자!

//		System.out.println("---[" + instanceMethod.getName() + "] ---");
//		for(int i=0; i<number; ++i) {
//			System.out.print(value);		// 계속해서 하이픈을 찍음 30번
//		} // classical for
//		
//		System.out.println();		// enter
//		
//		instanceMethod.invoke(new Service("Yoyo",23), 100);		// 인스턴스메소드가 int age 가지고있다
		
//		Service :: instanceMethod(age) invoked 이렇게 호출된다
		
	      System.out.println("--- ["+instanceMethod.getName()+"] ---");
	      for(int i=0; i<number; ++i) {
	         System.out.print(value);
	      } // classical for
	      
	      System.out.println();   // Enter
	      
//	      instanceMethod.invoke(new Service("Yoseph", 23), 100);		// 이름을 같게 하면 오류남

		
	} // main

} // end class
