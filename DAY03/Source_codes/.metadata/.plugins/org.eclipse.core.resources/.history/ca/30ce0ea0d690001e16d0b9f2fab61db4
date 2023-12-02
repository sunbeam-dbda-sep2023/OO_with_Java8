import java.util.Scanner;

// example based on user defined default Constructor / Parameterless constructor


class Employee
{
	String name;
	int empid;

	Employee() // parameterless constructor / user defined default constructor
	{
		this.name = "default";
		this.empid=1;
	}
	void accept()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name : ");
		this.name = sc.next();
		
		System.out.println("Enter empid : ");
		this.empid = sc.nextInt();
	}	
	void disp()
	{
		System.out.println("Name = "+this.name+" Empid = "+this.empid);
	}
}

public class Day3_6 {

	public static void main(String[] args) 
	{
		Employee e1 = new Employee();
		//as soon as object is created , constructor gets called implicitely
		//e1 object is created without passing any parameters to it
		// so , it will call automatically,
		// parameterless constructor / user defined default constructor
		// IMPLICIT CALL 
		// Constructor call is always implicit call 
		
		
		
		e1.disp(); // disp() is called upon e1 object
		// EXPLICIT CALL 
		e1.accept();
		e1.disp();
		

	}

}
