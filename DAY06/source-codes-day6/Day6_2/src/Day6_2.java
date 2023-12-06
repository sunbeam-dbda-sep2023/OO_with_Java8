import java.util.Scanner;

// 2d arrays

/*
public class Day6_2 {

	public static void main(String[] args) 
	{
		int a[][]=new int[3][2]; // valid declaration
		
		int b[][];//valid declaration
		b = new int[4][4];
		
		int c[][]=new int[][] {{1,2,3,4},{5,6,7,8},{9,8,7}}; //valid declaration
		
		//int d[4][2]; // not allowed 
		
		
	}

}
*/


public class Day6_2 {

	public static void main(String[] args) 
	{
		int a[][]=new int[3][2];
		System.out.println("Enter Array elements :");
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Array elements are ");
		//for(int i=0;i<3;i++)
		//{
			//for(int j=0;j<2;j++)
				//{
					//System.out.print(a[i][j]+"\t");
				//}
			//System.out.println();
		//}
		
		for(int row[] : a)
		{
			for(int element : row)
			{
				System.out.print(element+"\t");
			}
			System.out.println();
		}
	}
}




