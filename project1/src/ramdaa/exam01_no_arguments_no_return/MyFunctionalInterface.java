//2022.03.25

package ramdaa.exam01_no_arguments_no_return;


@FunctionalInterface
public interface MyFunctionalInterface {	// 추상메소드가 1개 이상이면 오류가 난다! => FunctionalInterface 아니기 때문
	
	// # 추상메소드
	
//	  public abstract void method();		 	// 첫번째 케이스 (매개변수 없, 리턴타입 없)
    
//    public abstract void method2(int age);	// 두번째 케이스 (매개변수 있, 리턴타입 없)
//    
//		public abstract int method3();			// 세번째 케이스 (매개변수 없, 리턴타입 있)
//    
    	public abstract int method4(int age);		// 4번째 케이스 (매개변수 있, 리턴타입 있)
    
//    ㄴ 이 4개의 범위에서 어떤 메소드던 선언되면 된다!
//    	결국 이 중에 단 1개의 형태로 1개의 추상 메소드가 선언될텐데, 
//   	 4가지의 형태에 따라 람다식 만드는 방법이 조금씩 달라짐
    
} // end interface

