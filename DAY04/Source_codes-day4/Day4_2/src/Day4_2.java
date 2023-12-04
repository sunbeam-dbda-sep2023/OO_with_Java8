// override toString() from Object class

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
	
	public String toString()  // overridden method 
	{
		return "Inside toString method of employee class";
	}
	
	
}

public class Day4_2 {

	public static void main(String[] args) 
	{
		Employee e1 = new Employee();
		System.out.println("E1 = "+e1); //e1.toString() called from Employee class
		Employee e2 = new Employee();
		System.out.println("E2 = "+e2);//e2.toString() called from Employee class
			
	}

}
