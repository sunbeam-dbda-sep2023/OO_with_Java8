import java.util.Scanner;

// example based on default Constructor 
// If a class does not have any constructor 
//then the compiler will give a call to DEFAULT CONSTRUCTOR
// to initialize the fields of the class

//constructor is used to initialize the object


class Employee
{
	String name;
	int empid;

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

public class Day3_5 {

	public static void main(String[] args) 
	{
		Employee e1 = new Employee();
		e1.disp();
		

	}

}
