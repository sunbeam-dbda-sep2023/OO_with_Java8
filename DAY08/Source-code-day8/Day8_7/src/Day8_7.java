import java.util.Scanner;
//try with finally

public class Day8_7 {

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
		finally
		{
			System.out.println("inside the finally block");
		}
		
	}
}

		