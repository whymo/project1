
public class SignOperatorExample5 {
	public static void main(String[] args) {
		
		// %(나머지) 연산자
	
	int number = 8;
	
	// 1. 이때, 8이 2의 배수인지 아닌지 판단하는 로직을 
	//나머지 연산자로 어떻게 구현?	
	
// == : 동등비교 연산자
	
	// 짝수라면 나머지가 2여야 한다
	
//	int result = number%2;	//--> /(나눗셈이 아닌) %나머지가 궁금
//	System.out.println(result);
	
//	// 2. 이때, 8이 3의 배수인지 아닌지 판단하는 로직?
//	int result = number%3; // 나머지가 3일때 0이면 3의배수
//	System.out.println(result);
			
	// 3. 이때, 8이 홀수인지 아닌지 판단하는 로직?
		int result = number%2; //2로 나눴을때 나머지가 1이 남으면 홀수이다
		// 0 ~ (n-1)
		
		System.out.println(result);
		
	}
	


} // end class
