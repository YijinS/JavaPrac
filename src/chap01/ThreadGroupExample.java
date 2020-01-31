package chap01;

public class ThreadGroupExample {

	public static void main(String[] args) {
		ThreadGroup myGroup = new ThreadGroup("myGroup");
		WorkThread workThreadA = new WorkThread(myGroup, "workThreadA"); //mygroup�� �� ������ �׷��� ���Խ�Ŵ
		WorkThread workThreadB = new WorkThread(myGroup, "workThreadB");
		
		workThreadA.start();
		workThreadB.start();
		
		System.out.println("[ main thread group�� list()�޼ҵ� ��� ���� ]");
		ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();
		mainGroup.list(); //���� ������ �׷��� �̸�, �ִ� �켱���� / ���� ������ �׷쿡 ���ԵǴ� ������, ���� ������ �׷��� ���� / [������ �̸�, �켱����, �Ҽӱ׷��]
		System.out.println();
		
		try { Thread.sleep(3000);} catch(InterruptedException e) {}
		
		System.out.println("[myGroup thread group�� interrupted() �޼ҵ� ȣ��");
		myGroup.interrupt();
	}

}
