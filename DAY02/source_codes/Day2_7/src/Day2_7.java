// command line arguments from user
// Akshita  Sunbeam   dbda-CoreJava 1234       36
// args[0]   args[1]   args[2]       args[3] args[4]
// Name : Akshita
// Org : Sunbeam
// Course : dbda-CoreJava
// empcode : 1234
// Age = 36

public class Day2_7 {

	public static void main(String[] args)
	{
		String name = args[0];
		String org= args[1];
		String course = args[2];
		int empcode = Integer.parseInt(args[3]);
		int age = Integer.parseInt(args[4]);
		System.out.println("Name = "+name+ "Age = "+age);
		System.out.println("Organization = "+org +" EMPCODE = "+empcode);
		System.out.println("Course = "+course);
		

	}

}
