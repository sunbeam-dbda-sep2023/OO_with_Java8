// public Thread(Runnable target, String name)
// implements Runnable interface 


class EvenNumbers implements Runnable
{
	public void run() 
	{
		for(int i=0;i<10;i+=2)
		{
			try 
			{
				Thread.sleep(2000);
			} 
			catch (InterruptedException e) 
			{
				System.out.println(e);
			}
			System.out.println("Even : "+i);
		}
	}
	
}


class OddNumbers implements Runnable
{
	public void run() 
	{
		for(int i=1;i<10;i+=2)
		{
			try 
			{
				Thread.sleep(2000);
			} 
			catch (InterruptedException e) 
			{
				System.out.println(e);
			}
			System.out.println("odd : "+i);
		}
	}
	
}

/*
public class Day15_6 {

	public static void main(String[] args) throws InterruptedException 
	{
		EvenNumbers e1 = new EvenNumbers(); // e1 Runnable objects 
		OddNumbers o1 = new OddNumbers(); // o1  runnable object
		Thread th1 = new Thread(e1);
		th1.start();
		
		Thread th2=new Thread(o1);
		th2.start();
		

	}

}

*/

/*
public class Day15_6 {

	public static void main(String[] args) throws InterruptedException 
	{
		EvenNumbers e1 = new EvenNumbers(); // e1 Runnable objects 
		OddNumbers o1 = new OddNumbers(); // o1  runnable object
		
		Thread th1 = new Thread(e1,"EVEN THREAD");
		System.out.println("Name of first thread "+th1.getName());
		th1.start();
		
		
		Thread th2=new Thread(o1,"ODD THREAD");
		System.out.println("Name of second thread "+th2.getName());
		th2.start();
		

	}

}
*/

