
public class SignOperatorExample2 {
	
	public static void main(String[] args) {
		
		int x = 10;
		int y = 10;
		int z;
		
		System.out.println("------------------------------");
		
		// 증감 연산자가 단독으로만 사용되는 경우에는,
		// 전위/후위의 의미가 없다!!
		x++; // 후위 증가 연산자
		++x; // 전위 증가 연산자
		
//		x = x + 1; => x++ or ++x
				
		System.out.println("1. x=" + x);
		
		System.out.println("------------------------------");
		
		y--; // 후위 감소 연산자
		--y; // 전위 감소 연산자
		
//		y = y - 1; => --y or y--
		
		System.out.println("2. y=" + y);
		
		System.out.println("------------------------------");
		
		System.out.println("3. x=" + x);
		
		z = x++; // *** 후위 증가연산자 사용!
		// 13이 될 것 같은데 12이다. 왜? x란 변수의 값을 먼저 연산식에 사용하고
		// 피 연산자로써 자기 자신을 먼저 주고 z = 12, 이 연산식이 모든 끝난 후에
		// 자기 자신의 값을 1 증가시키는게 후위 증가연산자이다!
		// ㄱ 이 아래 식이랑 같은 경우
		// z = x;
		// x = x + 1
		
		
		System.out.println("4. z=" + z);
		System.out.println("5. x=" + x);
		
		
		System.out.println("------------------------------");
		
		z = ++x; // *** 전위 증가 연산자 
		
		//먼저 자신을 1 증가시킴 x(13) = x(13) + 1
		// 증가된 자신을 z에 대입 z = x;
		
		System.out.println("6. z=" + z);
		System.out.println("7. x=" + x);
		System.out.println("8. y=" + y);
		
		System.out.println("------------------------------");
		
		z = ++x + y++;
		
		// x(15) = x(14) + 1  --> 전위 연산자
		// x = 15의 값 y = 8의 값이 z에 참여가 되었다.
		// z(23) = x(15) + y(8) 
		// y = y  +  1 ---> 후위 연산자 , 연산식이 끝난 후에 증가시킨다!
		
		// 실무에서는 코드는 가독성을 위해 이렇게 풀어서 코드해라!
//		x = x + 1;
//		z = x + y;
//		y = y + 1;
		
		System.out.println("9. z=" + z);
		System.out.println("10. x=" + x);
		System.out.println("12. y=" + y);
		
	} //main


} // end class
