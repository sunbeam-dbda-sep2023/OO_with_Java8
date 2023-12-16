import java.util.Arrays;
import java.util.List;


/*
// filter the stream based on even numbers and finding its sum
public class Day14_6 
{
	public static void main(String[] args) 
	{
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		System.out.println(numbers.stream()
		.filter(i -> i%2 == 0) // 2 , 4 , 6 , 8 , 10 
		.mapToInt(i -> i*1)  // 2 , 4 , 6 , 8 , 10 
		.sum()); // 30
		
	}

}
*/


/*
public class Day14_6 
{
	public static void main(String[] args) 
	{
		List<Integer> numbers = Arrays.asList(1,2,3,4,5);
		int num = numbers.stream()
		.mapToInt(x -> x*x)
		.reduce((x,y) -> x+y).getAsInt();
		System.out.println("Num = "+num);

	}
}
*/





