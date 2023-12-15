// Default methods 

interface Test
{
	void add(); // method declaration
	// public static
	
	default void m1()
	{
		System.out.println("Inside interface method m1");
	}
}

class Demo implements Test
{
	public void add()
	{
		System.out.println("Addition = "+(20+15));
	}
	
}


public class Day13_3 {

	public static void main(String[] args) 
	{
		Demo dobj = new Demo();
		dobj.add();
		dobj.m1(); // call default method
	}

}
