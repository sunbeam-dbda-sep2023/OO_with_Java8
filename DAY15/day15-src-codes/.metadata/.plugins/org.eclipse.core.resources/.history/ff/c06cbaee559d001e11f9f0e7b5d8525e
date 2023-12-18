// thread creation by extending Thread class

class Demo extends Thread
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

public class Day15_2 {

	public static void main(String[] args) 
	{
		Demo dobj = new Demo(); // dobj is threaded object
		dobj.start();
	}

}
