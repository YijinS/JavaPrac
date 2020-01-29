package chap01;

public class ThreadA2 extends Thread{
	
	private WorkObject work;

	public WorkObject getWork() {
		return work;
	}

	public ThreadA2(WorkObject work) {
		this.work = work;
	}
	
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			work.methodA();
		}
	}
}
