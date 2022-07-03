
//2022.03.08

//# 과제 4


public class BicycleExample {
	
	public static void main(String[] args) {
		
		// 왜 노란색이 뜰까? -> 인스턴스 myBicycle1 넣어줌
		Bicycle myBicycle1 = new Bicycle("검정", 123456); //고유데이터
		
		System.out.println("회사명 : " + Bicycle.company);
		System.out.println("모델명 : " + Bicycle.model);
		System.out.println("자전거의 무게 : " + Bicycle.weight);
		System.out.println("기어 단계 : " + Bicycle.gear1 + "단계");
		
		System.out.println("자전거의 색 : " + myBicycle1.color);
		System.out.println("시리얼넘버 : " + myBicycle1.number);
		
		System.out.println("-----------------------------------------");
	
		
		Bicycle myBicycle2 = new Bicycle(20,"전진", false, 2); // 상태
		
		System.out.println("속력 : " + myBicycle2.speed);
		System.out.println("방향 : " + myBicycle2.direction);
		System.out.println("브레이크 상태 : " + myBicycle2.brake);
		System.out.println("기어의 상태 : " + myBicycle2.gear2);
		
		
		if(myBicycle2.brake == false) { 		// 동등비교연산자
			
			System.out.println("브레이크 오프");
			
		} else {
			
			System.out.println("브레이크 온");
			
		} // if-else	
		
		
		System.out.println("-----------------------------------------");
		
		Bicycle myBicycle3 = new Bicycle("안장", "핸들", "레버", "차체", "기어", "페달", "휠", "체인", "타이어");
		
		System.out.println("자전거의 부품 : ");
		
		System.out.print( myBicycle3.seat + ",");
		System.out.print( myBicycle3.handle + ",");
		System.out.print( myBicycle3.lever + ",");
		System.out.print(myBicycle3.frame + ",");
		System.out.print( myBicycle3.gear + ",");
		System.out.print(myBicycle3.pedal + ",");
		System.out.print(myBicycle3.wheel + ",");
		System.out.print( myBicycle3.chain + ",");
		System.out.print(myBicycle3.tire + ",");
		
		
		// 자전거 부품 정보를 다 따로 뽑아야 한다!
		
		

	} // main class

} // end class
