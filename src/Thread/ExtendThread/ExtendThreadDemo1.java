package Thread.ExtendThread;

public class ExtendThreadDemo1 extends Thread {


	
	public void m1()
	{
		Thread currentThread = Thread.currentThread();
		String threadName = currentThread.getName();
		System.out.println(threadName+"   ::: i am from m1() method........");
	}
	
	public static void main(String[] args) {
		
		Thread currentThread = Thread.currentThread();
		String threadName = currentThread.getName();
		System.out.println(threadName+" ::: main-thread started...");
		
		ExtendThreadDemo1 extendThreadDemo1 = new ExtendThreadDemo1();
		extendThreadDemo1.m1();
		
		System.out.println(threadName+" ::: main-thread completed...");
		
		/**
		 * main ::: main-thread started...
		 * main   ::: i am from m1() method........
		 * main ::: main-thread completed...
		 */
				
	}
}
