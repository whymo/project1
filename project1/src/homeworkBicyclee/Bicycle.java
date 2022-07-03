package homeworkBicyclee;

import lombok.Getter;
import lombok.Setter;

// 자전거 부품 설계도

public class Bicycle { 				// 클래스로 만들어야함
	
//	1. 고유속성 
	
		String modelName;			// 자전거 모델명
		String company;				// 자전거 회사명
		String weight;				// 자전거 무게

//	2. 상태필드 => 필드초기화 해줘야함!

		public Bicycle( String modelName, String company, String weight) {
			this.modelName = modelName;
			this.company = company;
			this.weight = weight;

		} //constructor
		
		
//	3. 메소드 기능
		
		// 페달을 밟아 휠이 움직이게 한다! => 앞으로 감
		// 핸들을 좌회전으로 돌리고 휠과 타이어도 좌회전으로 돌아가게 한다! => 좌회전 방향 전환
		// 페달을 밟아 직진하다가 타이어가 펑크난다 타이어를 교체한다 => 타이어 교체
		
		
//		boolean deposit(int money) {		 //페달 움직이기 
//			
//			balance = balance + money;
//			
//			return (balance >= 0) ? true : false;
//			
//		}//deposit
//		
//		boolean withdraw(int money) {		// 출금
//			
//			balance -= money;
//			
//			return (balance - money) >= 0;
//		
//		}//withdraw
//		
//		boolean isValid() {
//			
//			return false;
//		} //isValid
//		
//		// 자바 빈즈 클래스? 게터세터 	
//	
//	

} // end interface
