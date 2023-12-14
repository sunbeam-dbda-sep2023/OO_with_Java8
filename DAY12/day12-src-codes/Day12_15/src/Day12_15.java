import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

class Test
{
	int num1;
	int num2;
	Test()
	{
		
	}
	Test(int num1,int num2)
	{
		this.num1=num1;
		this.num2=num2;
	}
	
	void m1()
	{
		
	}
	void m2(int a)
	{
		
	}
}

public class Day12_15 {

	public static void main(String[] args) 
	{
		// Class c = Class.forName("Test");
		 Class c = Test.class;
		 
		 Field farr[] = c.getDeclaredFields();
		 
		 System.out.println("Printing Fields of the class ");
		 for(Field f : farr)
			 System.out.println(f.getName());
		 
		 Constructor carr[] = c.getDeclaredConstructors();
		 
		 System.out.println("Printing Constructor of the class ");
		 for(Constructor ctr : carr)
			 System.out.println(ctr);
		 
		 Method marr[] = c.getDeclaredMethods();
		 System.out.println("Printing Method  of the class ");
		 for(Method mtd : marr)
			 System.out.println(mtd);
		 
		 
		 
		

	}

}
