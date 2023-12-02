import java.util.Scanner;
// Association
// Employee has-a dob 
// has-a relationship is called as association
// by creating object of one class inside the body of another class
class Date
{
	int dd;
	int mm;
	int yy;
	
	void disp_data()
	{
		System.out.println("DD = "+dd+" MM = "+mm+" YY = "+yy);
	}
}
class Employee
{
	
	String name; // field
	int id; // field 
	int salary; //field 
	Date dob = new Date(); // field // reference of Date class
	
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
	void disp() //instance method 
	{
		System.out.println("Name = "+name+" Id = "+id+" Salary = "+salary+" dob = "+dob);
		dob.disp_data();
	}
}


public class Day3_3 {

	public static void main(String[] args) 
	{
		
		Employee e1 = new Employee();
		e1.disp();
		
		
	
	}

}

