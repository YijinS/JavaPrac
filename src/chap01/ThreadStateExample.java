package chap01;

public class ThreadStateExample {

	public static void main(String[] args) {
		StatePrintThread state = new StatePrintThread(new TargetThread());
		state.start();

	}

}
