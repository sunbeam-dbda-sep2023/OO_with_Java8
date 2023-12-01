
//Boxing Examples 
/*
public class Day2_9 {

	public static void main(String[] args)
	{
		int number = 1234;
		//int to String
		// P to NP ==> Boxing
		String s1 = Integer.toString(number);
		System.out.println("S1 = "+s1);
		
		String s2 = String.valueOf(number);
		System.out.println("S2 = "+s2);
	}

}
*/


/*

public class Day2_9 {

	public static void main(String[] args)
	{
		int n1 = 55;
		float f1 = 4.5f;
		double d1 = 9.8;
		
		String s1 = String.valueOf(n1);
		String s2 = String.valueOf(f1);
		String s3 = String.valueOf(d1);
		System.out.println("S1 = "+s1);
		System.out.println("S2 = "+s2);
		System.out.println("S3 = "+s3);
		
	}
}

*/	


public class Day2_9 {

	public static void main(String[] args)
	{
		int num = 90;
		Integer e = Integer.valueOf(num); // BOXING 
		// num ==> int ==> P ==> value
		// e ==> Integer ==> NP ==> reference 
		// p to  NP ==> Boxing
		System.out.println("Num = "+num);
		System.out.println("E = "+e.intValue());//e.intValue()  
		// Integer to int ==> intValue()
		
		// NP to P ==> UNBOXING ==> Implicitly 
		
		
	}
}



