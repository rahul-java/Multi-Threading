package Thread.AnonymousImpl;

public class MultiThreadDemo extends Thread {
	
	@Override
	public void run() {

		System.out.println("This is thread logic...");
	}
	
	public static void main(String[] args) {
		
		MultiThreadDemo multiThreadDemo = new MultiThreadDemo();
		Thread thread = new Thread(multiThreadDemo);
		thread.start(); //This is thread logic...
	}
}
