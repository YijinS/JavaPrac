package chap01;

public class User2 extends Thread{
	
	private Calculator calc;

	public Calculator getCalc() {
		return calc;
	}

	public void setCalc(Calculator calc) {
		this.setName("User2");
		this.calc = calc;
		
	}
	
	@Override
	public void run() {
		calc.setMemory(50);
	}

}
