// generic example 
class Test<T> // class Test is taking one parameter as type parameter T
{
	T num; // num is field who is of type T 
	Test()
	{}
	Test(T num) // method of the class is taking one parameter of type T
	{
		this.num = num;
	}
	
	T getNum() // method of the class is returning one value of type T
	{
		return this.num;
	}
}


public class Day9_6 {

	public static void main(String[] args) 
	{
		//Test tobj = new Test(); // RAW TYPE
		Test<Integer> t1 = new Test<Integer>(45);
		System.out.println("Num value = "+t1.getNum());
		Test<Float> t2 = new Test<Float>(3.2f);
		System.out.println("Num value = "+t2.getNum());
		
		Test<Double> t3 = new Test<Double>(5.4);
		System.out.println("Num value = "+t3.getNum());
		
		Test<String> t4 = new Test<String>("Sunbeam");
		System.out.println("value = "+t4.getNum());
	}

}
