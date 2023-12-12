import java.util.Vector;

//Demo of Vector class by using different constructors from Vector class

/*
public class Day10_12 {

	public static void main(String[] args)
	{
		Vector<Integer> vec = new Vector<Integer>();
		System.out.println("Size = "+vec.size()+" Capacity = "+vec.capacity());
		vec.add(5);
		vec.add(10);
		vec.add(15);
		vec.add(20);
		vec.add(25);
		vec.add(30);
		System.out.println("Size = "+vec.size()+" Capacity = "+vec.capacity());
		vec.add(35);
		vec.add(40);
		vec.add(45);
		vec.add(50);
		System.out.println("Size = "+vec.size()+" Capacity = "+vec.capacity());
		vec.add(55);
		System.out.println("Size = "+vec.size()+" Capacity = "+vec.capacity());
		
	}

}
*/


/*
public class Day10_12 {

	public static void main(String[] args)
	{
		Vector<Integer> vec = new Vector<Integer>(4);
		System.out.println("Size = "+vec.size()+" Capacity = "+vec.capacity());
		vec.add(40);
		vec.add(45);
		vec.add(50);
		System.out.println("Size = "+vec.size()+" Capacity = "+vec.capacity());
		vec.add(15);
		vec.add(20);
		vec.add(25);
		System.out.println("Size = "+vec.size()+" Capacity = "+vec.capacity());
		
		vec.add(5);
		vec.add(10);
		System.out.println("Size = "+vec.size()+" Capacity = "+vec.capacity());
		vec.add(255);
		System.out.println("Size = "+vec.size()+" Capacity = "+vec.capacity());
	}

}
*/


public class Day10_12 {

	public static void main(String[] args)
	{
		Vector<Integer> vec = new Vector<Integer>(4,3);
		System.out.println("Size = "+vec.size()+" Capacity = "+vec.capacity());
		vec.add(40);
		vec.add(45);
		vec.add(50);
		System.out.println("Size = "+vec.size()+" Capacity = "+vec.capacity());
		vec.add(5);
		vec.add(10);
		System.out.println("Size = "+vec.size()+" Capacity = "+vec.capacity());
		vec.trimToSize();
		System.out.println("Size = "+vec.size()+" Capacity = "+vec.capacity());
		
	}
}

