class Employee
{
	int empid;
	String name;
	
	Employee()
	{
		this.empid=1;
		this.name="default";
	}
	void disp()
	{
		System.out.println("Empid = "+this.empid+" Name  = "+this.name);
	}
}
public class Day3_13 
{

	public static void main(String[] args) 
	{
		Employee eobj = new Employee();
		System.out.println("EOBJ = "+eobj);  
		// implicit call to a method
		// toString()
		// currently we have not implemented toString() inside Employee class
		// so it will search toString() in Object class
		// Object class toString() represents
		// getClass().getName() + '@' + Integer.toHexString(hashCode())
		
		System.out.println("Eobj toString = "+eobj.toString()); // Explicit call
		// whenever we print the object
		// it gives a  call to toString() 
		// it displays the data
		//

	}

}
