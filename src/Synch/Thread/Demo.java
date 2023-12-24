package Synch.Thread;

public class Demo implements Runnable {

	
	public synchronized void printTable() {
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(Thread.currentThread().getName()+" ::: "+i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	@Override
	public void run() {
		
		printTable();
		
	}
	
	public static void main(String[] args) {
		
		Demo demo = new Demo();
		
		Thread thread1 = new Thread(demo);
		Thread thread2 = new Thread(demo);
		
		thread1.start();
		thread2.start();
	}

}
