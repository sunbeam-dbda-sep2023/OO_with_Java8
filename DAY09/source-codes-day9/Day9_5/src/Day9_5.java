//this example is without generics 

class Demo
{
	private int num1,num2;
	private double a,b;
	
	Demo()
	{
		
	}
	//Demo(int num1,int num2)
	//{
		//this.num1=num1;
		//this.num2=num2;
	//}
	
	Demo(double a,double b)
	{
		this.a=a;
		this.b=b;
	}
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	@Override
	public String toString() {
		return "Demo [num1=" + a + ", num2=" + b + "]";
	}

	
}
public class Day9_5 {

	public static void main(String[] args) 
	{
		Demo dobj = new Demo(25.5,15.3);
		System.out.println(dobj);
	}

}
