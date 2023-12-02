class Student
{
	private int rn;
	private int age;
	String name;
	int marks;
	double per;
	
		
	public Student()
	{
		
	}
	


	public Student(int rn, int age, String name, int marks, double per)
	{
		this.rn = rn;
		this.age = age;
		this.name = name;
		this.marks = marks;
		this.per = per;
	}
	

 

	public int getRn() {
		return rn;
	}



	public void setRn(int rn) {
		this.rn = rn;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getMarks() {
		return marks;
	}



	public void setMarks(int marks) {
		this.marks = marks;
	}



	public double getPer() {
		return per;
	}



	public void setPer(double per) {
		this.per = per;
	}



	void disp()
	{
		System.out.println("Roll no = "+this.rn+" Age = "+this.age);
		System.out.println("Name = "+this.name+" Marks = "+this.marks);
		System.out.println("Percentage = "+this.per);
	}
}
public class Day3_12 {

	public static void main(String[] args)
	{
		Student s1 = new Student();
		s1.disp();
		System.out.println(s1.getRn());

	}

}
