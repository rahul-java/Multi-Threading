package MainThread;

public class MainThreadDemo {
	
	public static void main(String[] args) {
		
		System.out.println("================Welcome to Multi-Threading=========================");
		
		Thread currentThread = Thread.currentThread();
		String threadName = currentThread.getName();
		System.out.println(threadName);  //main
		System.out.println("Thread  ::: "+currentThread);//Thread  ::: Thread[main,5,main]//main->threadName,5->priority of thread,main->thread group
		System.out.println(currentThread.getName());//main
		System.out.println(currentThread.getPriority());//5
		System.out.println(currentThread.getThreadGroup());//java.lang.ThreadGroup[name=main,maxpri=10]
		
		Thread thread = new Thread();
		String name = thread.getName();
		System.out.println(name);//Thread-0
	}

}
