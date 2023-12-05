// equals() methods and hashcode
// == operator ==> reference equality

//equals() method is called from Object class 
// this method returns true if and only if x and y refer to the same object
// (x == y has the value true).
// Object class equals() first checks the reference equality
// in this example equals() is not overridden inside Employee class




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
	

	
}

public class Day4_4 {

	public static void main(String[] args) 
	{
		Employee e1 = new Employee(123,"emp1",90000);
		Employee e2 = new Employee(456,"emp2",80000);
		Employee e3 = new Employee(123,"emp1",90000);
		Employee e4 = e1;
		
		System.out.println("E1 == E2 "+(e1==e2));
		System.out.println("E1 == E3 "+(e1==e3));
		System.out.println("E1 == E4 "+(e1==e4));
		
		System.out.println("E1 equals E2 "+e1.equals(e2));
		// e1.equals(e2)
		// equals() is called
		// by passing e2 as an object as a parameter
		// equals() is called upon e1 object ==> this===> e1 
		//equals() will be called from Object class
		System.out.println("E1 equals E3 "+e1.equals(e3));
		System.out.println("E1 equals E4 "+e1.equals(e4));
		
		
		
		
		
					
	}

}