package chap01;

public class WaitNotifyExample {

	public static void main(String[] args) {
		WorkObject shareObject = new WorkObject();
		
		ThreadA2 threadA2 = new ThreadA2(shareObject);
		ThreadB2 threadB2 = new ThreadB2(shareObject);
		
		
		threadA2.start();
		threadB2.start();
	}

}
