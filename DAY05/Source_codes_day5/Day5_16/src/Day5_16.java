import java.util.Arrays;

class Employee
{
	int empid;
	int salary;
	
	Employee()
	{
	}
	Employee(int empid,int salary)
	{
		this.empid=empid;
		this.salary=salary;
	}
	
	void disp()
	{
		System.out.println("Empid  = "+this.empid+" Salary = "+this.salary); 
	}
}

/*
public class Day5_16 
{

	public static void main(String[] args) 
	{
		Employee e = new Employee();
		e.disp();
		Employee e1 = new Employee(1,90000);
		e1.disp();

	}

}
*/



public class Day5_16 
{

	public static void main(String[] args) 
	{
		Employee e[] = new Employee[4];
		//System.out.println("E[0] "+e[0]);
		System.out.println(Arrays.toString(e));
		//e[0].disp(); // NPE 
		e[0] = new Employee(123,90000);
		e[1] = new Employee(456,80000);
		e[2] = new Employee(789,70000);
		e[3] = new Employee(345,60000);
		// emp = e[0]  emp = e[1]  emp = e[2]  emp = e[3] 
		for(Employee emp : e)
			emp.disp();
		
	}
}
