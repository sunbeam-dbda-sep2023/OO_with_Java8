
//StringBuilder

/*
public class Day6_9 {

	public static void main(String[] args)
	{
		StringBuilder sb1 = new StringBuilder("Sunbeam");
		System.out.println("Sb1 = "+sb1);
		StringBuilder sb2 = new StringBuilder("Sunbeam");
		System.out.println("Sb2 = "+sb2);
		System.out.println("Sb1 == sb2 "+(sb1==sb2));
		System.out.println("Equals = "+sb1.equals(sb2)); 
		// equals() will be called from Object class
		// which checks the reference equality
		StringBuilder sb3 = sb1;
		
		System.out.println("Sb1 == sb3 "+(sb1==sb3));
		System.out.println("Equals = "+sb1.equals(sb3));
	 
	}

}
*/

/*
public class Day6_9 {

	public static void main(String[] args)
	{
		StringBuilder sb1 = new StringBuilder("Sunbeam");
		System.out.println("Sb1 = "+sb1);
		sb1.append("pg-dbda"); // mutable property 
		System.out.println("Sb1 = "+sb1);
		sb1.deleteCharAt(2);
		System.out.println("Sb1 = "+sb1);
		sb1.insert(13,"pune");
		System.out.println("Sb1 = "+sb1);
		
		
		
	}
}

*/

public class Day6_9 {

	public static void main(String[] args)
	{
		StringBuilder sb1 = new StringBuilder("Sunbeam");
		System.out.println("SB1 = "+sb1);
		sb1.reverse();
		System.out.println("SB1 = "+sb1);
	}
}


