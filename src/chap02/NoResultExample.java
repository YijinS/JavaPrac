package chap02;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class NoResultExample {

	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
		//Runtime.getRuntime().availableProcessors(): JVM���� �̿밡���� �ھ� ������ ����. ������ �ھ� �Ѱ��� ������ 2���� �Ҵ�(�������ھ� 4�� ���� �ھ� 8��)
		
		System.out.println("[�۾� ó�� ��û]");
		
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				int sum = 0;
				for(int i=1; i<=10; i++) {sum += i;}
				System.out.println("[ó�� ���]"+sum);
				
			}
		};
		
		Future future = executorService.submit(runnable);
		
		try {
			future.get();
			System.out.println("[�۾� ó�� �Ϸ�]");
		} catch (Exception e) {
			System.out.println("[���� ���� �߻���]" + e.getMessage());
		}
		executorService.shutdown();
		
	}

}
