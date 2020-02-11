package chap03;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		Queue<Message> queue = new LinkedList<Message>();
		queue.offer(new Message("sendMail", "홍길동"));
		queue.offer(new Message("sendSMS", "신용권"));
		queue.offer(new Message("sendKakaoTalk", "홍두께"));
		
		while(!queue.isEmpty()) {
			Message message = queue.poll();
			switch(message.command) {
			case "sendSMS":
				System.out.println(message.to + "님에게 메일을 보냅니다. ");
				break;
				
			case "sendMail":
				System.out.println(message.to + "님에게 메일을 보냅니다. ");
				break;
			
			case "sendKakaoTalk":
				System.out.println(message.to + "님에게 메일을 보냅니다. ");
				break;
			}
		}

	}

}
