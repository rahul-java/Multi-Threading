package Thread.ImplementRunnable;

public class ImplementThreadDemo2 implements Runnable {

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
		
		ImplementThreadDemo2 implementThreadDemo = new ImplementThreadDemo2();
		Thread thread1 = new Thread(implementThreadDemo);
		//thread1.setName("Thread==>>01");
		//thread1.setPriority(Thread.MAX_PRIORITY);//10
		//thread1.setPriority(Thread.MIN_PRIORITY);//1
		//thread1.setPriority(Thread.NORM_PRIORITY);//5
		
		Thread thread2 = new Thread(implementThreadDemo);
		//thread2.setPriority(7);
		Thread thread3 = new Thread(implementThreadDemo);
		//thread3.setPriority(10);
		
		thread1.start();  //runnable state
		thread2.start();  //runnable state
		thread3.start();  //runnable state
		
		
		/*
		 * Thread-0 ::: run() is being called....Started5
           Thread-2 ::: run() is being called....Started5
           Thread-1 ::: run() is being called....Started5
           Thread-0 ::: run() is being called....Ended5
           Thread-1 ::: run() is being called....Ended5
           Thread-2 ::: run() is being called....Ended5
		 * */
		 
	}  

}
