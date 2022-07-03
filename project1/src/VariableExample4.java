
public class VariableExample4 {
	
	public static void main(String[] args) {
		
		int v1 = 15;
		
		if(v1>10) {
			int v2;
			
			//여기서 v2 초기화
			v2 = v1 - 10;
		} // if
		
		//int v3 = v1 + v2 + 5; // v2 변수를 사용할 수 없기 때문에 컴파일 에러가 생김
		// 왜 v2가 오류가 날까? if에서 탄생해서 if에서 죽음 if블록이 끝나서 파괴됐기때문에
		// method 블록에서 선언된 v1과 5(하드코딩) 말고 v2는 if 블록이 끝나고 파괴되어서 
		//존재하기 않아서 컴파일 오류!
		// 빨간색 줄같은거 몰라도 봐라
	
	} // main

} // end class
