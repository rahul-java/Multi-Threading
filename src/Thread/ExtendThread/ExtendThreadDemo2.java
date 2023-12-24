package Thread.ExtendThread;

public class ExtendThreadDemo2 extends Thread {

	@Override
	public void run() {
		
		Thread currentThread = Thread.currentThread();
		String threadName = currentThread.getName();
		
		System.out.println(threadName+"  ::: mythread - started");
		System.out.println(threadName+"   ::: i am from run() method...");
		m1();
		System.out.println(threadName+"   ::: mythread - ended");
	}
	
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
		
		ExtendThreadDemo2 extendThreadDemo2 = new ExtendThreadDemo2();
		Thread mythread = new Thread(extendThreadDemo2);  //making our class obj association with thread.
		mythread.start();
		
		System.out.println(threadName+" ::: main-thread completed...");
		
		/**
		 * main ::: main-thread started...
		 * main ::: main-thread completed...
		 * Thread-1  ::: mythread - started
		 * Thread-1   ::: i am from run() method...
		 * Thread-1   ::: i am from m1() method........
		 * Thread-1   ::: mythread - ended
		 */
				
	}
}
