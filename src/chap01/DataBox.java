package chap01;

public class DataBox {
	
	private String data;

	public synchronized String getData() { //소비자 스레드 
		
		if(this.data == null) {
			try {
				wait();
			} catch(InterruptedException e) {}
		}
		
		String retrueValue = data;
		System.out.println("consummerThread가 읽은 데이터: " + retrueValue);
		
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
		System.out.println("Producer Thread가 생성한 데이터" + data);
		notify();
	}
	
	

}
