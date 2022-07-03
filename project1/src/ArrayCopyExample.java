import java.util.Arrays;

//2022.03.07


public class ArrayCopyExample {
	
	public static void main(String[] args) {
		
		String[] oldStrArray = { "java", "array", "copy" };
		String[] newStrArray = new String[5];
		
		// 배열의 복사 System.arraycopy(originArr, offset, targetArr, offset, length);
//		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length); // 매개변수
		
		
//	------------------
		
		// copy 복사 메소드 만들고 lvalue로 리턴해준다 
		newStrArray = Arrays.copyOf(oldStrArray, oldStrArray.length); //-> 크기가 딱 맞는 배열로 나옴
		
		// 더 큰 메소드로 나오는 배열이 있다!
		
		System.out.println(Arrays.toString(newStrArray)); // 배열을 찍을때는 꼭 이걸로!!
		
		
	} // main

} // end class