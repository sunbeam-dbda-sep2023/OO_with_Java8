package p1;

public class Utils 
{
	public static void delay(int milli)
	{
		try 
		{
			Thread.sleep(milli);
		} 
		catch (InterruptedException e) 
		{
			System.out.println(e);
		}
	}
}
