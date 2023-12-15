import java.util.Arrays;
import java.util.List;

// lambda expression

// list of numbers to be printed with a lambda
// Single line lambda expression
/*
public class Day13_4 {

	public static void main(String[] args) 
	{
		List<Integer> l1 = Arrays.asList(10,20,30,40,50);
		//System.out.println(l1);
		l1.forEach(x -> System.out.print(x +"\t"));
	
	}

}
*/

// single line lambda expression
/*
public class Day13_4 {

	public static void main(String[] args) 
	{
		List<Integer> l1 = Arrays.asList(10,20,30,40,50);
		l1.forEach(x -> System.out.print((x+5) +"\t"));	
	}

}
*/
/*
// multi line lambda expression / local variable inside the lambda expression
public class Day13_4 {

	public static void main(String[] args) 
	{
		List<Integer> l1 = Arrays.asList(10,20,30,40,50);
		l1.forEach(x -> {
			int y = 25;
			x = x+y;
			System.out.print(x+"\t");
		} );
	}
}
*/


public class Day13_4 {

	public static void main(String[] args) 
	{
		List<Integer> l1 = Arrays.asList(11,22,33,44);
		int num = 20; // local variable declared inside main
		
		l1.forEach(x -> {
			System.out.print("Value = "+x);
			x = x * num; // captured the value of local variable inside lambda
			System.out.println(" Updated value = "+x);
		});
		
	}
}

