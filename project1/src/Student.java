
//2022.03.08


// 껍데기 클래스의 가장 기본이다!

public class Student {
	
	;; // 아직 결정 못했다는 의미
	
} // end class

//-----------------------------
//class Student { // --> 여기 이름을 B에서 Student로 바꿨더니 오류가 사라졌다!
//	;;
//} // end class
	
//public class A {;;}	//end class --> 컴파일 오류 : The public type A must be defined in its own file
//									// 퍼블릭 타입인 a는 자기 자신만의 파일로 정의되어야 한다 : 한곳만 허용

//public class B {;;}	//end class ---> 이러면 오류남 소스파일 이름이랑 달라서!
//							// 소스파일 이름 바꿔도 오류남 : The type B is already defined : 이미 있어서
//-----------------------------------------------
class B {;;}	//end class 

class C {;;}	//end class

// 클래스가 4개 생성됨 , 소스파일은 public 이 접근제한자 뒤에 붙은 클래스 이름으로 소스파일명을 지어야한다! 