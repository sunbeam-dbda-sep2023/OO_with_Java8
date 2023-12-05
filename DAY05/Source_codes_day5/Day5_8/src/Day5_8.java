import java.util.Scanner;

// Array and Functions 

public class Day5_8 
{

	static void accept_data(int a[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array elements : ");
		for(int i=0;i<a.length;i++)
			a[i]=sc.nextInt();
	}
	
	static void disp_data(int a[])
	{
		System.out.println("Array Elements =  ");
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+"\t");
		System.out.println();
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a1[] = new int[4];
		int b1[] = new int[4];
		int c1[] = new int[4];
		
		accept_data(a1);
		accept_data(b1);
		
		for(int i=0;i<c1.length;i++)
			c1[i] = a1[i] + b1[i];
		
		disp_data(a1);
		disp_data(b1);
		disp_data(c1);
		
	}

}
