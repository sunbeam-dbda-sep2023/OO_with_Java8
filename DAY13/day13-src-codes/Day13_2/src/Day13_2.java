// Default methods 

interface Test1
{
	void add(); // method declaration
	// public static
	
	default void m1()
	{
		System.out.println("Inside interface TEST1 method m1");
	}
}


interface Test2
{
	void sub(); // method declaration
	// public static
	
	default void m1()
	{
		System.out.println("Inside interface TEST2 method m1");
	}
}

class Demo implements Test1,Test2
{
	public void add()
	{
		System.out.println("Addition = "+(20+15));
	}
	public void sub()
	{
		System.out.println("Subtraction = "+(40-12));
	}
	@Override
	public void m1() 
	{		
		Test1.super.m1();
		Test2.super.m1();
	}
}


public class Day13_2 {

	public static void main(String[] args) 
	{
		Demo dobj = new Demo();
		dobj.add();
		dobj.m1(); // call default method
		
	}

}
