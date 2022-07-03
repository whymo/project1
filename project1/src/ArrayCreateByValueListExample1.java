
// 2022.03.04

public class ArrayCreateByValueListExample1 {
	
	
	public static void main(String[] args) {
		
//		<베열> *** 자바 언어에서 배열은 한번 생성하면, 두가지를 바꿀수가 없다!
//			첫번째 : 배열 원소의 타입은 한번 선언되면 바꿀 수 없다
//			두번째 : 배열의 크기(길이 = 원소의 개수)

	
		
		//배열이란? 같은 타입의 데이터를 0개 이상 저장할 수 있는
		// 자료구조(Data Structure)이자, "객체"이다!!
		// 배열 -> 기본타입, 참조타입 둘 다 넣을 수 있다
		// 배열의 원소는 기본타입의 원소가 될수도 있고, 참조타입의 원소도 담을 수 있다. 배열에는 모든 원소가 같은 타입이여야하고, 제약없이 모두 담을 수 있다!
		// 원소의 타입을 지정 -> int
//		int[] scores = { 83, 90, 87}; // 이게 배열이다 --> 3개의 원소를 갖는 배열 객체를 생성
		
//		--------실험
		
//		int[] scores; // 배열변수의 선언
//		scores = {1, 2, 3}; // 안된다
//		scores = new int[] 	{1, 2, 3};
		
//		----굳이 위 처럼 어렵게 할 필요 없다
		
//		int[] scores = { 83, 90, 87};
//		
//		int[] scores2;
//		scores2 = new int[]{1, 2, 3};
//		scores2 = scores;
//		
//		--------------- 실험
		
//		int[] scores = { 83, 90, 87};
//		
//		
//		System.out.println("scores[3]: " + scores[3]);
		// ㄱ 이렇게 오류가 난다 : 배열 인덱스 번호가 배열을 벗어났다
		//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
		//at ReferenceTypeArrayExample.main(ReferenceTypeArrayExample.java:40) 
		
		
//		------------------ 마이너스 인덱싱 가능 실험
		
//		int[] scores = { 83, 90, 87};
//		
//		// 파이썬은 - 마이너스 인덱싱 허용할까?
//		
//		System.out.println("scores[-1]: " + scores[-1]);
//		
//		// 이것도 똑같이 오류가 난다!
		
		
		
//		System.out.println("scores: " + scores); 	//[I@4517d9a3 주소가 나온다 -> 왼쪽 꺽쇠 [ I : 인티져 -> 우리 모르게 클래스를 만든다
		
//	-----------------------------아래 원래 예제---------------------------------------
		
		int[] scores = { 83, 90, 87};
		
		
		
		// 0번이라는 인덱스부터 시작한다!!
		System.out.println("scores[0] : " + scores[0]); //배열의 첫번째 원소 출력
		System.out.println("scores[1] : " + scores[1]); //배열의 두번째 원소 출력
		System.out.println("scores[2] : " + scores[2]); //배열의 세번째 원소 출력
		
//		---- 여기까지 배열의 생성 -----
		
		
		int sum = 0;
		
		// 0~2까지 -> 반복문을 통해서 배열을 누적시키기 위해서
		// 인덱스 번호가 0부터 2여서 3미만으로 설정 , 증감식은 1씩
		
		for(int i=0; i<3; i++) { //배열이 저장하고 있는 모든 데이터의 합을 구하자! ------>원래 코드
		
//		for(int i=0; i  <= scores.length -1 ; i++) { // 
			
			sum += scores[i];	// 누적시키기
		} //for
		
		System.out.println("총합 : " + sum);
		
//		-----------총합 구하기 ------------
		
		// avg => 평균
		// 총합을 배열의 원소의 갯수로 나누면? int 타입의 리터럴임 소수점을 나오게 하려면 double : 실수타입으로 형변환 시켜주기!
		double avg = (double) sum / 3; // 배열 데이터의 총합과 원소의 개수로 평균을 구하자!
		
		System.out.println("평균 : " + avg);
		
//		----------------------------------
		
		
		
		
	} // main

} // end class
