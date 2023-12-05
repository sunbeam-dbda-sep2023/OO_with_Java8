import java.util.Scanner;

// take input from user and display array elements 
/*
public class Day5_6 {

	public static void main(String[] args) 
	{
		int a[]= new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array elements :");
		for(int i=0;i<5;i++)
			a[i] = sc.nextInt();
		
		System.out.println("Array elements are:");
		for(int i=0;i<5;i++)
			System.out.print(a[i]+"\t");
			
		

	}

}
*/




public class Day5_6 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter the number of elements you wish to insert in an array ?");
		n = sc.nextInt();
		int a[]= new int[n];
		
		System.out.println("Enter the array elements :");
		for(int i=0;i<n;i++)
			a[i] = sc.nextInt();
		
		System.out.println("Array elements are:");
		for(int i=0;i<n;i++)
			System.out.print(a[i]+"\t");
			
		

	}

}
