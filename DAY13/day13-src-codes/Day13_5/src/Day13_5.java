@FunctionalInterface
interface Square
{
	public int getArea(int side);
	// public abstract
}

public class Day13_5 
{

	public static void main(String[] args) 
	{
		Square area = (x) -> {return x * x;};
		//Square area = (side) -> {return side * side;};
		
				//area is reference variable of interface type Square
				// Square interface is functional interface 
				// functional interface reference variable
				//can hold LAMBDA 
		System.out.println("Area of Square = "+area.getArea(5));
		System.out.println("Area of Square = "+area.getArea(9));
		
	}

}
