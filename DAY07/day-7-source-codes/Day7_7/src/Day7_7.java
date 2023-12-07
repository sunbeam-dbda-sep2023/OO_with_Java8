
// If we wish to call parameterized constructor of super class
// from sub class  then we must use super(along with parameters)
// inside the parameterized constructor of sub class
// the sequence and data type of parameters must be maintained strictly.

// writing of super keyword is compulsory if we want to work with parameterized constructor


class Person
{
	String name;
	int age;
	
	Person()
	{
		System.out.println("Inside Person class parameterless constructor");
		this.name="DEFAULT";
		this.age=18;
	}
	Person(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	@Override
	public String toString() // overridden method 
	{
		return "Person [name=" + this.name + ", age=" + this.age + "]";
	}	
	
	
	void printPersonDetails() // instance method // non overridden method 
	{
		System.out.println("Name = "+this.name+" Age = "+this.age);
	}
} // end of Person class



class Employee extends Person
{
	int empid;
	int salary;
	
	Employee()
	{
		System.out.println("Inside Employee class parameterless constructor");
		this.empid=1;
		this.salary=1;
	}
	Employee(int empid,int salary,String name,int age)
	{
		super(name,age);
		this.empid =empid;
		this.salary=salary;
	}
	@Override
	public String toString()  // overridden method
	{
		return "Employee [empid=" + this.empid + ", salary=" + this.salary + "]";
	}
	
	void printEmpDetails() // non overridden method // instance method 
	{
		printPersonDetails(); 
		
		System.out.println("Employee id = "+this.empid+" Salary = "+this.salary);
		
	}
	
	
} // end of Employee class


public class Day7_7 {

	public static void main(String[] args) 
	{
		Employee eobj=new Employee(123,90000,"Akshita",36);
		eobj.printEmpDetails();
	}

}
