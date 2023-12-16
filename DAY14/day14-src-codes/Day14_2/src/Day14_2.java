import java.util.stream.Stream;


/*
public class Day14_2 {

	public static void main(String[] args) 
	{
		Integer[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		
		// stream s1 is pointing to collection of elements inside arr
		
		Stream<Integer> s1 = Stream.of(arr);
		System.out.println(s1);
		
		//  filter is intermediate operation
		Stream<Integer> s2 = s1.filter(i -> i%2 == 0);
		System.out.println(s2);
		
		// 2  4   6   8   10   12   14
		// each  number must be mapped with "DBDA"
		// DBDA2  DBDA4  DBDA6   DBDA8   DBDA10    DBDA12   DBDA14
		
		Stream<String> s3 = s2.map(i -> "DBDA"+i);
		
		System.out.println(s3);
		// dbda2  dbda4   dbda6   dbda8   dbda10   dbda12   dbda14
		
		Stream<String> s4 = s3.map(i -> i.toLowerCase());
		System.out.println(s4);
		
		//displaying the elements in s4 stream
		// terminal operation
		
		s4.forEach(i -> System.out.print(i+"\t"));
		
		
		
		
	}

}

*/


/*
public class Day14_2 {

	public static void main(String[] args) 
	{
		Integer[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		
		//Standard Practice
		
		Stream.of(arr)
		.filter(i -> i%2==0)
		.map(i-> "DBDA"+i)
		.map(i -> i.toLowerCase())
		.forEach(i -> System.out.print(i+"\t"));
		
		
	}
}

*/

// NOTE : After terminal function we can not apply intermediate operation on same stream

public class Day14_2 {

	public static void main(String[] args) 
	{
		Integer[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		
		// stream s1 is pointing to collection of elements inside arr
		
		Stream<Integer> s1 = Stream.of(arr);
		System.out.println(s1);
		s1.forEach(i -> System.out.print(i+"\t"));
		// thread "main" java.lang.IllegalStateException: 
		//stream has already been operated upon or closed
		//Stream<Integer> s2 = s1.filter(i -> i%2 == 0); // Exception 
		//System.out.println(s2);
	}
}


