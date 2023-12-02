// private fields
// which can not be accessed outside the class scope 
// it is always recommended to declare the fields as private 


class Employee
{
	private String name;
	private int empid;
	private double salary;
	
	Employee() // parameterless constructor / user defined default constructor
	{
		this.name = "DEFAULT";
		this.empid = 1;
		this.salary=50000;
		
	}
	Employee(String name,int empid,double salary)
	{
		this.name = name;
		this.empid=empid;
		this.salary=salary;
		
	}
	void disp()
	{
		System.out.println("Name = "+this.name+" Empid = "+this.empid+" Salary = "+this.salary);

	}
}

public class Day3_10 
{

	public static void main(String[] args) 
	{
		Employee e1 = new Employee("emp1",123,90000);
		Employee e2 = new Employee("emp2",456,80000);
		e1.disp();
		e2.disp();
		//e1.salary = 40000; // not visible // javac error 
		e1.disp();
		//e1.salary=e2.salary; // not visible // javac error 
		e1.disp();
		
		

	}

}
