package chap02;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class NoResultExample {

	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
		//Runtime.getRuntime().availableProcessors(): JVM에서 이용가능한 코어 개수를 리턴. 물리적 코어 한개당 스레드 2개를 할당(물리적코어 4개 논리적 코어 8개)
		
		System.out.println("[작업 처리 요청]");
		
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				int sum = 0;
				for(int i=1; i<=10; i++) {sum += i;}
				System.out.println("[처리 결과]"+sum);
				
			}
		};
		
		Future future = executorService.submit(runnable);
		
		try {
			future.get();
			System.out.println("[작업 처리 완료]");
		} catch (Exception e) {
			System.out.println("[실행 예외 발생함]" + e.getMessage());
		}
		executorService.shutdown();
		
	}

}
