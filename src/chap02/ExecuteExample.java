package chap02;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ExecuteExample {

	public static void main(String[] args) throws InterruptedException {
		ExecutorService executorService = Executors.newFixedThreadPool(2); //�ִ� ������ ������ 2�� ������Ǯ ����
		 for(int i=0; i<10; i++) {
			 Runnable runnable = new Runnable() {
				
				@Override
				public void run() {
					//������ �� ���� �� �۾� ������ �̸� ���
					ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) executorService;
					int poolSize = threadPoolExecutor.getPoolSize();
					String threadName = Thread.currentThread().getName();
					System.out.println("[�� ������ ����:" + poolSize + "] �۾� ������ �̸�: " + threadName);
					//���� �߻�
					int value = Integer.parseInt("��");
					
				}
			};
			
			//executorService.execute(runnable); //�۾�ó�� ��û
			executorService.submit(runnable);
			
			Thread.sleep(10);
		 }
		 
		 	executorService.shutdown(); //������Ǯ ����

	}

}
