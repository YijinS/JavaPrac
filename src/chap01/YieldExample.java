package chap01;

public class YieldExample {

	public static void main(String[] args) {
		ThreadAA threadA = new ThreadAA();
		ThreadBB threadB = new ThreadBB();
		
		threadA.start();
		threadB.start();
		
		try { Thread.sleep(3000); } catch(InterruptedException e) {}
		threadA.work = false; //threadB�� ����
		
		try { Thread.sleep(3000); } catch(InterruptedException e) {}
		threadA.work = true; //A, B ��� ����
		
		try { Thread.sleep(3000); } catch(InterruptedException e) {}
		threadA.stop = true;
		threadB.stop = true;
	}

}
