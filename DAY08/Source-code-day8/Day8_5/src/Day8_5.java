import java.util.Scanner;

public class Day8_5 {

	public static void main(String[] args)
	{
		try
		{
		int n1;
		int n2;
		int result; 
		
		n1 = Integer.parseInt(args[0]);
		n2 = Integer.parseInt(args[1]);
		result = n1/n2; // throw new ArithmeticException()
		System.out.println("Result = "+result);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Please enter second number as non zero value");
		}

		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("please supply command line arguments");
		}
}

}