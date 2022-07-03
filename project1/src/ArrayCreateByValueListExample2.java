
// 2022.03.04

public class ArrayCreateByValueListExample2 {
	
		public static void main(String[] args) {
			
			int[] scores;
			scores = new int[] {83,90,87};	// 그래서, 직접 new 연산자로 생성해야함!
			
//			---
			
			int sum1 = 0;
			
			for(int i=0; i < scores.length; i++) {
				sum1 += scores[i];
				
			} // for
		
//		----
			
			System.out.println("총합 : " + sum1);
			
			// new int 이런식으로 배열을 생성해야한다!!
			
			int sum2 = add(new int[] {83, 90, 87}); 		// 배열 생성 -> 이건 ok
//			int sum2 = add({83, 90, 87}); 					// -> 이건 안된다
			
			System.out.println("총합 : " + sum2);
			System.out.println();
	
	} // main
		
//		----처음으로 main이란 메소드 말고 add라는 메소드를 만들었다!
		
		public static int add(int[] scores) {		// scores : 매개변수 -> 이 문법을 몰라서 못쓰는 개발자들이 있다
			int sum = 0;
			for(int i=0; i<3; i++) {
				sum += scores[i];
				
			} // for
			
			return sum;   	// 리턴 타입으로 값을 되돌려줘야한다!
			
		} // add

} // end class
