// lambda with zero arguments

interface Test
{
	public String getData();
	// public abstract
}


public class Day13_6 {

	public static void main(String[] args) 
	{
		Test tref = () -> {return "Hello Everyone!!";};
		System.out.println(tref.getData());
		tref = () -> {return "Core Java Lambda Expressions";};
		System.out.println(tref.getData());
	}

}




