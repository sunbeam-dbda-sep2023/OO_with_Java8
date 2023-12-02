class Employee
{
	private int empid;
	private String name;
	
	Employee() // parameterless constructor 
	{
		this.empid=1;
		this.name = "default";
	}
	Employee(int empid, String name) // paramatrized constructor 
	{
		this.empid = empid;
		this.name=name;
	}
	  
	int getEmpId() // getter 
	{
		return this.empid;
	}
	
	String getName() // getter 
	{
		return this.name;
	}
	
	//void setEmpId(int empid) // setter  [optional]
	//{
		//this.empid = empid;
	//}
	
	void setName(String name) // setter 
	{
		this.name = name;
	}
	
	void disp() // facilitator
	{
		System.out.println("ID = "+this.empid+" Name = "+this.name);
	}
}
public class Day3_11 {

	public static void main(String[] args)
	{
		Employee e1 = new Employee();
		System.out.println("Name of employee e1 = "+e1.getName());
		e1.setName("Akshita");
		System.out.println("E1 name has been set as  = "+e1.getName());
		

	}

}
