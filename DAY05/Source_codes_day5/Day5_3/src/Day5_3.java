import java.util.Scanner;

//static reference 


/*
public class Day5_3
{
	static int num1;  //static field 
	static int num2; //static field 
	static String name; //static field 
	static Scanner sc = new Scanner(System.in); //static object
	
	
	
	static void acceptNumericData()
	{
		
		System.out.println("Enter first numeric value : ");
		num1 = sc.nextInt();
		
		System.out.println("Enter second numeric value : ");
		num2 = sc.nextInt();
		
	}
	static void acceptStrData()
	{
		
		System.out.println("Enter string value : ");
		name = sc.next();
	}
	static void dispData()
	{
		System.out.println("Num1 = "+num1+" Num2 = "+num2+" Name = "+name);
	}
	public static void main(String[] args) 
	{
		acceptNumericData();
		acceptStrData();
		dispData();
	}

}

*/



public class Day5_3
{
	static int num1;  //static field 
	static int num2; //static field 
	static String name; //static field 
	static Scanner sc ; // static reference 
	
	static //static initializer block
	{
		num1=1;
		num2=1;
		name="DEFAULT";
	}	
	static  //static initializer block
	{
		sc= new Scanner(System.in); 
	}
	
	
	static void acceptNumericData()
	{
		
		System.out.println("Enter first numeric value : ");
		num1 = sc.nextInt();
		
		System.out.println("Enter second numeric value : ");
		num2 = sc.nextInt();
		
	}
	static void acceptStrData()
	{
		
		System.out.println("Enter string value : ");
		name = sc.next();
	}
	static void dispData()
	{
		System.out.println("Num1 = "+num1+" Num2 = "+num2+" Name = "+name);
	}
	public static void main(String[] args) 
	{
		dispData();
		System.out.println();
		acceptNumericData();
		acceptStrData();
		dispData();
	}

}

