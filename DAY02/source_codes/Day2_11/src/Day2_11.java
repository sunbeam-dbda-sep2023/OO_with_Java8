import java.util.Scanner;


/*
public class Day2_11 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your name : ");
		String name = sc.nextLine();
		System.out.println("Enter emp id :");
		int empid = sc.nextInt();
		System.out.println("Enter age : ");
		int age = sc.nextInt();
		System.out.println("Enter dept id : ");
		int deptid = sc.nextInt();
		System.out.println(name+empid+age+deptid);
		System.out.println(name+"\t"+empid+"\t" + age +"\t"+deptid);
		
	}

}
*/


/*
public class Day2_11 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n1,n2,n3;
		System.out.println("Enter First number : ");
		n1 = sc.nextInt();
		System.out.println("Enter Second number : ");
		n2 = sc.nextInt();
		System.out.println("Enter Third number : ");
		n3 = sc.nextInt();
		System.out.println(n1+" "+n2+" "+n3);
		System.out.println(n3+" "+n1+" "+n2);
	
	}
}


*/


/*
public class Day2_11 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n1,n2,n3;
		System.out.println("Enter First number : ");
		n1 = sc.nextInt();
		System.out.println("Enter Second number : ");
		n2 = sc.nextInt();
		System.out.println("Enter Third number : ");
		n3 = sc.nextInt();
		
		System.out.printf("%7d %7d %7d",n1,n2,n3);
		System.out.println();
		System.out.printf("%7d %7d %7d",n2,n1,n3);
		System.out.println();
		System.out.printf("%7d %7d %7d",n3,n2,n1);
		System.out.println();
		System.out.printf("%-7d %-7d %-7d",n1,n2,n3);
		System.out.println();
		System.out.printf("%-7d %-7d %-7d",n2,n1,n3);
		System.out.println();
		System.out.printf("%-7d %-7d %-7d",n3,n2,n1);
	}
}

*/



public class Day2_11 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first floating number ");
		float f1 = sc.nextFloat();
		System.out.println("Enter second floating number ");
		float f2 = sc.nextFloat();
		System.out.println("F1 = "+f1+" F2 = "+f2);
		System.out.println();
		System.out.printf("%8.2f %9.3f",f1,f2);
		System.out.println();
		System.out.printf("%-8.2f %-9.3f",f2,f1);
	}
}

