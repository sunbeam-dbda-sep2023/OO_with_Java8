import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

//fail-fast VS fail-safe 

/*
public class Day10_13 {

	public static void main(String[] args) 
	{
		Vector<Integer> vec = new Vector<Integer>(5);
		vec.add(10);
		vec.add(20);
		vec.add(30);
		vec.add(40);
		vec.add(50);
		System.out.println("Vector elements = "+vec);
		
		Iterator<Integer> itr = vec.iterator();
		while(itr.hasNext())
		{
			int element = itr.next();
			System.out.println("Element = "+element);
			if(element == 30)
				vec.add(999); // Fail-Fast Iterator
		}
	}

}
*/


/*
public class Day10_13 {

	public static void main(String[] args) 
	{
		Vector<Integer> vec = new Vector<Integer>(5);
		vec.add(10);
		vec.add(20);
		vec.add(30);
		vec.add(40);
		vec.add(50);
		System.out.println("Vector elements = "+vec);
		
		Enumeration<Integer> e = vec.elements();
		while(e.hasMoreElements())
			System.out.print(e.nextElement()+"\t");
		
		
		
	}
}
*/

//fail-safe iterator 

public class Day10_13 {

	public static void main(String[] args) 
	{
		Vector<Integer> vec = new Vector<Integer>(5);
		vec.add(10);
		vec.add(20);
		vec.add(30);
		vec.add(40);
		vec.add(50);
		System.out.println("Vector elements = "+vec);
		
		Enumeration<Integer> e = vec.elements();
		while(e.hasMoreElements())
		{
			int element = e.nextElement();
			System.out.print(element+"\t");
			if(element == 40)
				vec.add(88);
			
		}
		System.out.println();
		System.out.println("Vector elements = "+vec);
		
		
		
	}
}
