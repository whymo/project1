
//2022.03.07

public class ArrayInArrayExample {
	
	public static void main(String[] args) {
		
//		int[][] mathScores = new int[2][3]; 	// 왜 중복된 for문? 2차원이라서?
		
		// { {1,2,3}, {4,5,6} }
		
//		for(int i=0; i<mathScores.length; i++) { 	// 바깥 입장에서는 2
//			
//			for(int k=0; k<mathScores[i].length; k++) { // 인덱싱기법 - 알고리즘 문제에서 잘 나옴
//				
//				System.out.println("mathScores[" + i + "][" + k + "]=" + mathScores[i][k]);
//				
//			} //inner-for  --> 안쪽 각각의 원소 입장에서 [i].length *** :  안쪽의 배열을 지칭하기 위해서 length를 사용함
//			
//			
//		} //outer-for
//		
		// int타입이라서 정수 0 
		
		
//		--------------enhanced for
		
		
// 배열 = 객체
// 가장 바깥 1개 , 제각각 힙에 생성된 안쪽에  3개 , 		
// 원소가 하나도 없을수도 있다 {	};
	
		int[][] mathScores = { {1,2} , {3,4} , {5,6,7}, {} }; // 값의 목록을 먼저 만들어둔다 
		
// mathScores를 arr1로 끄집어냄
		for(int[] arr1 : mathScores ) { 	// 1차원 배열
			
			for(int number : arr1) { 		// 스칼라?
				
				System.out.println(number);
				
			} //inner-enhanced for
		
			
		} // outer - enhanced for
		
		// 원소가 3개이다  / ctrl + space 자동완성
		System.out.println("원소의 길이 : " + mathScores.length); 		// 바깥쪽 기준으로
		System.out.println("첫번째 원소 배열의 길이 : " + mathScores[0].length);
		System.out.println("두번째 원소 배열의 길이 : " + mathScores[1].length);
		System.out.println("세번째 원소 배열의 길이 : " + mathScores[2].length);
		System.out.println("네번째 원소 배열의 길이 : " + mathScores[3].length);
		
		// 이게 가능한 이유는 모든 원소가 배열이라서 쓸 수 있다. 만약 마지막에 8을 넣으면 컴파일 오류가 나온다
		// 빈 배열은 넣어도 된다 {}
		
		System.out.println();
		
//		===========================
		
//		int[][] englishScores = new int[2][];
//		englishScores[0] = new int[2];
//		englishScores[1] = new int[3];
		
		
	} //main

} //end class
