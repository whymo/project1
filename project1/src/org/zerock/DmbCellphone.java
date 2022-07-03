//2022.03.17
//inheritance 상속


package org.zerock;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class DmbCellphone extends Cellphone {		// 부모상속! => 기능확장
	
	//1. 필드
	int channel;
	
	// 2. 매개변수가 있는 생성자 => 생성자 목적? 인스턴스 필드값 초기화해줌
	DmbCellphone(String model, String color, int channel) {		//필드가 하나인데 왜 3개 해줌? extends 키워드 쓰자마자 상속이 됨
										// 부모 클래스에 모델, 컬러 필드가 있음 부모로부터 받았기때문에 자식꺼다! => 그래서 초기화가 가능!
		
//		super("model", "color") ;		// 첫줄에는 ok -> 부모객체가 완전히 생성 되려면 인스턴스필드 초기화까지 되도록 생성자 호출!
						// 자식객체 첫줄에서 생성자 호출해줘야한다!
		
//		super();		// 우리가 넣어도 상관없다! => 자바 컴파일러에 의존하지 말라고 했으니 우리가 호출해준다!
						//by java compoler, but do not use this
		
		super(model, color);		// 부모 생성자 초기화!
		
		System.out.println("DmbCellphone(model, color, channel)");	// 자식 객체 호출로그
														
//		this.model = model;		// this는 초기화가 아니라 값을 바꿨을 뿐이다!
//		this.color = color;		//super해줬으면 정석은 자식 객체에서 부모 객체 초기화하면 안됨!
		this.channel = channel;	
		
		
		// super 키워드를 출력해보자
//		System.out.println("\t + 1. this :" + this);	// \t 탭키
//		System.out.println("\t + 1. super :" + super);	// super는 찍을수가 없다!!!
		
		//super()로 부모객체의 생성자를 호출해보자!
		
		
		
		
		
	
	} // constructor
	
	//메소드 => 우리 눈에는 안보이지만 부모 메소드도 상속 됨 -> 어떻게 확인? Outline view
	void turnOnDmb() {
		
		System.out.println("채널" + channel + "번 DMB 방송 수신을 시작합니다.");
	} // turnOnDmb
	
	 void changeChannelDmb(int channel) {
		 
		 this.channel = channel;
		 System.out.println("채널" + channel + "번으로 바꿉니다.");
		 
	 } //changeChannelDmb
	 
	 void turnOffDmb() {
		 System.out.println("DMB 방송 수신을 멈춥니다.");
	 } //turnOffDmb

} // end class
