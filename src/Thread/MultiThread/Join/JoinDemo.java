package Thread.MultiThread.Join;

public class JoinDemo {
	
	public static void main(String[] args) throws InterruptedException {
		
		Thread thread1=new Thread() {
			
			public void run() {
			
				for(int i=1;i<=5;i++)
				{
					System.out.println(Thread.currentThread().getName()+"   ::: "+i);
					try {
						Thread.yield();
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		};
		
		thread1.setName("My_Thread-1");
		//thread1.start();
		
/////////////////////////////////////////////////////////////////////////////////////////////////////////		
		
        Thread thread2=new Thread() {
			
			public void run() {
			
				for(int i=1;i<=5;i++)
				{
					System.out.println(Thread.currentThread().getName()+"   ::: "+i);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		};
		
		thread2.setName("My_Thread-2");
		
		
		thread1.start();
		
		thread1.join();// means first thread 1 will complete its task then thread 2 will start
		
		thread2.start();
	}

}
