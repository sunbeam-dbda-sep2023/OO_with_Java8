import java.util.ArrayList;

class Student
{
	int rn;
	int marks;
	Student()
	{
		
	}
	Student(int rn,int marks)
	{
		this.rn=rn;
		this.marks=marks;
	}

	public String toString()
	{
		return "Roll no "+this.rn+" Marks = "+this.marks;
	}
}
public class Day10_9 {

	public static void main(String[] args)
	{
		Student s1 = new Student(1,90);
		Student s2 = new Student(2,80);
		Student s3 = new Student(3,75);
		Student s4 = new Student(4,95);
		Student s5 = new Student(5,83);
		
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		al.add(s5);
		
		for(Student st : al)
			System.out.println(st);
		
		System.out.println("Contains = "+al.contains(s2));
		System.out.println("Remove one object s2 "+al.remove(s2));
		System.out.println("After deleting s2 object");
		for(Student st : al)
			System.out.println(st);
		
	}

}
