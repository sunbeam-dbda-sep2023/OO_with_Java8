import java.util.Scanner;
// try-catch-finally block example

public class Day8_8 {

	public static void main(String[] args)
	{
		try
		{
			int n1;
			int n2;
			int result; 
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter First number : ");
			n1 = sc.nextInt(); 
			System.out.println("Enter Second number : ");
			n2 = sc.nextInt(); 
		
			result = n1/n2; 
			System.out.println("Result = "+result);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Get Localized messege "+e.getLocalizedMessage());
			System.out.println("Get Messege = "+e.getMessage());
			System.out.println("Get Cause = "+e.getCause());
			System.out.println("Get Class = "+e.getClass());
			System.out.println("To String = "+e.toString());
			e.printStackTrace();
		}
		finally
		{
			System.out.println("Inside the finally block");
		}
		
	}
}

		