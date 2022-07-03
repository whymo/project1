//2022.03.17
//inheritance 상속



package org.zerock;


public class DmbCellphoneExample {
	
	public static void main(String[] args) {
		
//		1.
		DmbCellphone dmbCellphone = new DmbCellphone("자바폰", "검정", 10);
		
//		2.
		System.out.println("모델 : " + dmbCellphone.model );
		System.out.println("색상 : " + dmbCellphone.color );
		
//		3. 자식클래스에만 선언된 DmbCellphone의 필드의 사용 => 당연히 ok
		System.out.println("채널 : " + dmbCellphone.channel );
		
//		4. 부모 클래스인 Cellphone으로부터 상속 받은 메소드 호출 => 상속 재산은 내꺼!
		dmbCellphone.powerOn();
		dmbCellphone.bell();
		dmbCellphone.sendVoice("여보세요");
		dmbCellphone.receiveVoice("안녕하세요! 저는 홍길동인데요");
		dmbCellphone.sendVoice("아~ 예 반갑습니다.");
		dmbCellphone.hangUp();
		
//		5. 자식클래스에만 선언된 DmbCellphone의 메소드 호출
		dmbCellphone.turnOnDmb();
		dmbCellphone.changeChannelDmb(12);
		dmbCellphone.turnOffDmb();

		
	} // main

} // end class
