import java.util.Scanner;

//Auto boxing and auto unboxing
public class Day5_12 {

	public static void main(String[] args) 
	{
		Integer iarr[] = new Integer[4];
		System.out.println("Enter the values of an array : ");
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<4;i++)
			iarr[i]=sc.nextInt();
		
		System.out.println("Array elements are : ");
		for(Integer element : iarr)
			System.out.print(element+"\t");
	}

}
