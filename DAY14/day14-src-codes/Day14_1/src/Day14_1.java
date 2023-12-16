import java.util.function.BiFunction;

class Multiplication
{
	public static int multiply(int a,int b)
	{
		return a*b;
	}
	
	public static int division(int a,int b)
	{
		return a/b;
	}
}

/*
public class Day14_1 {

	public static void main(String[] args)
	{
		System.out.println(Multiplication.multiply(9,8));
		
	}

}
*/


public class Day14_1 {

	public static void main(String[] args)
	{
		BiFunction<Integer,Integer,Integer> ref = Multiplication::multiply;
		int result = ref.apply(25, 15);
		System.out.println("Result = "+result);
		
		ref = Multiplication::division;
		result = ref.apply(20, 5);
		System.out.println("Result = "+result);
	}
}

	