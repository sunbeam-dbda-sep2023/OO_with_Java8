// generic example 
class Test<T,U> // class Test is taking two generic type parameters
{
	T a;
	U b; 
	
	Test()
	{}
	Test(T a,U b) 
	{
		this.a = a;
		this.b= b;
	}
	
	void disp()
	{
		System.out.println("First Value = "+this.a+" Second Value = "+this.b);
	}
}


public class Day9_8 {

	public static void main(String[] args) 
	{
		Test<Integer,Float> t1=new Test<Integer,Float>(20,2.5f);
		t1.disp();
		
		Test<Float,Integer> t2=new Test<Float,Integer>(13.5f,9);
		t2.disp();
		
		
		Test<Double,Float> t3=new Test<Double,Float>(2.5,6.5f);
		t3.disp();
		
		
		Test<Integer,String> t4=new Test<Integer,String>(123,"Sunbeam");
		t4.disp();
	}

}
