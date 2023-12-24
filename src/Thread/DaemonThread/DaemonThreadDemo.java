package Thread.DaemonThread;

public class DaemonThreadDemo implements Runnable {

	//the thread which runs in the background is called as Daemon thread
	//ex-Garbage Collector
	//daemon means low priority thread
	//when JVM reaches end of main method, it will terminate our program.
	//if JVM found Daemon thread running it will terminate that daemon thread and then it will shutdown the program.
	//JVM will not care about  Daemon thread.
	
	@Override
	public void run() {
		
		Thread currentThread = Thread.currentThread();
		
		if(currentThread.isDaemon())
		{
			System.out.println(currentThread.getName()+"     ::: Daemon Thread is executed....");
			
		}else {
			
			System.out.println( currentThread.getName()+"    ::: UserDefined Thread is executed");
		}
		
	}

	
	public static void main(String[] args) {
		
		DaemonThreadDemo daemonThreadDemo = new DaemonThreadDemo();
		
		Thread thread1 = new Thread(daemonThreadDemo);
		
		thread1.setDaemon(true);
		
		thread1.start(); 
		
		//without setting daemon thread //Thread-0    ::: UserDefined Thread is executed
	}
	
}
