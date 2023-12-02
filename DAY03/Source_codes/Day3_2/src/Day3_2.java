import java.util.Scanner;
// NullPointerException(NPE)
//when an application attempts to use null in a case,
//where an object is required.
// Calling the instance method of a null object.
// Accessing or modifying the field of a null object.

class Employee
{
	
	String name; // field
	int id; // field 
	int salary; //field 
	
	void accept() // instance method 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name : ");
		name = sc.next();
		System.out.println("Enter ID : ");
		id = sc.nextInt();
		System.out.println("Enter Salary : ");
		salary = sc.nextInt();
	}
	void disp() //instace method 
	{
		System.out.println("Name = "+name+" Id = "+id+" Salary = "+salary);
	}
}


public class Day3_2 {

	public static void main(String[] args) 
	{
		//Employee e1; // uninitialized // local reference variable
		// e1.disp(); // javac error 
		
		//Employee e2 = null; // null reference / null object / initialized
		//e2 = new Employee();
		//e2.disp();
		
		Employee e3=null;
		//e3.accept(); // NullPointerException
		// accept() is called upon e3 object
		// e3 object is null object / e3 is null reference
		
		e3.disp(); // NullPointerException
		
	
	}

}

