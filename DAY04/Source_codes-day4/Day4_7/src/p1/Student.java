package p1;

public class Student 
{
	int rn;
	int marks;

	public Student()
	{
		
	}
	public Student(int rn,int marks)
	{
		this.rn=rn;
		this.marks=marks;
	}
	
	public String toString()
	{
		return "Roll no = "+this.rn+" Marks = "+this.marks;
	}
	
}
