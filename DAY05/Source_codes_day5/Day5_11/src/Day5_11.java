
// for each loop/ advanced for loop

/*
public class Day5_11 {

	public static void main(String[] args)
	{
		int a[]=new int[5];
		a[0]=11;
		a[1]=22;
		a[2]=33;
		a[3] = 44;
		a[4] = 55;
		
		System.out.println("Array elements simple for loop : ");
		for(int i=0;i<5;i++)  
			System.out.print(a[i]+"\t");
		
		System.out.println();
		System.out.println("Displaying the elements using for each loop : ");
		// for each "int" type of element "i" 
		// inside the array "a"
		// display each element "i"
		// forward direction ==> traversal (only once)
		// i = a[0] = 11
		// i = a[1] = 22
		// i = a[2] = 33
		// i = a[3] = 44
		// i = a[4] = 55
		// i will start from 0 to a.length-1 		
		for(int i : a)
			System.out.print(i+"\t");
		
	}

}
*/



/*
public class Day5_11 {

	public static void main(String[] args)
	{
		float f1[]=new float[] {4.5f,5.5f,2.3f,9.8f};
		
		System.out.println("Display the array elements : ");
		for(float i : f1)
			System.out.print(i+"\t");
		
		
	}
}
*/

public class Day5_11 {

	public static void main(String[] args)
	{
		String s[]=new String[] {"Sunbeam","Hinjewadi","MarketYard","Karad"};
		
		for(String str : s)
			System.out.println(str);
	}
}

	
