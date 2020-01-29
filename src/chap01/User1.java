package chap01;

public class User1 extends Thread{
	
	private Calculator calc;

	public Calculator getCalc() {
		return calc;
	}

	public void setCalc(Calculator calc) {
		this.setName("User1");
		this.calc = calc;
		
	}
	
	@Override
	public void run() {
		calc.setMemory(100);
	}
	
	

}
