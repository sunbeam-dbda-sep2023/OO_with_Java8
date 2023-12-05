import java.util.Arrays;

// Arrays class

/*
//binarySearch()


public class Day5_15 {

	public static void main(String[] args) 
	{
		int arr[]=new int[] {11,22,33,44,55,66};
		for(int i : arr)
			System.out.print(i+"\t");
		System.out.println();
		System.out.println("Element 44 is at location : "+Arrays.binarySearch(arr, 44));
		System.out.println("Element 11 is at location : "+Arrays.binarySearch(arr, 11));
		System.out.println("Element 88 is at location : "+Arrays.binarySearch(arr, 88));
		System.out.println("Element 25 is at location : "+Arrays.binarySearch(arr, 25));
		
	}

}
*/

//Arrays.toString() 
// The string representation consists of a list of the array's elements, 
// enclosed in square brackets ("[]"). 
// Adjacent elements are separated by the characters ", " 
// (a comma followed by a space). 
/*
public class Day5_15 {

	public static void main(String[] args) 
	{
		int arr[]=new int[] {11,22,33,44,55,66};
		System.out.println(arr.toString()); // toString() is getting called from Object class
		System.out.println(Arrays.toString(arr)); //toString() is called from Arrays class
		
		
	}
}

*/


/*
// Arrays.sort() 

public class Day5_15 {

	public static void main(String[] args) 
	{
		int a1[]=new int[] {4,2,7,9,8};
		System.out.println("A1 = "+Arrays.toString(a1));
		Arrays.sort(a1);
		System.out.println("A1 = "+Arrays.toString(a1));
	}
}

*/

/*
//reference copy
public class Day5_15 {

	public static void main(String[] args) 
	{
		int a1[]=new int[] {4,2,7,9,8};
		System.out.println("A1 = "+a1+" Contents = "+Arrays.toString(a1));
		int a2[]=a1; // REFERENCE COPY // SHALLOW COPY
		System.out.println("A2 = "+a2+" Contents = "+Arrays.toString(a2));
		a1[4] = 99;
		System.out.println("A1 = "+a1+" Contents = "+Arrays.toString(a1));
		System.out.println("A2 = "+a2+" Contents = "+Arrays.toString(a2));
		a2[3] = 88;
		System.out.println("A1 = "+a1+" Contents = "+Arrays.toString(a1));
		System.out.println("A2 = "+a2+" Contents = "+Arrays.toString(a2));
		
		
	}
}

*/

//Instance copy , copyOf()
public class Day5_15 {

	public static void main(String[] args) 
	{
		int a1[]=new int[] {4,2,7,9,8};
		System.out.println("A1 = "+a1+" Contents = "+Arrays.toString(a1));
		int a2[];
		a2 = Arrays.copyOf(a1, 5); 
		System.out.println("A2 = "+a2+" Contents = "+Arrays.toString(a2));
		
		a1[2] = 1234;
		System.out.println("A1 = "+a1+" Contents = "+Arrays.toString(a1));
		System.out.println("A2 = "+a2+" Contents = "+Arrays.toString(a2));
		
		a2[1] = 8976;
		System.out.println("A1 = "+a1+" Contents = "+Arrays.toString(a1));
		System.out.println("A2 = "+a2+" Contents = "+Arrays.toString(a2));
		
	}
}





