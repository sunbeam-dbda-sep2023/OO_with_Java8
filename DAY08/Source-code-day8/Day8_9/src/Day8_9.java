import java.util.Scanner;

// Required : resource must be closed automatically after its use
// try-with-resource



public class Day8_9 {

	public static void main(String[] args)
	{
		try(Scanner sc = new Scanner(System.in))
		{
			int n1;
			int n2;
			int result; 
				
			System.out.println("Enter First number : ");
			n1 = sc.nextInt(); 
			System.out.println("Enter Second number : ");
			n2 = sc.nextInt(); 
		
			result = n1/n2; 
			System.out.println("Result = "+result);
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
}

		