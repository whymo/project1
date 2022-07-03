//2022.03.11

public class Earth {
	
//	파이널 상수는 그 필드의 값을 보존하기 위함이다! 값을 못바꾸게 하기 위한
//	진짜 상수를 만들기 위함은 아니다
//	누가봐도 진리의 값은 static final 
//	어디에 붙여? 필드에 붙여야지 어디서든 사용할 수 있는 진리 값을 만들 수 있다!
// 여긴 필드이다	
	static final double EARTH_RADIUS = 6400;
	static final double EARTH_SURPACE_AREA;
	
	final int age = 0; // => 그 값을 못고치게 할 목적이면, 진리값 상수를 만드는건 아니다!!
	
	//값이 들어가고선 못고치게 랩을 씌워야하기 때문에 초기화할 장소를 준다!
	// 복잡한 로직을 통해 진리값을 표현식으로 생성한 다음에 초기값으로 넣어줄수 있다는걸 보여줌
	//이걸 만들지 않더라도 저위에 있는 클래스를 뜯어보면 결국에는 이렇게 스테틱 이니셜라이저 안에 들어가있다!
	static {	
		EARTH_SURPACE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;	
	} // static initializer
	
//	(매개변수) {지역변수}
	void intanceMethod(String name) {		//String name->매개변수
//		이 안은 지역변수
//		바뀌면 안되기 때문에 final (변수 값 보전)
		final int temp = 0;
		
	} // instanceMethod

} // end class
