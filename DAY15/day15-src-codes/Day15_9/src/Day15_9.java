// join example
//Waits for this thread to die.

public class Day15_9 extends Thread
{
	
	public void run()
	{
		for(int i=10;i<15;i++)
		{
			System.out.println(this.getName()+":"+i+"\t");
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
	public static void main(String[] args) 
	{
		Day15_9 t1 = new Day15_9();
		Day15_9 t2 = new Day15_9();
		Day15_9 t3 = new Day15_9();
		
		t1.start();
		
		try 
		{
			t1.join();
		} 
		catch (InterruptedException e) 
		{
			System.out.println(e);
		}
		t2.start();
		t3.start();

	}

}