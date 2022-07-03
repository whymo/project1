import java.util.Arrays;


//  # 과제7 : 삽입정렬 => 민주님 코드

public class Example12 {
	
	public static void main(String[] args) {
		
		int[] arr = new int[30]; // 배열 크기 30개 생성
		int from = 38;
		int to = 200;
	
		int epoch = 0;			// 정렬된 횟수
		int number = 0;			// 자리바꿈 횟수
		
		for(int i=0; i < arr.length; i++) {
			
			arr[i] = (int)(Math.random()*(to-from +1))+from; 	// to-from+1을 통해서 난수 범위의 길이를 +from을 통해 범위가 시작하는 구간을 설정
			
		} // for => 무작위 난수 30개를 랜덤으로 뽑는다
		
		
		System.out.println("정렬 전 : " + Arrays.toString(arr)); // 정렬 전 출력
		
		
		Outer : for(int i=1; i < arr.length; i++) { 	// i번째 원소를 빼, 앞에 있는 원소들과 비교하는 반복문 + 자리 옯기는(작은수가 앞으로)
			// 삽입 정렬의 경우, 2번째 수를 기준으로 비교하는 것부터 시작하기때문에 i를 배열 1로 두어서 2번째 원소부터 비교하게 해준다.
			
			
			Inner : for(int j=0; j < arr.length; j++) {		// j를 0부터 시작함으로써 i가 1부터 시작되는것과 비교가 됨
				
				if(j != i) {	// outer-if : j가 i랑 같지 않을때까지 돌아감
					
					if(arr[i] < arr[j]) {	// -> 뒷자리 i가 앞자리 j보다 작으면 실행 
						
						int temp = arr[j];		// 앞자리 j를 temp에 넣어둠
						arr[j] = arr[i];		// 앞자리 j 자리에 j보다 작은 i가 들어간다
						arr[i] = temp;			// i 자리에 temp에 넣어둔 j를 넣는다
						
						number++;				// 자리바꿈 횟수
						
					} // if : i가 j보다 작으면 실행됨 (자리바꿈)
	
				} else {
					
					break Inner;
					
					
				} //if-else -> 만약 j랑 i가 같아진다면 Inner for문 부수고 Outer로 돌아간다
	
				
			}  // inner-for
			
			epoch++;
			
		} // outer-for 
		
		
		System.out.println("정렬 후 배열 : " + Arrays.toString(arr));
		System.out.println("자리바꿈 횟수 : " + number);
		System.out.println("epoch 횟수 : " + epoch);
		
		
		
		
	} //main

} //end class
