package ramdaa.exam04_function;


import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;


public class FunctionExample1 {
	
	// 여러 요소를 목록으로 보관하는 타입 : List - > 무제한으로 들어감
	private static List<Student> list = Arrays.asList(		//asList : 리스트로 만들어 준다!
		new Student("홍길동", 90, 96),	// 영어점수 90 수학점수 96
		new Student("신용권", 95, 93)	// 영어점수 95 수학점수 93
	);
	
	
	//function 인터페이스의 목적 : 매핑(a -> b)
	public static void printString(Function<Student, String> function) { // Student = T, String = R
		for(Student student : list) {
			System.out.print(function.apply(student) + " ");
		} // enhanced for
		
		System.out.println();
	} // printString
	
	public static void printInt(ToIntFunction<Student> function) { 		// 학생 객체를 INT 값으로 줘야한다
		for(Student student : list) {
			System.out.print(function.applyAsInt(student) + " ");
		}// enhanced for
		
		System.out.println();
	} // printInt
	
	
//----------------------------------------------------
	
	public static void main(String[] args) {
		
//		System.out.println("[학생 이름]");
//		
//		FunctionExample1.
//			printString( 	// 정적 메소드는 정적메소드 답게 FunctionExample1. 추가 
////				    R apply(T t);
//					t -> t.getName() 	// 람다식으로 익명구현객체 생성하여 전달(전달인자)
//			);	
//		
////		--------
//		
//		System.out.println("[영어 점수]");
//		
////	    int applyAsInt(T value);
//		FunctionExample1.
//				printInt( 
//					t -> t.getEnglishScore()	// t 를 줄테니 int 값으로 반환하라 무엇을? getEnglishScore  영어점수를
//				);
//		
////		---------
//		
//		System.out.println("[수학 점수]");
//		
////	    int applyAsInt(T value);
//		FunctionExample1.printInt( 
//				t -> t.getMathScore() 		//  t : 학생
//				);
	
//	-----------------------------------<직접 해보기>---------------------------------
//	 1. 목록으로 트레버스를 해야한다 / 펼쳐보면~
	
		// 전달인자를 던지는게 대입이다!
		ToIntFunction<Student> mapping = s ->  s.getMathScore();	// 인터페이스타입 참조변수 (부모타입) = (자식객체)
		
	
		for( Student s : list ) {
				
//			System.out.println(s.getMathScore());		// (1) : 	NOT recommended. 추천하지 않음
			
			int mathScore = mapping.applyAsInt(s);		// (2) : from now on.
			System.out.println(mathScore);
		} // enhanced for
	
//-------------------------------------------------------------------------------------------------	

	} // main
	
} // end class
