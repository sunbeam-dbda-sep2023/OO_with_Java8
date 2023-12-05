//static fields 
class Test
{
	private int num1; // non static field
	private int num2; // non static field
	private static int num3; // static field
	
	public Test(int num1, int num2) 
	{
		this.num1 = num1;
		this.num2 = num2;
	}
	static
	{
		num3 = 50;
	}
	// non static method 
	//can refer static and non static data 
	void disp()
	{
		System.out.println("Num1 = "+this.num1+" Num2 = "+this.num2);
		System.out.println("Num3 = "+num3);
	}
	
	// static method 
	// can only access static data
	
	static void m1()
	{
		//System.out.println("Num1 = "+num1+" Num2 = "+num2); //javac error
		System.out.println("Num3 = "+num3);
	}
	
}
public class Day5_1 {

	public static void main(String[] args)
	{
		Test t1 = new Test(80,60);
		t1.disp();
		Test.m1();
		

	}

}
