package chap01;

public class DaemonExample {

	public static void main(String[] args) {
		AutoSaveThread autoSave = new AutoSaveThread();
		autoSave.setDaemon(true);
		autoSave.start();
		
		
		try {
		Thread.sleep(3000);
		}catch(InterruptedException e){}
		
		System.out.println("Main Thread End");

	}

}
