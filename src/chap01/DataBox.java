package chap01;

public class DataBox {
	
	private String data;

	public synchronized String getData() { //�Һ��� ������ 
		
		if(this.data == null) {
			try {
				wait();
			} catch(InterruptedException e) {}
		}
		
		String retrueValue = data;
		System.out.println("consummerThread�� ���� ������: " + retrueValue);
		
		data = null;
		notify();
		
		return retrueValue;
	}

	public synchronized void setData(String data) {
		if(this.data != null) {
			try {
				wait();
			}catch(InterruptedException e) {}
		}
		this.data = data;
		System.out.println("Producer Thread�� ������ ������" + data);
		notify();
	}
	
	

}
