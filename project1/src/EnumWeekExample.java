import java.util.Calendar;

public class EnumWeekExample {
	
	public static void main(String[] args) {
		
		// 오늘 값 열거상수 -> 일요일에는 축구하자 , 아니면 자바공부하자
		// 오늘이 무슨 요일인지 날짜를 구해야한다
		
//		-----
		
		Week today = null;
		
		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK);		// 정수값으로 리턴 반환
		
//		----
		
		switch (week) {
			case 1 : today = Week.SUNDAY; break;
			case 2 : today = Week.MONDAY; break;
			case 3 : today = Week.THURSDAY; break;
			case 4 : today = Week.WEDNESDAY; break;
			case 5 : today = Week.SUNDAY; break;
			case 6 : today = Week.FRAIDAY; break;
			case 7 : today = Week.STAURDAY; break;
			
		} // SWITCH --> week 변수에다가  null 초기화한다음에 날짜 지정해주고 브레이크로 빠져나온다
		
		System.out.println("오늘 요일: " + today);
		
		//변수 안 열거상수와 열거상수가 같냐를 물어봄
		
		if(today == Week.SUNDAY) {		// *** 요일에 따라 다른 로직을 수행할 때 쓴다!! (열거상수 비교연산자 쓰면 된다!)
			
			System.out.println("일요일에는 축구를 합니다.");
			
		} else {
			
			System.out.println("열심히 자바 공부를 합니다.");
			
		} // if-else
		
		
	} // main

}  // end class
