import java.util.Arrays;

//2022.03.08
//2022.03.10 -> temp 대신 

// # 과제 - 배열의 정렬
//	1) int[] arr = new int[10]; // 배열 선언
//	2) 무작위 정수를 추출해서 각 원소의 값을 넣어주십시오 		// math random
//	"복원추출" 기준으로 하기 - 정렬은 같은 숫자가 있을 수도 있다.
//	enhanced for문?
//	3) 이 배열의 원소를 정렬(작은값 -> 큰값으로 정렬 => 오름차순 정렬)
//		또는 (큰값 -> 작은 값으로 정렬하는 => 내림차순 정렬)
//	: 정렬을 한번 해보면 배열을 능숙하게 쓸 수 있음 / 정렬 알고리즘 많이 있음
//	4) 알고리즘 
//		=> https://terms.naver.com/entry.naver?docId=2270437&cid=51173&categoryId=51173

//	버블 정렬 : 풍선은 중력을 거슬러 올라감, 정렬의 대상이 되는 숫자가 풍선처럼 올라감.
//				두개씩 먼저 비교함, 만약 오름차순이면 큰 숫자를 오른쪽으로 밈, 작은숫자면 왼쪽으로 밈
//				자리바꿈 하게 됨
//				-> 완전히 큰 숫자가 오른쪽으로 갈때까지 반복한다!
//				1 epoch 
//				그리고 또 첫번째처럼 반복한다 ~
//				가장 큰 숫자가 이미 오른쪽에 자리잡고있으면 비교할 필요가 없다!
				
//	문제는 epoch를 언제 끝내야하냐? 조건문 사용해서 더이상 자리바꿈이 없을때 끝낸다!!
//	한번 더 모든 데이터를 소진하는 1 epoch가 더 들어가야한다(정말 모든 원소가 정렬되어있는지 확인)
	
//	* 더이상 비교 할 필요가 없다는건 어떻게 할 것인가?
//	* 정렬이 끝났다는 판정을 어떻게 할 것인가?
//	* 몇 epoch만에 끝났는지 과제에 표현해주기!!!!



public class Example9 {				//협조자 : 구글
	
	public static void main(String[] args) {
		
		int[] arr = new int[10];		// 배열에 10개의 원소 공간 미리 확보
		
		int number = 0; 				// epoch
		
//		-----------------------일반 for문------------------
		
//		for(int i = 0; i<10; i++) {
//			
//			arr[i] = (int)(Math.random()*100) +1;
//			
////			System.out.print(arr[i] + ",");
//			
//		} // for문 - 1부터 100까지의 난수
//		
//		System.out.println("난수는 " + Arrays.toString(arr) + " 입니다.");
//		
//		for(int i = 0; i<arr.length; i++) {
//			
//			for(int j = 0; j<arr.length-1; j++) {
//				
//				if(arr[j] > arr[j+1]) { 		//만약 j첫번째가 j+1번째보다 값이 크다면
//					
//					int temp = arr[j+1];		// temp에 j+1번째 값을 넣는다
//					arr[j+1] = arr[j];			// j+1번째 자리에 j의 값을 넣는다
//					arr[j] = temp;				// j번째에 temp에 저장되어있던 j+1값을 넣는다
//					// 이를 통해 작은 수는 오른쪽 큰 수는 다음번째 자리인 왼쪽으로 옮기는 작업을 실행한다
//					
//				} // if
//				
//				number++;
//
//	
//			} //inner for - 단, 버블정렬의 경우 이미 큰수가 오른쪽에 마지막 자리는 고려하지 않기 때문에 -1을 해준다
//		
//			
//		} // outer for - 배열에서 하나씩 값을 빼온다.
		
//		----------------------일반 for문------------------
		

		
		for(int i = 0; i<10; i++) {
			
			arr[i] = (int)(Math.random()*100) +1;
			
			
		} // for문 - 1부터 100까지의 난수
		
		
		System.out.println("난수는 " + Arrays.toString(arr) + " 입니다.");
//		 인덱싱 해야하는 배열은 enhanced for문 쓰지말기 // 출력은 arrays 쓰는게 낫다		
		
//		for(int k : arr) {
//			
//			System.out.println(k);
//			
//		} // enhanced for 사용
		
		
		for(int i = 0; i<arr.length; i++) {
			
			for(int j = 0; j<arr.length-1; j++) {		//epoch 몇 회전
				
				if(arr[j] < arr[j+1]) { 		//만약 j첫번째가 j+1번째보다 값이 크다면
					
//					-------------------
					
					int temp = arr[j+1];		// temp에 j+1번째 값을 넣는다
					arr[j+1] = arr[j];			// j+1번째 자리에 j의 값을 넣는다
					arr[j] = temp;				// j번째에 temp에 저장되어있던 j+1값을 넣는다
//					// 이를 통해 작은 수는 오른쪽 큰 수는 다음번째 자리인 왼쪽으로 옮기는 작업을 실행한다
//					// temp 변수가 왜 필요한지 알고 썼음?
					
//					number++;
					
//					------------------
					
////					A => (A+B) -A = A - A + B = B
////					B => (A+B)-B = A + B - B = A
//					
//					int A = (arr[j] + arr[j+1] - arr[j]) ;
//					int B = (arr[j+1] + arr[1] - arr[j+1]) ;
//	------------------------------------------------------------------				
					
					int sum = arr[j] + arr[j+1];
					int 차이 = arr[j] - arr[j+1];
					
					arr[j] = (sum + 차이) / 2;
					arr[j+1] = (sum-차이) / 2;
					
					number++;
					
					
					
				} // if

				
//				number++;
				
				

	
			} //inner for - 단, 버블정렬의 경우 이미 큰수가 오른쪽에 마지막 자리는 고려하지 않기 때문에 -1을 해준다
		
			
		} // outer for - 배열에서 하나씩 값을 빼온다.
		
		
		
		System.out.println("정렬된 난수는 " + Arrays.toString(arr) + " 입니다.");
		System.out.println("epoch : " +  number);
		
	} // main
	
	
} // end class
