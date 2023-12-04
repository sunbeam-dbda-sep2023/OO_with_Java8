
//Demo.java and Day4_13.java file are having different scopes


// non static methods are called with the help of object name
// static methods are called with the help of class name (RECOMMENDED)
public class Day4_13
{

	public static void main(String[] args) 
	{
		Demo d1 = new Demo();
		d1.m1(); // calling non static method (instance method)
		Demo.add(); // calling static method ( class level method) //RECOMMENDED
		Demo.sub(); // calling static method ( class level method) // RECOMMENDED
		System.out.println();
		
		d1.add(); // no javac error // warning
	
		// add() is a member of the class Demo thats why it allowed us to access the member
		// static methods can be accessed in static way
	
		d1.sub(); // no javac error // warning
		
	}

}
