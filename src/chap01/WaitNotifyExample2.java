package chap01;

public class WaitNotifyExample2 {

	public static void main(String[] args) {
		DataBox dataBox = new DataBox();
		
		ProducerThread producer = new ProducerThread(dataBox);
		ConsumerThread consumer = new ConsumerThread(dataBox);
		
		producer.start();
		consumer.start();

	}

}
