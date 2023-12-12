import java.util.ArrayList;
import java.util.Scanner;

// ArrayList and Functions

public class Day10_2 
{
	static void acceptIntData(ArrayList<Integer> al)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter integer type of data");
		for(int i=0;i<5;i++)
			al.add(sc.nextInt());
	}
	
	
	static void acceptFloatData(ArrayList<Float> al)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter float type of data");
		for(int i=0;i<5;i++)
			al.add(sc.nextFloat());
	}
	
	static void acceptDoubleData(ArrayList<Double> al)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter double type of data");
		for(int i=0;i<5;i++)
			al.add(sc.nextDouble());
	}
	
	static void acceptStringData(ArrayList<String> al)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string type of data");
		for(int i=0;i<5;i++)
			al.add(sc.next());
	}
	
	
	
	static void dispIntData(ArrayList<Integer> al)
	{
		//for(int i:al)
			//System.out.print(i+"\t");
		System.out.println("Contents are  = "+al);
	}
	
	static void dispFloatData(ArrayList<Float> al)
	{
		//for(float i:al)
			//System.out.print(i+"\t");
		System.out.println("Contents are  = "+al);
	}
	
	static void dispDoubleData(ArrayList<Double> al)
	{
		//for(double i:al)
			//System.out.print(i+"\t");
		System.out.println("Contents are  = "+al);
	}
	
	static void dispStringData(ArrayList<String> al)
	{
		//for(String i:al)
			//System.out.print(i+"\t");
		System.out.println("Contents are  = "+al);
	}
	
	public static void main(String[] args) 
	{
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		ArrayList<Float> a2 = new ArrayList<Float>();
		ArrayList<Double> a3 = new ArrayList<Double>();
		ArrayList<String> a4 = new ArrayList<String>();
		
		acceptIntData(a1);
		acceptFloatData(a2);
		acceptDoubleData(a3);
		acceptStringData(a4);
		
		System.out.println("Elements are :");
		dispIntData(a1);
		System.out.println();
		dispFloatData(a2);
		
		System.out.println();
		dispDoubleData(a3);
		
		System.out.println();
		dispStringData(a4);
		
	}

}
