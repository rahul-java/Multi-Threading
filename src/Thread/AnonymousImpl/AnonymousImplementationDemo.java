package Thread.AnonymousImpl;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AnonymousImplementationDemo {
	
	public static void main(String[] args) {
		
		//Working with Threads using Anonymous implementation
		
		Thread thread1=new Thread() {
			public void run() {
				System.out.println("this is run() method logic of Thread Class=====>1");
			}
			
		};
		thread1.start();
		
		///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		Runnable runnable=new Runnable() {
			
			@Override
			public void run() {
				System.out.println("this is run() method logic of Runnable Interface=====>2");
				
			}
		};
		//runnable.run();
		Thread thread2 = new Thread(runnable);
		thread2.start();
		
		/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		Callable<Object> callable=new Callable<Object>() {
			@Override
			public Object call() throws Exception {

				System.out.println("this is call() method logic of Callable Interface=====>3");
				return null;
			}
		};
		
		ExecutorService executorService = Executors.newFixedThreadPool(1);
		executorService.submit(callable);
		executorService.shutdown();
		
	}
}
