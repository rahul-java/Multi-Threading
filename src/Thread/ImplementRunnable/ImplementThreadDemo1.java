package Thread.ImplementRunnable;

public class ImplementThreadDemo1 implements Runnable {

	//jdk1.0 version
	
	@Override
	public void run() {

		Thread currentThread = Thread.currentThread();
		System.out.println(currentThread.getName()+" ::: run() is being called...."+currentThread.getPriority());
		try {
			Thread.sleep(5000);  //block state
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(currentThread.getName()+" ::: run() is being called...."+currentThread.getPriority());
	}
	
	public static void main(String[] args) {
		
		ImplementThreadDemo1 implementThreadDemo = new ImplementThreadDemo1();
		Thread thread = new Thread(implementThreadDemo);
		thread.start(); //Thread-0 ::: run() is being called....5
		thread.run();  //main ::: run() is being called....5 //it will call run() as a normal method.
		
		
		/*
		 * main ::: run() is being called....5
           Thread-0 ::: run() is being called....5
           main ::: run() is being called....5
           Thread-0 ::: run() is being called....5
		 * */
		 
	}  

}
