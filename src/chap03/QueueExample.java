package chap03;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		Queue<Message> queue = new LinkedList<Message>();
		queue.offer(new Message("sendMail", "ȫ�浿"));
		queue.offer(new Message("sendSMS", "�ſ��"));
		queue.offer(new Message("sendKakaoTalk", "ȫ�β�"));
		
		while(!queue.isEmpty()) {
			Message message = queue.poll();
			switch(message.command) {
			case "sendSMS":
				System.out.println(message.to + "�Կ��� ������ �����ϴ�. ");
				break;
				
			case "sendMail":
				System.out.println(message.to + "�Կ��� ������ �����ϴ�. ");
				break;
			
			case "sendKakaoTalk":
				System.out.println(message.to + "�Կ��� ������ �����ϴ�. ");
				break;
			}
		}

	}

}
