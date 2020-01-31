package chap01;

public class ThreadGroupExample {

	public static void main(String[] args) {
		ThreadGroup myGroup = new ThreadGroup("myGroup");
		WorkThread workThreadA = new WorkThread(myGroup, "workThreadA"); //mygroup에 두 스레드 그룹을 포함시킴
		WorkThread workThreadB = new WorkThread(myGroup, "workThreadB");
		
		workThreadA.start();
		workThreadB.start();
		
		System.out.println("[ main thread group의 list()메소드 출력 내용 ]");
		ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();
		mainGroup.list(); //현재 스레드 그룹의 이름, 최대 우선순위 / 현재 스레드 그룹에 포함되는 스레드, 하위 스레드 그룹의 내용 / [스레드 이름, 우선순위, 소속그룹명]
		System.out.println();
		
		try { Thread.sleep(3000);} catch(InterruptedException e) {}
		
		System.out.println("[myGroup thread group의 interrupted() 메소드 호출");
		myGroup.interrupt();
	}

}
