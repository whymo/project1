//2022.03.29

package samplee;

//	-----------------------즉석과제--------------------------
//	java.util.List 타입의 clazz 객체를 얻어내는 3가지 방법

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class Practice { 
	
	public static void main(String[] args) throws Exception  {
		

		ArrayList<String> list = new ArrayList<String>();
		
//	(1) 타입명.class 속성을 이용하는 방법
		Class clazz1 =Practice.class;	
	 

//	(2) 참조타입변수명.getClass() 를 이용하는 방법 -> 조상 클래스 Object가 물려주는
		 Class clazz2 = list.getClass();
		 
//	 (3) FQCN 이름과 Class.forName(FQCN)를 이용하는 방법
		 Class clazz3 = Class.forName("java.util.ArrayList");
		 
		 System.out.println("1. clazz1 : " + clazz1);
		 System.out.println("2. clazz2 : " + clazz2);
		 System.out.println("3. clazz3 : " + clazz3);


		list.add("2");	
		list.add("3");	
		list.add("4"); 
		
//		-------------------------------------------------------
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		
	} // main

} // end class
