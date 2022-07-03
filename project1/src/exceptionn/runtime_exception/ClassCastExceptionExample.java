//2022.03.22


package exceptionn.runtime_exception;

// public은 하나의 클래스에만 붙일 수 있다!
public class ClassCastExceptionExample {
	
	
	public static void main(String[] args) {
		
		Dog dog = new Dog();									// dog 자식 객체 생성
		 ClassCastExceptionExample.changeDog(dog);				// 메소드 호출 (자식 객체를 전달)
		
		Cat cat = new Cat();									// cat 자식 객체 생성
		 ClassCastExceptionExample.changeDog(cat);				//메소드 호출 (자식객체를 전달)
	} //main
	
//	매개변수의 타입이 상속관계에서 "부모"타입으로 선언!!
	public static void changeDog(Animal animal) {				// 매개변수에서 다형성-1 발생!
		
	
//		if(animal instanceof Dog dog) {								// 안전한 형변환!! => Dog dog = (Dog) animal; 기능 동일!
		
		//다형성-1의 상태에서, 자식객체를 "강제"로 끄집어 냄!
		//=> 강제형변환해야한다!! 이때 예외 발생!!! -> run 해봐야 알 수 있음 : runtime_exception
			Dog dog = (Dog) animal; 				//ClassCastException 발생 가능
//		} //if
	} // changeDog
	
} // end class


//-----이런 코딩은 바람직하지 않다! 예제를 위해서 하는 것------------

class Animal {;;}
class Dog extends Animal {;;}		
class Cat extends Animal {;;}

