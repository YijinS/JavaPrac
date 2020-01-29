package chap01;

public class ThreadB2 extends Thread{
	
	private WorkObject work;

	public ThreadB2(WorkObject work) {
		this.work = work;
	}
	
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			work.methodB();
		}
	}

}
