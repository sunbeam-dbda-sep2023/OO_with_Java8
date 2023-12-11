// accept age from user , using command line argument
// check if age is >18 then ok else throw one exception

//class having multiple constructor

class InvalidAgeException extends Exception
{
	String msg;
	InvalidAgeException() // parameterless constructor
	{
		System.out.println("Constructor called");
	}
	
	InvalidAgeException(String msg) // parameterized constructor
	{
		//this.msg=msg;
		System.out.println(msg);
	}
}

public class Day9_3 {

	public static void main(String[] args) 
	{
		try
		{
			int age = Integer.parseInt(args[0]);
			if(age < 18)
				throw new InvalidAgeException("AGE IS NOT VALID"); 
			    // throwing an object by calling parameterized constructor
			System.out.println("Age = "+age);
		}
		catch(InvalidAgeException e)
		{
			System.out.println(e);
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("please supply cmd line argeuments");
		}
	}

}
