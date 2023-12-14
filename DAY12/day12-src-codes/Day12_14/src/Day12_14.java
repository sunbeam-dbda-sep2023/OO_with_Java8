// three ways to reflect a class
// 1. getClass() 
// 2. forName()
// 3. .class file name

class Demo
{
	
}

public class Day12_14
{

	public static void main(String[] args) throws ClassNotFoundException 
	{
		Class c1 = Class.forName("Demo");
		System.out.println(c1);
		
		Class c2 = Demo.class;
		System.out.println(c2);
		
		Demo dobj = new Demo();
		Class c3 = dobj.getClass();
		System.out.println(c3);
	}

}
