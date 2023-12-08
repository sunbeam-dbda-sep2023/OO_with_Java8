import java.util.Scanner;

public class Day8_4 {

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
		n2 = sc.nextInt(); //throw new InputMismatchException()
		
			result = n1/n2; // throw new ArithmeticException()
			System.out.println("Result = "+result);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Please enter second number as non zero value");
		}

		catch(Exception e)
		{
			System.out.println("Enter valid number");
		}
}

}