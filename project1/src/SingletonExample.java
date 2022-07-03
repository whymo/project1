//2022.03.11

public class SingletonExample {
	
	public static void main(String[] args) {
		
// 현관문밖에서 방안이 보임? 안보임!
//	다른 클래스에서 봤을때 공개됐다 안됐다인거지 클래스 내에서는 없는 것 처럼 생각하면 된다!!
//	like 방 안에서는 보이는 것 처럼
		
//		Singleton obj1 = new Singleton();	//컴파일 에러 ===> 생성자가 안보인다 / private 생성자는 new로 호출 못함
		// new를 얼마든지 할 수 있다는건 객체가 계속 생성된다 : 이건 싱글톤이 아니다! -> 그래서 틀어막음
		
//	Singleton obj1 = Singleton.getInstance();
//	Singleton obj2 = Singleton.getInstance();
//	
//	if(obj1==obj2) {
//		
//		System.out.println("같은 Singleton 객체 입니다.");
//	} else {
//		System.out.println("다른 Singleton 객체 입니다.");
//		
//	} // if-else
		
//		-----------------------------------------
		
		for(int i=0; i<0; i++) {
			Singleton obj = Singleton.getInstance();
			System.out.println(obj);
			
		} // for
		
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		// 자바 라이브러리 소스도 보면서 해야함
//		if(obj1 == obj2);		-> 이걸 비교한다는게 뭔 의미인지 모르면 하나마나이다!
		
		// 검증하다 : 뒤에 나온게 false면 assert 오류발생
//		assert obj1 == obj2;	// ture면 그냥 지나가고 아님 에러
		
//		assert obj1 != obj2;	// 같지 않아도 OK?
		
//		assert 1 == 2;			// 계속 ok 나옴
		
		// jdk 8에서 실행하니까 오류가 뜸 -> 다른 오류임 jvm이 잘못됨
		// assert 키워드 사용하지 말기!! => 그냥 지나가버린다
		
		System.out.println("OK");	// 검증 성공하면 OK
			
	} // main

} // end class
