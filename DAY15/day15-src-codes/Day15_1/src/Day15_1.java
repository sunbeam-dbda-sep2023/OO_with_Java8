// thread creation by extending Thread class

class Demo extends Thread
{
	public void run()
	{
		System.out.println("inside run method of demo class");
	}
}

public class Day15_1 {

	public static void main(String[] args) 
	{
		Demo dobj = new Demo(); // dobj is threaded object
		dobj.start();
		Demo d1 = new Demo();
		d1.start();
	}

}
