//2022.3.21

package abstractclasss;


public class AnimalExample {
	
	
	public static void main(String[] args) {
		
		//1. 자식객체 생성
		Dog dog = new Dog();	
		Cat cat = new Cat();
		
		//2. 각 자식객체가 구현한 소리를 발생시킴
		dog.sound();	// 자식 객체의 메소드를 단순호출(다형성? 없음) => 이렇게 코딩하면 x
		cat.sound();	// 자식 객체의 메소드를 단순호출(다형성? 없음) => 이렇게 코딩하면 x
		
		System.out.println("---사용(이용)관계로써, 자식객체 활용--");
		
//		------------
		
		//변수의 자동 타입 변환
		Animal animal = null;	// 부모타입 변수 선언 (초기값 null:어떤 객체도 담고있지 않다)
		
		animal = new Dog();		// 다형성 -1 : 모든 자식타입 객체는 부모타입에 대입 가능
		animal.sound();			// 다형성 -2 : 부모타입 sound 호출하는 순간, 자식객체가 재정의해서 자식객체 메소드 호출!
		
		animal = new Cat();		// 다형성-1
		animal.sound();			// 다형성-2
		
		System.out.println("--다형성 이용---");
		
//		-------------------------
		
		//매개변수의 자동 타입 변환
		animalSound(new Dog());		// 
		animalSound(new Cat());
	} // main
	
//	-------------------------
	//정적멤버
	// 메소드의 매개변수의 타입이, 추상클래스인 부모타입
	public static void animalSound(Animal animal) {		// Animal animal = new Dog();  
		animal.sound();		// 다형성-2
	} //animalSound 
	
} // end class
