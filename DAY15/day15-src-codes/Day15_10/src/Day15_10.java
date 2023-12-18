// suspend() 
//current thread is suspend until resume() is called
/*
public class Day15_10 extends Thread
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
		Day15_10 t1 = new Day15_10();
		Day15_10 t2 = new Day15_10();
		Day15_10 t3 = new Day15_10();
		
		t1.start();
		t2.start();
		t1.suspend();
		t3.start();
		t1.resume();
		
		//t2.start();
		//t3.start();

	}

}
*/

// wait() and notify()
//wait()
//Causes the current thread to wait until another thread invokes the notify() 

// notify()
//Wakes up a single thread that is waiting on this object's monitor.

public class Day15_10 extends Thread
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
	public static void main(String[] args) throws InterruptedException 
	{
		Day15_10 t1 = new Day15_10();
		Day15_10 t2 = new Day15_10();
		Day15_10 t3 = new Day15_10();
		
		t1.start();
		t2.start();
		t1.wait();
		t3.start();
		t1.notify();
	}

}
