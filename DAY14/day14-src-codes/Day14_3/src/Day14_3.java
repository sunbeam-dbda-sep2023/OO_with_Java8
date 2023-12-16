import java.util.stream.Stream;


/*
// find square of each element in arr using stream concept
public class Day14_3 {

	public static void main(String[] args) 
	{
		Integer arr[]= {1,2,3,4,5,6,7,8,9};
		
		System.out.println("Printing original data using stream ");
		
		Stream.of(arr)
		.forEach(x -> System.out.print(x+"\t"));
		
		System.out.println();
		System.out.println("Printing sqaure of numbers stream ");
		Stream.of(arr)
		.map(x -> x*x)
		.forEach(x -> System.out.print(x+"\t"));
	}

}

*/


// find even numbers and odd numbers from an arr using streams

public class Day14_3 {

	public static void main(String[] args) 
	{
		Integer arr[]= {12,25,24,28,90,71,73,45,46};
		System.out.println("Printing original data using stream ");
		Stream.of(arr)
		.forEach(x -> System.out.print(x+"\t"));
		
		
		System.out.println("\n Count of Original Data : ");
		System.out.println(Stream.of(arr).count());
		
		System.out.println("\n Even Numbers are : ");
		Stream.of(arr)
		.filter(i -> i%2 == 0)
		.forEach(x -> System.out.print(x+"\t"));
		
		System.out.println("\n Count of Even Numbers are : ");
		System.out.println(Stream.of(arr).filter(i -> i%2 == 0).count());
		
		
		System.out.println("\n Odd Numbers are : ");
		Stream.of(arr)
		.filter(i -> i%2 != 0)
		.forEach(x -> System.out.print(x+"\t"));
		
		System.out.println("\n Count of Odd Numbers are : ");
		System.out.println(Stream.of(arr).filter(i -> i%2 != 0).count());
		
		
	}
	
}

