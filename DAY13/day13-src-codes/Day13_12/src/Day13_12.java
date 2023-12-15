import java.util.Arrays;
import java.util.List;

public class Day13_12 {

	public static void main(String[] args) 
	{
		List<Integer> l1 = Arrays.asList(11,22,33,44,55);
		
		for(int i=0;i<l1.size();i++)
			System.out.print(l1.get(i)+"\t");
		System.out.println();
		for(int i : l1)
			System.out.print(i+"\t");
		
		System.out.println();
		l1.forEach(x -> System.out.print(x+"\t"));
		
		System.out.println();
		l1.forEach(System.out::println);
	}

}
