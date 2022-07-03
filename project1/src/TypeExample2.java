
public class TypeExample2 {
	
	public static void main(String[] args) {
		
		//byte 타입의 표현범위 : -128 ~ +127까지
		//순수한 값의 리터럴은 형변환하지 않는다
		byte Var1 = -128;
		byte Var2 = -30;
		byte Var3= 0;
		byte Var4 = 30;
		byte Var5 = 127;
		
		//byte Var6 = 128; //컴파일 에러 , 자바는 정수는 기본 int로 인식한다
		//Lvalue(byte(1)) = Rvalue(int(4)) Lvalue가 더 작아서 오류가 난다
		
		int Var6 = 128; // 정수는 int로 하면 컴파일 오류가 덜난다 
		
		System.out.println(Var1);
		System.out.println(Var2);
		System.out.println(Var3);
		System.out.println(Var4);
		System.out.println(Var5);
	} //main

} //end class
