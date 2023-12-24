package Thread.DeadLock;

public class DeadLockDemo {

	public static void main(String[] args) {
		
		String s1="hi";
		String s2="hello";
		
		Thread thread1 = new Thread() {
			@Override
			public void run() {

				synchronized (s1) {
					
					System.out.println("Thread-1 locked resource-1   ::: "+s1);
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
					synchronized (s2) {
					
						System.out.println("Thread-1 waiting for resource-2   ::: "+s2);
					}
					
				}
			}
		};
		
		Thread thread2 = new Thread() {
			@Override
			public void run() {

				synchronized (s2) {
					
					System.out.println("Thread-2 locked resource-2  ::: "+s2);
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
					synchronized (s1) {
					
						System.out.println("Thread-2 waiting for resource-1   ::: "+s1);
					}
					
				}
			}
		};
		
		thread1.start();
		thread2.start();
	}
}
