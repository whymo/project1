
//2022.03.08

public class Korean {
	
	// ssn = 소셜 시크리트 넘버 주민번호
	// 필드 - 객체 데이터 보관
	String nation = "대한민국";
	String name;
	String ssn;		// 유니크하니까 초기화 필요
	
	
	
//	---------권하지 않는 나쁜코드!!!-----------
//	public Korean(String n, String s) {	// 이렇게 코딩하지 않는다!
////											유의미하게 지어야한다! 그래서 관례가 name , ssn 이런식으로
////											필드 이름과 동일하게 짓는다!!!
//		
//		name = n;
//		ssn = s;				
//	} // constructor
//	-----------------------------------
	
	// 초기화 코드
	
	public Korean(String name, String ssn) {
		
		this.name = name;
		this.ssn = ssn;				// this가 뭐임? : 인스턴스의 주소값을 그대로 들고있음
//									this는 클래스 안에서만 쓰는 특수한 키워드이다!
//									왜 만들어냈을까?
		
//		name = name;
//		ssn = ssn; ===> 이렇게 적으면 둘다 매개변수가 된다 자바는 구분하지 못한다
//						필드는 초기화 할 수 없다!
//						
//						그래서 ==> 객체의 레퍼런스.필드명 사용한다!
//						
		
//		System.out.println("this : " + this ); 		// this 찍어보기
		
	} // constructor

} // end class
