package p1;

import java.util.Scanner;

public class Employee 
{
	private int empid;
	private String name;
	private int age;
	private int salary;
	private String dept;
	
	Employee() 
	{
		
	}

	Employee(int empid, String name, int age, int salary, String dept)
	{
		
		this.empid = empid;
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.dept = dept;
	}

	int getEmpid() {
		return empid;
	}

	void setEmpid(int empid) {
		this.empid = empid;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	int getAge() {
		return age;
	}

	void setAge(int age) {
		this.age = age;
	}

	int getSalary() {
		return salary;
	}

	void setSalary(int salary) {
		this.salary = salary;
	}

	String getDept() {
		return dept;
	}

	void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [ID =" + this.empid + ", NAME =" + this.name + ", DEPT =" + this.dept + "]";
	}
	
	void accept()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name : ");
		this.name =sc.next();
		
		System.out.println("Enter your Age  : ");
		this.age =sc.nextInt();
		System.out.println("Enter your Department : ");
		this.dept =sc.next();
		System.out.println("Enter your empid  : ");
		this.empid =sc.nextInt();
		System.out.println("Enter your salary  : ");
		this.salary =sc.nextInt();
		
	}
	void disp()
	{
		System.out.println("Name = "+this.name+" ID = "+this.empid);
		System.out.println("Age = "+this.age);
		System.out.println("Salary = "+this.salary);
		System.out.println("Department  = "+this.dept);
			
	}
} // end of Employee class
