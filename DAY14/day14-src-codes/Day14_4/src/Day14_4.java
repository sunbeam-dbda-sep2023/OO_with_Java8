import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

/*
// find the cube of each element in the list using stream 
public class Day14_4 {

	public static void main(String[] args) 
	{
		List<Integer> l1 = new ArrayList<Integer>();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		l1.add(50);
		Stream<Integer> s1 = l1.stream();
		s1.map(x -> x*x*x)
		.forEach(System.out::println);
		
		
	}

}
*/


public class Day14_4 {

	public static void main(String[] args) 
	{
		List<Integer> l1 = new ArrayList<Integer>();
		Collections.addAll(l1,15,12,18,90,30);
		
		System.out.println("Count = "+l1.stream().count());
		System.out.println("Maximum = "+l1.stream().mapToInt(x -> x).max());
		System.out.println("Minumum = "+l1.stream().mapToInt(x -> x).min());
		System.out.println("Average = "+l1.stream().mapToInt(x -> x).average());
		System.out.println("Sorted data is ");
		l1.stream().mapToInt(x -> x).sorted().forEach(System.out::println);
		
		
		
	}
}


