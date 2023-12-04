// override toString() from Object class inside Employee class

//toString() represents concise but informative representation that is easy
// for a person to read.
// It is recommended that all subclasses override this method.
// thats why we have overridden toString() inside Employee class
 // so whenever we print object of Employee class , it calls toString() from Employee class

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
	
	public String toString() 
	{
		return "Employee [empid=" + empid + ", name=" + name + "]";
	}
	
	//public String toString()  // overridden method 
	//{
		//return this.empid +" "+this.name;
	//}
	
	
	
	
}

public class Day4_3 {

	public static void main(String[] args) 
	{
		Employee e1 = new Employee(123,"Akshita",90000);
		//e1.disp();
		System.out.println(e1); // implicit call
		System.out.println();
		System.out.println(e1.toString()); // explicit call
		System.out.println();
		System.out.println(e1 instanceof Employee);
		//objectname instanceof classname
		
					
	}

}
