package Thread.ImplementCallable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ImplementThreadDemo1 implements Callable<Object>{

	//java jdk1.5 version
	//using Executors Service we can implement Multi-Threading
	//we can create thread pool
	//submit tasks to pools of thread
	//re-usability of threads
	
	@Override
	public Object call() throws Exception {
		
		Thread currentThread = Thread.currentThread();
		System.out.println(currentThread.getName()+"  :::  call()  ----method executed------");
		return "call() execution completed...";
	}
	
	public static void main(String[] args) throws Exception {
		
		ImplementThreadDemo1 implementThreadDemo1 = new ImplementThreadDemo1();
		
		ExecutorService executorService = Executors.newFixedThreadPool(10);
		
		for(int i=1;i<=15;i++) {
		
			Future future = executorService.submit(implementThreadDemo1);
			System.out.println(future.get().toString());
		}
		executorService.shutdown();
	}
	
	
	/*
	 *
pool-1-thread-1  :::  call()  ----method executed------
call() execution completed...
pool-1-thread-2  :::  call()  ----method executed------
call() execution completed...
pool-1-thread-3  :::  call()  ----method executed------
call() execution completed...
pool-1-thread-4  :::  call()  ----method executed------
call() execution completed...
pool-1-thread-5  :::  call()  ----method executed------
call() execution completed...
pool-1-thread-6  :::  call()  ----method executed------
call() execution completed...
pool-1-thread-7  :::  call()  ----method executed------
call() execution completed...
pool-1-thread-8  :::  call()  ----method executed------
call() execution completed...
pool-1-thread-9  :::  call()  ----method executed------
call() execution completed...
pool-1-thread-10  :::  call()  ----method executed------
call() execution completed...
pool-1-thread-1  :::  call()  ----method executed------
call() execution completed...
pool-1-thread-2  :::  call()  ----method executed------
call() execution completed...
pool-1-thread-3  :::  call()  ----method executed------
call() execution completed...
pool-1-thread-4  :::  call()  ----method executed------
call() execution completed...
pool-1-thread-5  :::  call()  ----method executed------
call() execution completed...

	 * */

	
}
