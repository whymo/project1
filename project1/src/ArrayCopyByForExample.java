import java.util.Arrays;

//2022.03.07

public class ArrayCopyByForExample {
	
	public static void main(String[] args) {
		
		int[] oldIntArray = {1, 2, 3};
		int[] newIntArray =  new int[5]; 		// 5개의 자리
		
//		--
		
		
		for(int i=0; i < oldIntArray.length; i++) {
			
			newIntArray[i] = oldIntArray[i];
			
		} //classical for
		
		
//		----
		
		for(int i=0; i < newIntArray.length; i++ ) {
			
//			System.out.print(newIntArray[i] + ","); 	// 마지막 나머지 두개는 값을 안줘서 0으로 출력됨 
			// -> 끝 원소에도 , 이게 찍힘
			
			// print : 가로로 출력됨
			// println : 엔터키 친 형태로 세로로 출력됨
			
		} //classical for
		
		System.out.println(Arrays.toString(newIntArray)); // 이 기능을 이용하면 이쁘게 출력된다
		
	} // main
			

} // end class
