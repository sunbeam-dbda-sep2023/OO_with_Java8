enum Color
{
	RED,GREEN,BLUE;
}

public class Day7_1 {

	public static void main(String[] args) 
	{
		System.out.println(Color.RED);
		System.out.println(Color.GREEN);
		System.out.println(Color.BLUE);
		
		Color clr = Color.RED;
		System.out.println("Clr = "+clr+" Name = "+clr.name()+" Ordinal = "+clr.ordinal());
		
		clr = Color.GREEN;
		System.out.println("Clr = "+clr+" Name = "+clr.name()+" Ordinal = "+clr.ordinal());
		
		clr = Color.BLUE;
		System.out.println("Clr = "+clr+" Name = "+clr.name()+" Ordinal = "+clr.ordinal());
		
	}

}
