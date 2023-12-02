import java.util.Scanner;

// example based on parameterized constructor
// In this code we have defined parameterless and parameterized constructor 
// if we define more than one constructor in a single scope 
// then it is called as CONSTRUCTROR OVERLOADING 



class Employee
{
	String name;
	int empid;

	Employee() // parameterless constructor / user defined default constructor
	{
		this.name = "default";
		this.empid=1;
	}
	Employee(String name,int empid)
	{
		this.name = name;
		this.empid=empid;
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

public class Day3_7 {

	public static void main(String[] args) 
	{
		Employee e1 = new Employee(); //call to parameterless constructor  
		e1.disp(); // disp() is called upon e1 object
		
		Employee e2 = new Employee("Akshita",123);
		
		//call to parameterized constructor is done
		e2.disp();
		
		Employee e3 = new Employee();
		e3.disp();
			

	}

}
