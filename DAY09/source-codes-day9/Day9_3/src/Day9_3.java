// accept age from user , using command line argument
// check if age is >18 then ok else throw one exception

class InvalidAgeException extends Exception
{
	InvalidAgeException() // parameterless constructor
	{
		System.out.println("Constructor called");
	}
}

public class Day9_3 {

	public static void main(String[] args) 
	{
		try
		{
			int age = Integer.parseInt(args[0]);
			if(age < 18)
				throw new InvalidAgeException(); // throwing an object
			System.out.println("Age = "+age);
		}
		catch(InvalidAgeException e)
		{
			System.out.println("Age is invalid!!");
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("please supply cmd line argeuments");
		}
	}

}
