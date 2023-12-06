import java.util.StringTokenizer;


/*
public class Day6_10 {

	public static void main(String[] args) 
	{
		String str = "core java topic is string";
		StringTokenizer stk = new StringTokenizer(str);
		System.out.println("Total tokens = "+stk.countTokens());
		
	}

}
*/

/*
public class Day6_10 {

	public static void main(String[] args) 
	{
		String str = "core java topic is string";
		StringTokenizer stk = new StringTokenizer(str);
		
		while(stk.hasMoreTokens())
		{
			System.out.println(stk.nextToken());
		}
	}
}
*/

/*
public class Day6_10 {

	public static void main(String[] args) 
	{
		String str = "core-java@topic-is,@string@sun*beam";
		String delim = "#,-.@*";
		StringTokenizer stk = new StringTokenizer(str,delim);
		
		while(stk.hasMoreTokens())
		{
			System.out.println(stk.nextToken());
		}
	}
}

*/

public class Day6_10 {

	public static void main(String[] args) 
	{
		String str = "core-java@topic-is,@string@sun*beam";
		String delim = "#,-.@*";
		StringTokenizer stk = new StringTokenizer(str,delim,true);
		
		while(stk.hasMoreTokens())
		{
			System.out.println(stk.nextToken());
		}
	}
}
