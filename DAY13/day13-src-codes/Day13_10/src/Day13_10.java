// Method reference to instance method

@FunctionalInterface
interface Execute
{
	void calc(int a, int b);
	// public abstract
}

class MathDemo
{
	void sum(int n1,int n2)
	{
		System.out.println("Sum Method is called");
		System.out.println("N1 = "+n1+" N2 = "+n2);
		System.out.println("Addition Result = "+(n1+n2));
		
	}
	
	void sub(int n1,int n2)
	{
		System.out.println("Sub Method is called");
		System.out.println("N1 = "+n1+" N2 = "+n2);
		System.out.println("Subtraction Result = "+(n1-n2));
		
	}
	

} // end of MathDemo

/*
public class Day13_10 {

	public static void main(String[] args)
	{
		MathDemo mobj = new MathDemo();
		mobj.sum(30,20);
		mobj.sub(9,8);

	}

}
*/


public class Day13_10 {

	public static void main(String[] args)
	{
		MathDemo mobj = new MathDemo();
		Execute ex = mobj::sum;
				// ex ==> ref ==> functional interface type
				
		ex.calc(50, 40);
		System.out.println();
		ex = mobj::sub;
		ex.calc(70, 30);
	}
}


