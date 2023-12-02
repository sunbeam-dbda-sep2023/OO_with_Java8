import java.util.Scanner;

// constructor example 

class Employee
{
	String name;
	int empid;
	double salary;
	int age;

	Employee() // parameterless constructor / user defined default constructor
	{
		this("default",1,50000,18);
		
	}
	Employee(String name,int empid,double salary,int age)
	{
		this.name = name;
		this.empid=empid;
		this.salary=salary;
		this.age=age;
	}
	void disp()
	{
		System.out.println("Name = "+this.name+" Empid = "+this.empid);
		System.out.println("Salary = "+this.salary+" Age = "+this.age);
	}
}

public class Day3_9 {

	public static void main(String[] args) 
	{
		Employee e1 = new Employee(); //call to parameterless constructor  
		e1.disp(); // disp() is called upon e1 object
		
		Employee e2 = new Employee("p1",123,90000,45);
		// call to paramatrized constructor
		e2.disp();
		
		
	}

}
