import java.util.HashMap;
import java.util.Map;

class Student
{
	private int roll;
	private String name;
	private double marks;
	public Student(int roll, String name, double marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + "]";
	}
	
	
} // end of Student class

public class Day14_5
{

	public static void main(String[] args)
	{
		Map<Integer, Student> m = new HashMap<>();
		Student s ;
		s=new Student(1,"st6",85);
		m.put(s.getRoll(), s);
		
		s = new Student(2,"st2",75);
		m.put(s.getRoll(), s);
		
		s = new Student(3,"st8",90);
		m.put(s.getRoll(), s);
		
		
		s = new Student(4,"st4",83);
		m.put(s.getRoll(), s);
		
		
		s = new Student(5,"st9",78);
		m.put(s.getRoll(), s);
		
		System.out.println(m);
		
		System.out.println();
		System.out.println("Sorting based on name using stream ");
		m.values().stream()
		.sorted((s1,s2) -> s1.getName().compareTo(s2.getName()))
		.forEach(System.out::println);
		
		
		System.out.println();
		System.out.println("Sorting based on marks using stream ");
		m.values().stream()
		.sorted((s1,s2) -> Double.valueOf(s1.getMarks()).compareTo(s2.getMarks()))
				.forEach(System.out::println);

	}

}