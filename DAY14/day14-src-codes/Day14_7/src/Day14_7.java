import java.util.Arrays;
import java.util.List;
// map vs flatMap
/*
public class Day14_7 {

	public static void main(String[] args) 
	{
		List<String> l1 = Arrays.asList("Sunbeam","Trainer","Akshita","DBDA");
		l1.stream()
		.map(x -> x+"Java")
		.forEach(System.out::println);
	}

}
*/
import java.util.stream.Stream;


public class Day14_7 {

	public static void main(String[] args) 
	{
		List<String> l1 = Arrays.asList("Sunbeam","Trainer","Akshita","DBDA");
		l1.stream()
		.flatMap(str -> Stream.of(str.charAt(2)))
		.forEach(System.out::println);
	}
}

