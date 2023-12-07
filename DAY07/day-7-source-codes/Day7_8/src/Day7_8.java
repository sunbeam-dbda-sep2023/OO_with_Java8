// super keyword
// 1. super() will call parameterless constructor (Optional to write)
//2. super(with parameters) ==> call parameterized constructor of super class
//3 . super.methodname() ==> call super class overridden method 

// disp() method signature  is same in Person class as well as Employee class
// but the functionality is different also scope is different
// Same function name with multiple forms in different scope is called as POLYMORPHISIM



class Person
{
	String name;
	int age;
	
	public Person() 
	{
		super(); // Optional 
	}

	public Person(String name, int age) 
	{
		this.name = name;
		this.age = age;
	}
	
	void disp()
	{
		System.out.println("Name = "+this.name+" Age = "+this.age);
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}
	
	
	
} //end of Person class


class Employee extends Person
{
	int empid;
	int salary;
	
	public Employee() 
	{
		super(); // OPTIONAL
	}
	public Employee(String name, int age,int empid,int salary)
	{
		super(name, age); // COMPULSORY , if we wish to call parameterized constructor of super class
		this.empid=empid;
		this.salary=salary;
	}
	
	void disp() // overridden 
	{
		super.disp(); // call super class overridden method 
		System.out.println("Empid = "+this.empid+" Salary = "+this.salary);
	}
	
	@Override
	public String toString()  // Overridden method
	{
		return "Employee [empid=" + empid + "]"+ super.toString();
	}
	
	
	
} //end of Employee class



public class Day7_8 {

	public static void main(String[] args)
	{
		Employee e1 = new Employee();
		e1.disp();
		Employee e2 = new Employee("Akshita",36,1234,960000);
		e2.disp();
		System.out.println("E1 = "+e1);
		System.out.println("E2 = "+e2);
		

	}

}
