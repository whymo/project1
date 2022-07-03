//2022.03.24

package genericc.generic_wildcard;

import lombok.Getter;

// 이런 클래스들은 라이브러리에 다 있음 만들 기회는 거의 없다!

@Getter
public class Course<T> {		// 학원의 모든 과정을 대표하는 클래스
	private String name;		// 과정명
	private T[] students;		// 수강생
								// 필드의 타입이 배열인데, T타입의 배열임 (한명이 아니니 배열)
	
	
	public Course(String name, int capacity) {	// 과정명과  capacity(수용가능인원)을 받음
		this.name = name;		// 필드 초기화
		
		// 제네릭 타입파라미터의 배열 생성은 아래와 같이 해야 한다!!(***)
		// 2단계로 배열을 생성합니다.
		// STEP1. 우선, Object 타입의 원소를 가지는 배열을 생성합니다.
		// STEP2. 강제형변환을 통해서, 배열의 원소가 T인 배열로 변환합니다.
		
//		students = new T[]; ---> 안됨
		students = (T[]) (new Object[capacity]);		// 이것밖에 방법 없다! 
	} // Constructor

//	* 이렇게 getter 만들 필요가 없다!! --> 어노테이션으로 해결 가능
//	public String getName() { return name; }			// Getter
//	public T[] getStudents() { return students; }		// Getter
	
	public void add(T t) {	// 수강생을 모집할때마다, 학생배열에 추가
		for(int i=0; i<students.length; i++) {
			
			if(students[i] == null) {		// 빈자리 넣었고
				students[i] = t; 
				
				break;
			} // if
			
		} // for
		
	} // add
	
} // end class
