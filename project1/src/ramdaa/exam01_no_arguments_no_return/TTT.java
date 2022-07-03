package ramdaa.exam01_no_arguments_no_return;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class TTT {

//	인스턴스 필드
	String name = "yoyo";
	int age = 23;

	private void instancemethod2() {;;}
	
	// final => 값을 변하지 못하게 하기 위해 , 랩, 상수화
	// 상수화된 값은 더이상 TTT 객체 소속이 아니라 clazz 소속이다!!
	// 소속이 바뀌었으니까 항상 값을 쓸 수 있다 !! 생명 주기가 람다식보다 더 길어짐!
	// 하지만 못고치게 상수화 시켜버리면 어떡하냐??!!!
	// 값을 바꾸려고 만든게 변수인데 못바꾼다?
	// 람다식 내부에서 쓰는 지역변수에 final 붙일 필요가 없다!! -> 자바 컴파일러가 "자동"으로 붙여준다!
	public void instanceMethod(final int param) {
		
		final int temp = 333;			//지역변수 -> 생성된 지역변수는 언제 파괴됨? 메소드 블록이 끝날때!
		int temp2 = 1000;
	
		temp2 = 100;
		
		MyFunctionalInterface fi = a -> {	// 다형성-1
			
			// * 람다 내부에서 this는 자기 주소를 가르키지 못하고 바깥 타입인 TTT를 가르킨다!
			
			// 람다식 내부에서 this는, 람다식이 만든 익명구현객체의 주소를 가지고 있지 않고,
			// 오히려 람다식을 포함하고 있는 바깥타입의 객체의 주소를 가지고 있다!!
			System.out.println("2. this " + this); 		// 컴파일 오류 안남!!
			System.out.println("3. name " + name); 
			System.out.println("4. age " + age);
			
			// 생명주기가 다른, 지역변수를 익명객체가 사용한 경우,
			// 먼저 파괴되는 지역변수의 값을, 익명객체가 결정할 수 없는
			// 상태에 빠지게 되는데, 이 상태를 "closure"(클로져) 라고 한다!!
			System.out.println("5. temp " + temp);
			System.out.println("6. param " + param);
//			System.out.println("7. temp2 " + temp2);		// 오류남
			
			// 애초에 람다식 내부에서는 closure"(클로져) 발생하지 않도록 지역변수 사용하지 않는 것이 최선이다!!


			this.instancemethod2();
			
			return 777;
			
		}; // 람다식 => 익명구현객체 생성
		
//		* 객체가 생성되면 버츄얼머신의 힙 영역에 들어감
// 		* 객체는 개발자가 파괴할 수 없다
//		* 지역변수 int temp 와 람다식의 생명은 다르다! temp가 더 빨리 파괴됨!
		
		fi.method4(23);		// 다형성-2  꼭 해야함!!!
		

		
	} // instanceMethod
	
} // end class
