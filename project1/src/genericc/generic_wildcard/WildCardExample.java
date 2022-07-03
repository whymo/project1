//2022.03.24

package genericc.generic_wildcard;


import java.util.Arrays;

// #제네릭 와일드카드 이해하자!
public class WildCardExample {
	
//	Course<?> course = new Course<Person>("일반인과정", 5); 이렇게 되었음 -> 다 수용하겠다!
	// 모든 사람이 들을 수 있는 일반인 과정 등록 메소드
	public static void registerCourse(Course<?> course) {		// 매개변수 : Course
		System.out.println(course.getName() + 
							" 수강생: " + 
							Arrays.toString(course.getStudents()));
 	} //registerCourse
	
	// 학생만을 대생으로 하는 학생과정 등록 메소드
	public static void registerCourseStudent(Course<? extends Student> course) { // extends Student | 위쪽 막아두고 그 밑에 허용 : 어퍼 바운디드(upper bounded)
		System.out.println(course.getName() + " 수강생: " + 
						Arrays.toString(course.getStudents()) );
 	} // registerCourseStudent
	
	// 재직자를 대상으로 하는 등록 메소드
	public static void registerCourseWorker(Course<? super Worker> course) { // super Worker |  로월 바운디드 (lower bounded)
		System.out.println(course.getName() + " 수강생: " + 
						Arrays.toString(course.getStudents()));
	} // registerCourseWorker
	
	
	public static void main(String[] args) {
		Course<Person> personCourse = new Course<Person>("일반인과정", 5); // 
		
		// 다형성-1에 의해서 Person 클래스에서 Worker,Student,HighStudent 다 된다!
//			#1. 모든 사람이 들을 수 있는 일반인 과정 등록 메소드
			personCourse.add(new Person("일반인"));		// ok
			personCourse.add(new Worker("직장인"));		// 다형성-1
			personCourse.add(new Student("학생"));		// 다형성-1
			personCourse.add(new HighStudent("고등학생"));	// 다형성-1
			
//			WildCardExample.registerCourse(personCourse);				// ok
			
//			WildCardExample.registerCourseStudent(personCourse); 		//(x)
			
//			WildCardExample.registerCourseWorker(personCourse);			// ok
//			최소한 워커이거나 워커 상위 타입은 모두 허용하는 all이다!
			
//			----------------------------------------------------------------------
			
		// #2. 재직자를 대상으로 하는 직장인과정 
		Course<Worker> workerCourse = new Course<Worker>("직장인과정", 5);
		
			workerCourse.add(new Worker("직장인"));		// 모집인원 1명
//			
//			WildCardExample.registerCourse(workerCourse);				// ok
			
//			WildCardExample.registerCourseStudent(workerCourse); 		//(x)
//			왜 안될까?
//			상속관계가 없다! 학생도 아니고 학생 자식 타입도 아니다! 그래서 못들어간다
			
//			WildCardExample.registerCourseWorker(workerCourse);			// ok
			
//			-------------------------------------------------------
			
		// # 3. 학생만을 대생으로 하는 학생과정 
		Course<Student> studentCourse = new Course<Student>("학생과정", 5);
		
			studentCourse.add(new Student("학생"));
			studentCourse.add(new HighStudent("고등학생"));
//			
//			WildCardExample.registerCourse(studentCourse);			//ok
			
//			WildCardExample.registerCourseStudent(studentCourse);	// ok
			
//			WildCardExample.registerCourseWorker(studentCourse); 	//(x)
//			안됨 왜?
//			최소한 워커이거나 부모인 일반인 person은 되어도 학생은 될 수 없다!
//			person 밑에 자식이 있는데 woker / student가 있음 -> student 수용 못하는 와일드카드
			
//			----------------------------------------------------------
			
		//	#4.  고등학생만을 대상으로 하는 과정 
				
		Course<HighStudent> highStudentCourse = new Course<HighStudent>("고등학생과정", 5);
			highStudentCourse.add(new HighStudent("고등학생"));	
//		
//			WildCardExample.registerCourse(highStudentCourse);			// ok
			
//			WildCardExample.registerCourseStudent(highStudentCourse);	//ok
			// 최대한 학생이거나 고등학생 이하라면 다 수행하는 all이다!!
			
//			WildCardExample.registerCourseWorker(highStudentCourse); 	//(x)
//			안됨 왜?
//			최소한 워커이거나 부모인 일반인 person은 되어도 학생은 될 수 없다!
			
//---------------------------------------------------------------------------------------------	

	} // main
	
} // end class
