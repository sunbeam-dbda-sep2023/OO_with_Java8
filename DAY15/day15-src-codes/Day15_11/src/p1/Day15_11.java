package p1;

public class Day15_11 {

	public static void main(String[] args) 
	{
		Account acc = new Account(123,"Saving",45000.0);
		final double amount = 1000.0;
		
		System.out.println("Initial Balance = "+acc.getBalance());
		
		// Thread(Runnable target)
		// Runnable is functional interface
		// reference of Runnable interface is holding lambda 
		Thread dt = new Thread(() -> {
			
			for(int i=1;i<=5;i++)
			{
				acc.deposit(amount);
				System.out.println("After Deposit = "+acc.getBalance());
				Utils.delay(1000);
			}
			
		});
		dt.start();
		
		Thread wt = new Thread(()->{
			for(int i=1;i<=3;i++)
			{
				acc.withdraw(amount);
				System.out.println("After Withdraw = "+acc.getBalance());
				Utils.delay(1000);
			}
			
		});
		wt.start();
		
		/*
		try {
			dt.join();
			wt.join();
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		
		*/
		System.out.println("Final Balance = "+acc.getBalance());
		

		

	}

}
