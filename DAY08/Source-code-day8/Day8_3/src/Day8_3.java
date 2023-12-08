import java.util.InputMismatchException;
import java.util.Scanner;



/*
public class Day8_3 {

	public static void main(String[] args)
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

}
*/






/*
public class Day8_3 {

	public static void main(String[] args)
	{
		int n1;
		int n2;
		int result; 
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter First number : ");
		n1 = sc.nextInt();
		System.out.println("Enter Second number : ");
		n2 = sc.nextInt();
		try
		{
			result = n1/n2;
			System.out.println("Result = "+result);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Please enter second number as non zero value");
		}

}

}

*/


public class Day8_3 {

	public static void main(String[] args)
	{
		try
		{
		int n1;
		int n2;
		int result; 
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter First number : ");
		n1 = sc.nextInt(); // new InputMismatchException() 
		System.out.println("Enter Second number : ");
		n2 = sc.nextInt(); // new ArithmeticException()
		
			result = n1/n2;
			System.out.println("Result = "+result);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Please enter second number as non zero value");
		}

		catch(InputMismatchException e)
		{
			System.out.println("Enter valid number");
		}
}

}

