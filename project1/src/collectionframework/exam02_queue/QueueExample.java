//2022.03.30

package collectionframework.exam02_queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
	
	// 대쵸적인 Message Q : IBM websphere MQ, ActiveMQ, RabbitMQ
	public static void main(String[] args) {
		
		// list : 순서를 보장 , 중복 허용 
		Queue<Message> mq = new LinkedList<Message>(); // => 추가삭제를 빈번히 할때는 : LinkedList
		
		mq.offer(new Message("sendMail", "홍길동"));
		mq.offer(new Message("sendSMS", "신용권"));
		mq.offer(new Message("sendKakaotalk", "홍두께"));
		
		System.out.println(mq);
		
//		-----------------------
		
		while(!mq.isEmpty()) {
			Message message = mq.poll();
			
//			switch(message.command) {
//				case "sendMail":
//					System.out.println(message.to + "님에게 메일을 보냅니다.");
//					
//					break;
//				case "sendSMS":
//					System.out.println(message.to + "님에게 SMS를 보냅니다.");
//					
//					break;
//				case "sendKakaotalk": 
//					System.out.println(message.to + "님에게 카카오톡를 보냅니다.");
//					
//					break;
//					
//			} //switch
	
//	==========================================================
			
//			switch(message.command) {
//			case "sendMail" -> System.out.println(message.to + "님에게 메일을 보냅니다.");
//			case "sendSMS" -> System.out.println(message.to + "님에게 SMS를 보냅니다.");
//			case "sendKakaotalk" -> System.out.println(message.to + "님에게 카카오톡를 보냅니다.");
//			
//			} //switch  Expression
			
//	=========================================================================
			
//			# switchExpression 새로운 구문으로 대체!
			String command = switch(message.command) {
			
//			case "sendMail", "sendSMS" -> { yield message.command;}
			case "sendMail", "sendSMS" -> message.command;
			
			default 				   -> { yield message.command;}
			
			}; //switchExpression
			
			System.out.println(command);

		} // while
		
	} // main
	
} // end class
