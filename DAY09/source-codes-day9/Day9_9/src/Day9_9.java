
/*
class Demo<T>
{
	T num;
	void set(T num)
	{
		this.num=num;
	}
	
	T get()
	{
		return this.num;
	}	
}


public class Day9_9 {

	public static void main(String[] args) 
	{
		Demo<Integer> d1 = new Demo<Integer>();
		d1.set(20);
		System.out.println("Value = "+d1.get());
		
		Demo<Float> d2 = new Demo<Float>();
		d2.set(25.5f);
		System.out.println("Value = "+d2.get());
		
		Demo<Double> d3 = new Demo<Double>();
		d3.set(40.5);
		System.out.println("Value = "+d3.get());
		
		Demo<Boolean> d4 = new Demo<Boolean>();
		d4.set(true);
		System.out.println("Value = "+d4.get());
		
		Demo<String> d5 = new Demo<String>();
		d5.set("java");
		System.out.println("Value = "+d5.get());
		
		

	}

}


*/

// Bounded Type Parameter

class Demo<T extends Number>
{
	T num; // Generic Field 
	void set(T num) // Generic Method 
	{
		this.num=num;
	}
	
	T get() // method returning generic type parameter
	{
		return this.num;
	}	
}


public class Day9_9 {

	public static void main(String[] args) 
	{
		Demo<Integer> d1 = new Demo<Integer>(); //valid 
		d1.set(20);
		System.out.println("Value = "+d1.get());
		
		Demo<Float> d2 = new Demo<Float>(); // valid 
		d2.set(25.5f);
		System.out.println("Value = "+d2.get());
		
		Demo<Double> d3 = new Demo<Double>(); // valid 
		d3.set(40.5);
		System.out.println("Value = "+d3.get());
		
		//Demo<Boolean> d4 = new Demo<Boolean>(); // javac error  // Bound Mismatch
		//d4.set(true);
		//System.out.println("Value = "+d4.get());
		
		//Demo<String> d5 = new Demo<String>(); // javac error // Bound Mismatch
		//d5.set("java");
		//System.out.println("Value = "+d5.get());
		
		

	}

}
