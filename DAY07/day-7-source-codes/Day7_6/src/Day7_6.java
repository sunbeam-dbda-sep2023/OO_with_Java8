 //use of this keyword with non overridden methods 
// calling sequence of parameterless constructor 


// super class Parameterless constructor is called automatically from the 
// parameterless constructor of sub class.


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
	Employee(int empid,int salary)
	{
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
		printPersonDetails(); // this.printPersonDetails();
		// printPersonDetails() method is non overridden method in super class
		// it can be called directly  or by using this keyword
		
		System.out.println("Employee id = "+this.empid+" Salary = "+this.salary);
		
	}
	
	
} // end of Employee class


public class Day7_6 {

	public static void main(String[] args) 
	{
		Employee eobj=new Employee();
		eobj.printEmpDetails();
	}

}
