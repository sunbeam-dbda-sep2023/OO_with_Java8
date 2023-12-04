// call toString() from Object class

class Employee
{
	int empid;
	String name;
	int salary;
	
	Employee()
	{

	}
	Employee(int empid,String name,int salary)
	{
		this.empid=empid;
		this.name=name;
		this.salary=salary;
	}
	
	void disp()
	{
		System.out.println("Empid = "+this.empid+" Name = "+this.name+" Salary = "+this.salary);
		
	}
}
public class Day4_1 {

	public static void main(String[] args) 
	{
		Employee e1 = new Employee();
		System.out.println("E1 = "+e1);
		Employee e2 = new Employee();
		System.out.println("E2 = "+e2);
		Employee e3 = e1;
		System.out.println("E3 = "+e3);
		// == operator is used for checking reference equality
		System.out.println("e1 == e2 "+(e1 == e2));
		System.out.println("e1 == e3 "+(e1 == e3));
	}

}
