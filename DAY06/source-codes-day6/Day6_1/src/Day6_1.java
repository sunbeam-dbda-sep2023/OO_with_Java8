import java.util.Arrays;
// Array of references and array of objects 
class Date
{
	int dd;
	int mm;
	int yy;
	
	public Date() 
	{
		
	}

	public Date(int dd, int mm, int yy) 
	{
		
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}

	@Override
	public String toString() {
		return "Date [dd=" + this.dd + ", mm=" + this.mm + ", yy=" + this.yy + "]";
	}
		
} //end of Date class

class Student
{
	int rn;
	int marks;
	Date d1; // ASSOCIATION
	
	Student()
	{
		
	}
	Student(int rn,int marks,Date d1)
	{
		this.rn=rn;
		this.marks=marks;
		this.d1 =d1;
	}
	@Override
	public String toString() {
		return "Student [rn=" + this.rn + ", marks=" + this.marks + ", d1=" + this.d1.toString() + "]";
	}
	

}
public class Day6_1 {

	public static void main(String[] args) 
	{
		Student s[]=new Student[3];
		System.out.println(Arrays.toString(s));
		//System.out.println(s[0]); // null
		//System.out.println(s[0].toString()); // NPE
		
		//s[0]= new Student();
		//System.out.println(s[0].toString());
		
		s[0] = new Student(123,85,new Date(6,12,2023));
		s[1] = new Student(456,90,new Date(7,12,2023));
		s[2] = new Student(789,95,new Date(8,12,2023));
		System.out.println(s[0].toString());
		System.out.println(s[1].toString());
		System.out.println(s[2].toString());
		System.out.println();
		for(Student stud : s)
			System.out.println(stud.toString());
		
		System.out.println();
		System.out.println(Arrays.toString(s));


	}

}
