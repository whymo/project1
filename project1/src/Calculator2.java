// 2022.03.10

// 가로 세로만 주면 이 기능은 수행된다.  매개변수 인자값 만으로 제대로 수행하는 메소드 경우도 정적 메소드로 만드는게 맞다
// 외부의 도움이 전혀 필요가 없기 때문에!

public class Calculator2 {
	
	String color;
	double price = 19.3; //usd 기준 == > 전자계산기가 모두 19.3달러다? 그래서 static으로 하면 안됨!
	
	// 1. 정사각형의 넓이
	static double areaRectangle(double width) {
		
		Math.random(); // 호출만함 -> static 정적 메소드, 왜? 다른 인스턴스 필드 도움이 필요 없기 때문에!
		
		return width * width;
		
	} //areaReactangle
	
	// 2. 직사각형의 넓이
	static double areaRectangle(double width, double height) {		// 개수가 다름 => 오버로딩 규칙 지킴
		
		return width * height;
		
	} //areaReactangle
	
	
	
	// 3. 덧셈구하기 = > 이클래스에 선언된 메소드나 아무것도 도움 받을 필요 없기 때문에 static으로 선언! (정적 메소드)
	
	static int add(int number1, int number2) {		// 전달인자만 잘 주면 이상 없기 때문에 static으로 하는게 낫다
		
		return number1 + number2;
				
	} // add

} // end class
