// Method Reference
// method reference to non static method of the class
// method reference to instance method of an object

// Functioaninterface  reference = objectname :: methodname;

@FunctionalInterface
interface Test
{
	void display();
	// public abstract 
}

public class Day13_9
{
	void m1()
	{
		System.out.println("Inside the method m1");
	}
	
	public static void main(String[] args)
	{
		Day13_9 dobj = new Day13_9();
		//dobj.m1();
	
		Test ref = dobj :: m1;
		// ref is reference variable of functional interface type
		ref.display();
	}

}
