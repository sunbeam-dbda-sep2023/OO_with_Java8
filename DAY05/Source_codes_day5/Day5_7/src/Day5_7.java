import java.util.Scanner;

// c[i] = a[i] + b[i]
// simple array creation and accepting the data from user

public class Day5_7 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a[] = new int[4];
		int b[] = new int[4];
		int c[] = new int[4];
		
		System.out.println("Enter the array elements : ");
		for(int i=0;i<a.length;i++)
			a[i]=sc.nextInt();
		
		System.out.println("Enter the array elements : ");
		for(int i=0;i<b.length;i++)
			b[i]=sc.nextInt();
		
		for(int i=0;i<c.length;i++)
			c[i] = a[i] + b[i];
		
		System.out.println("First Array ");
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+"\t");
		
		System.out.println();
		System.out.println("Second Array ");
		for(int i=0;i<b.length;i++)
			System.out.print(b[i]+"\t");
		
		System.out.println();
		
		System.out.println("Result Array ");
		for(int i=0;i<c.length;i++)
			System.out.print(c[i]+"\t");
		
		System.out.println();
		
		

	}

}
