package p1;

public class Day4_6 
{

	public static void main(String[] args) 
	{
		Employee e1 = new Employee(123, "Akshita", 36, 90000,"TCT");
		System.out.println(e1);
		Employee e2 = new Employee();
		e2.accept();
		e2.disp();
	}

}
