// methods are having same scope as main scope
// static methods are declared when we donot wish to create object of the class
public class Day4_14 
{
	void m1() // non static (can be accessed with the help of object name)
	{
		System.out.println("Inside M1 method of day4_14");
	}
	
	static void add() //static method 
	{
		System.out.println("Addition = "+(25+10));
	}
	
	static void sub()  //static method 
	{
		System.out.println("Subtraction = "+(85-60));
	}
	public static void main(String[] args)
	{
		//m1(); // javac error 
		// static method can not access non static method directly
		// if the scope is same
		
		Day4_14 dobj = new Day4_14();
		dobj.m1();
		
		Day4_14.add();
		Day4_14.sub();
		 
		
	}

}
