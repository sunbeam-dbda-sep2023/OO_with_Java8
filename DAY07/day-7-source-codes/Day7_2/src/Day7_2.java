import java.util.Scanner;

/*
//values() method example 
 
enum Color
{
	RED,GREEN,BLUE;
}

public class Day7_2 {

	public static void main(String[] args) 
	{
		Color carr[] = Color.values();
		for(Color clr : carr)
			System.out.println(clr + " Name = "+clr.name()+" Ordinal = "+clr.ordinal());
		
	}

}
*/

//example of valueOf(String name)

enum Color
{
	RED,GREEN,BLUE;
}

public class Day7_2 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any color = RED/GREEN/BLUE");
		String s1 = sc.nextLine();
		
		Color clr = Color.valueOf(s1.toUpperCase());
		System.out.println("Clr = "+clr);
		System.out.println("Name = "+clr.name()+" Ordinal = "+clr.ordinal());
		
		int choice = clr.ordinal();
		System.out.println("Choice "+choice);
	}
}


















