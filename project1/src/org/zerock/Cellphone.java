//2022.03.17
//inheritance 상속

package org.zerock;

//import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

//@NoArgsConstructor				// default 생성자 생성하라 => 이 어노테이션은 타입선언부에만 붙일 수 있다!
//@AllArgsConstructor
public class Cellphone {		// 전화기
	
	
	
//	1. 고유속성 필드
	String model;
	String color;
	
	
//	2. 생성자 -> 자바컴파일러의 default constructor => 이걸 막으면 자바 컴파일러가 자동으로 만들어줌
//	public Cellphone(String model, String color) {		// 매개변수 넣어줌
	
	public Cellphone() {								
		System.out.println("Cellphone() invoked.");		// 부모 객체 호출 로그
	} // default constructor
	
	public Cellphone(String model) {							
		System.out.println("Cellphone(model) invoked.");
		
		this.model = model;
	} // default constructor 2
	
	public Cellphone(String model, String color) {								
		System.out.println("Cellphone(model, color) invoked.");	
		
		this.model = model;
		this.color = color;
	} // default constructor 3
	
//	----------------------------------------------------
	
//	3. 메소드
	void powerOn() {System.out.println("전원을 켭니다.");}
	void powerOff() {System.out.println("전원을 끕니다.");}
	
	void bell() {System.out.println("벨이 울립니다.");}
	
	void sendVoice(String message) {System.out.println("나 : " + message);}
	void receiveVoice(String message) {System.out.println("상대방 : " + message);}
	
	void hangUp() {System.out.println("전화를 끊습니다.");}
} // end class
