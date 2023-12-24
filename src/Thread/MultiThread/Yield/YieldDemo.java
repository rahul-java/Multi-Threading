package Thread.MultiThread.Yield;

public class YieldDemo {
	
	public static void main(String[] args) throws InterruptedException {
		
		Thread thread1=new Thread() {
			
			public void run() {
			
				for(int i=1;i<=5;i++)
				{
					System.out.println(Thread.currentThread().getName()+"   ::: Producer : produced item :"+i);
					Thread.yield(); //opposite to join(), it give chance to other thread to be executed if same priority
				}
			}
		};
		
		thread1.setName("My_Thread-1");
		
		
/////////////////////////////////////////////////////////////////////////////////////////////////////////		
		
        Thread thread2=new Thread() {
			
			public void run() {
			
				for(int i=1;i<=5;i++)
				{
					System.out.println(Thread.currentThread().getName()+"   ::: Consumer : consumed Item :"+i);
					Thread.yield(); //opposite to join(), it give chance to other thread to be executed if same priority
				}
			}
		};
		
		thread2.setName("My_Thread-2");
		
		
		thread1.start();
		
		thread2.start();
	}

}
