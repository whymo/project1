//2022.03.21

//#3. 다중인터페이스 구현!
package interfacee.multi_implement_class;


public class RemoteControlExample {
	
	
	public static void main(String[] args) {
		
		//그냥 구현객체 생성
		SmartTelevision tv = new SmartTelevision();
		
		// 다형성-1 수행
		RemoteControl rc = tv;		// 첫번째 인터페이스 타입(부모) 참조변수에 대입 가능
		Searchable searchable = tv; // 두번째 인터페이스 타입(부모) 참조변수에 대입 가능
		
		// 다형성-2 수행
		rc.turnOn();
		searchable.search("http://www.naver.com");
		
		// 디폴트 메소드 호훌
		rc.setMute(false);		// 디폴트 메소드는 마치 기본 메소드처럼 사용 가능하다!
		
//		RemoteControl rc2; 		//선언만 됨
//		RemoteControl rc2 = null;	// => run하면 -> Exception : 객체 없이는 사용 xx
//		rc2.setMute(false); 
		
//		---------------------------------------------------
		
		Searchable rc3 = new Searchable() {		//다형성-1 -> searchable 인터페이스 하나만 구현

			@Override
			public void search(String url) {		// rc3으로는 search 구현 가능?
				System.out.println("search(url) invoked." );
				
			} // search
			
		}; //anonymous implementation object
		
		rc3.search("http://www.daum.net");		// 다형성-2 -> rc3에서 디폴트 메소드를 사용할 수 없다
		
	} // main
	
} // end class
