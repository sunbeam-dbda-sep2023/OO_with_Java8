

/*
public class Day6_7 {

	public static void main(String[] args) 
	{
		String s1 = "Sunbeam";
		System.out.println("S1 = "+s1);
		System.out.println("Character at location 4 = "+s1.charAt(4));
		//System.out.println("Character at location 11 = "+s1.charAt(11)); // Exception
		String s2 = "java";
		String s3 = "Sunbeam";
		String s4 = "javab";
		System.out.println("s1 compare to s2 "+s1.compareTo(s2));
		// -23
		// first character s1 ==> S ==>  83
		// first character s2 ==> j  ==> 106
		// 83 - 106 = -23 
		System.out.println("s1 compare to s2 "+s1.compareTo(s3));
		System.out.println("s2 compare to s4 "+s2.compareTo(s4));

	}

}

*/

/*
public class Day6_7 {

	public static void main(String[] args) 
	{
		String p1 = "Sunbeam";
		String p2 = "Sunbeam";
		String p3 = "sunbeam";
		System.out.println("p1 compare to p2 "+p1.compareTo(p2));
		System.out.println("p1 compare to p3 "+p1.compareTo(p3));
		System.out.println("p1 compare to ignore case p3 "+p1.compareToIgnoreCase(p3));
		System.out.println("Concat = "+p1.concat(" PG-DBDA"));
		System.out.println("p1 ends with beam "+p1.endsWith("beam"));
		System.out.println("p1 equals p2 "+p1.equals(p2));
		System.out.println("p1 equals p3 "+p1.equals(p3));
		System.out.println("p1 equals ignore case p2 "+p1.equalsIgnoreCase(p3));
	}
}
*/


// toCharArray
// String to character array conversion

public class Day6_7 {

	public static void main(String[] args) 
	{
		String p1 = "Sunbeam";
		char ch[]= p1.toCharArray();
		for(Character c : ch)
			System.out.print(c+"\t");
		System.out.println();
		System.out.println("p1 = "+p1.toString());
		System.out.println("p1 hashcode = "+p1.hashCode());
	}
}
