package Thread.ImplementRunnable;

public class ImplementThreadDemo3 implements Runnable {

	@Override
	public void run() {

		Thread currentThread = Thread.currentThread();
		System.out.println(currentThread.getName()+" ::: run() is being called....Started ::: "+currentThread.getPriority());
		try {
			Thread.sleep(5000);  //block state
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(currentThread.getName()+" ::: run() is being called....Ended ::: "+currentThread.getPriority());
	}
	
	public static void main(String[] args) {
		
		ImplementThreadDemo3 implementThreadDemo = new ImplementThreadDemo3();
		Thread thread1 = new Thread(implementThreadDemo);
		thread1.start();
		//thread1.start();  //Exception in thread "main" java.lang.IllegalThreadStateException  //one thread start only one time
		  //we should not start one thread multiple times.
		
		
	}  

}
