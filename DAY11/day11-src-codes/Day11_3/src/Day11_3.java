import java.util.HashSet;
import java.util.Objects;

// Hashset of Employee class

class Employee
{
	String name;
	int id;
	
	Employee(String name,int id)
	{
		this.name=name;
		this.id=id;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + "]";
	}

	@Override
	public int hashCode()
	{
		
		System.out.println("Inside hashcode method");
		int hashcode = 0;
		hashcode = this.id;
		hashcode += name.hashCode();
		return hashcode;
	}

	@Override
	public boolean equals(Object obj)
	{
		System.out.println("Inside equals method");
	
		if(obj instanceof Employee)
		{
			Employee temp = (Employee)obj;
			return (temp.name.equals(this.name) && temp.id == this.id);
		}
		else
		{
			return false;
		}
	}

	
}


/*
public class Day11_3 {

	public static void main(String[] args) 
	{
		
		HashSet<Employee> hs = new HashSet<Employee>();
		hs.add(new Employee("Akshita",123));
		hs.add(new Employee("emp",456));
		hs.add(new Employee("Akshita",123));
		
		for(Employee e : hs)
			System.out.println(e);
	}

}
*/


public class Day11_3 {

	public static void main(String[] args) 
	{
		
		HashSet<Employee> hs = new HashSet<Employee>();
		Employee e1 = new Employee("Akshita",123);
		Employee e2 = new Employee("Akshita",123);
		Employee e3 = new Employee("EMP",456);
		
		hs.add(e1);
		hs.add(e2);
		hs.add(e3);
		System.out.println(hs);
		
		
	}
}
