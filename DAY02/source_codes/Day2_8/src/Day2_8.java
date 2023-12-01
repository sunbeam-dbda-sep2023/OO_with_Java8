// Narrowing and widening


/*
//IN CASE OF WIDENING , EXPLICIT CONVERSION IS NOT MANDATORY
public class Day2_8 {

	public static void main(String[] args) 
	{
		int n1 = 25;
		System.out.println("N1 = "+n1);
		double d1 = n1; // Widening (IMPLICIT WIDENING)
		// n1 ==> P type ==> int ==> 4bytes
		// d1 ==> P type ==> double ==> 8bytes
		System.out.println("D1 = "+d1);
		
		double d2 = (double)n1; // WIDENING (EXPLICIT  WIDENING)
		System.out.println("D2 = "+d2);
		
		float f1 = 7.5f;
		System.out.println("F1 = "+f1);
		double d3 = f1; // Implicitly
		System.out.println("D3 = "+d3);
		
		
	}

}

*/


//In case of narrowing explicit conversion is mandatory
// or else it is javac type of error

public class Day2_8 
{

	public static void main(String[] args) 
	{
		double d1 = 8.9;
		int n1 =(int)d1; // NARROWING 
		System.out.println("D1 = "+d1+" N1 = "+n1);
		
		double d2 = 5.6;
		float f1 = (float) d2;
		System.out.println("D2 = "+d2+" F1 = "+f1);
		
	}
}

