// thread creation by implementing Runnable interface

class Demo implements Runnable
{
	public void run()
	{
		try {
	
			for(int i=0;i<5;i++)
			{
				System.out.print(i+"\t");
				Thread.sleep(5000);
			}
		}
		catch(Exception e)
		{
			
		}
			
	}
}

public class Day15_5 {

	public static void main(String[] args) 
	{
		Demo dobj = new Demo(); // dobj is runnable object
		// represent runnable object ==> Thread object first
		// then we can call start method
		
		Thread th = new Thread(dobj); // th is thread object
		//start() can be called upon thread object 
		th.start();
	}

}
