// Method Reference for the constructor 
// Referencevariable of functional interface  = Classname :: new;

@FunctionalInterface
interface Test
{
	 Demo disp(String str);
	// public abstract 
}

class Demo
{
	Demo(String str)
	{
		System.out.println("Data = "+str);
	}
}

public class Day13_11 {

	public static void main(String[] args) 
	{
		Test tref = Demo::new;
			tref.disp("Sunbeam Infotech");
	}

}
