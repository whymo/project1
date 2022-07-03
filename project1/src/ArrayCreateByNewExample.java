
//2022.03.07

public class ArrayCreateByNewExample {
	
	public static void main(String[] args) {
		
		
		// 값을 주지 않고 공간만 확보했다. 그래서 찍어보면 0이 나온다. 
		// 배열이 초기화되지 않으면 원소의 타입대로 기본값을 넣어준다
		int[] arr1 = new int[3]; // 객체생성연산자, 정수값을 3개 보관할 수 있는 배열을 생성하겠다
		
//		for(int i=0; i<3; i++) { 	// 배열 안에 원소를 하나씩 꺼내서 출력하겠다
//			
//			System.out.println("arr1[" + i + "] : " + arr1[i]);
//		} //for
		
//		----------------------
		// Iterable(반복가능한) 객체만 enhanced for에 올 수 있다
		for( int number : arr1 ) {
			
			System.out.println(number);
			
		} // enhanced for -> 소괄호로 시작하는건 동일하지만 이건 중간에 콜론이 있다! -> 자료구조가 오른쪽에 온다 , 콜론은 자동으로 
		// 데이터를 하나씩 끄집어내서 왼쪽에 준다 (왼쪽에는 변수) _ int 타입 변수를 놓고 거기에 넣어준다
//		
//		----------------- 
		
		
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		
//		for(int i=0; i<3; i++) {
//			
//			System.out.println("arr1[" + i + "] : " + arr1[i]);
		
//		} // classical for
		
//		--------- enhanced for
		
		for(int number : arr1 ) {
			
			System.out.println(number);
		} // enhanced for
		
		
//		---------------
		
		double[] arr2 = new double[3];
		
//		for(int i=0; i<3; i++) {
//			
//			System.out.println("arr2[" + i + "] : " + arr2[i]);
//		} // classical for
		
		for( double number	: arr2	)	{
			
			System.out.println(number);
			
		} //enhanced for
//		------------
		
		arr2[0] = 0.1;
		arr2[1] = .2;
		arr2[2] = 0.3;
		
		for(int i=0; i< arr2.length; i++) {
			
			System.out.println("arr2[" + i + "] : " + arr2[i]);
			
	} // for
		
//		-------------------------
		
		String[] arr3 = new String[3];
		
		for(int i=0; i< 3; i++) {
			
			System.out.println("arr3[" + i + "] : " + arr3[i]);
			
	} // for
		
//		arr3.length = 10; // 배열의 길이 속성 (읽기 전용이다) , 우리 마음대로 길이 조절 불가능하다
		
//		-----------------
		
		arr3[0] = "1월";
		arr3[1] = "2월";
		arr3[2] = "3월";
		
		for(int i=0; i< 3; i++) {
			
			System.out.println("arr3[" + i + "] : " + arr3[i]);
			
	} // for
		              
		
		
		
	} // main

} // end class
