package Thread.MultiThread.Inter_Thread_Communivation;

public class Customer {
	
	int amount = 10000;
	
	synchronized void withdraw(int amount) {
		System.out.println("going to withdraw.... WITHDRAW AMOUNT:"+amount); //1=>going to withdraw.... WITHDRAW AMOUNT:15000
		
		if(this.amount<amount) {
			System.err.println("LESS BALANCE... WAITING FOR DEPOSIT... AVL BALANCE:"+this.amount); //2=>LESS BALANCE... WAITING FOR DEPOSIT... AVL BALANCE:10000
			
			try {
				wait(); //it will wait until it get notify() notification
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.amount-=amount;
		System.out.println("Withdraw completed .... AVL BALANCE:"+this.amount); //5=>Withdraw completed .... AVL BALANCE:5000
	}
	
	
	synchronized void deposit(int amount) {
		System.out.println("going to deposit...AMOUNT:"+amount); //3=>going to deposit...AMOUNT:10000
		this.amount+=amount;
		System.out.println("deposit completed... BALANCE AMOUNT:"+this.amount); //4=>deposit completed... BALANCE AMOUNT:20000
		notify();
	}
	
	public static void main(String[] args) {
		
		final Customer customer=new Customer();
		
		new Thread() {
			public void run() {
			customer.withdraw(15000);	
			}
		}.start();
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		new Thread() {
			public void run() {
				customer.deposit(10000);
			}
		}.start();
	}

}
