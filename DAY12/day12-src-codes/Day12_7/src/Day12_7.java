import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

// OOS and OIS
// serialization and deserialization

class Employee implements Serializable
{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String name;
	int id;
	float salary;
	
	Employee()
	{
		
	}
	
	Employee(String name,int id,float salary)
	{
		this.name=name;
		this.id=id;
		this.salary=salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", salary=" + salary + "]";
	}

	
	

} //end of employee class

public class Day12_7 
{
	static Scanner sc = new Scanner(System.in);
	static String pathname = "Demo.dat";
	
	public static int menuList()
	{
		System.out.println("Enter Choice 0.Exit 1.Write 2.Read");
		return sc.nextInt();
	}
	
	
	public static void writeRecord() throws FileNotFoundException, IOException
	{
		try(ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(new File(pathname))));)
		 {
			Employee e1 = new Employee("emp1",123,90000);
			Employee e2 = new Employee("emp2",343,80000);
			Employee e3 = new Employee("emp3",345,85000);
			Employee e4 = new Employee("emp4",987,70000);
			
			ArrayList<Employee> al = new ArrayList<Employee>();
			al.add(e1);
			al.add(e2);
			al.add(e3);
			al.add(e4);
			
			oos.writeObject(al);
			System.out.println("Data is written inside the file");
		} 
				
	}
	public static void readRecord() throws FileNotFoundException, IOException, ClassNotFoundException
	{
		try(ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(new File(pathname))));)
		 {
			
			ArrayList<Employee> e= (ArrayList<Employee>) ois.readObject();
			
			for(Employee emp : e)
				System.out.println(emp);
			
		 }
		
	}
	
	
	
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException 
	{
		int choice;
		while((choice = menuList())!=0)
		{
			switch(choice)
			{
			case 1:
				writeRecord();
				break;
			case 2:
				readRecord();
			break;
			}
		}
	}
	


}
