import java.util.ArrayList;

public class Day10_8 {

	public static void main(String[] args) {
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(40);
		a1.add(50);
		System.out.println("A1 = "+a1);
		
		ArrayList<Integer> a2 = a1; // reference copy
		System.out.println("A2 = "+a2);
		a1.add(60);
		System.out.println("A1 = "+a1+" A2 = "+a2);
		a2.add(70);
		System.out.println("A1 = "+a1+" A2 = "+a2);
		
		ArrayList<Integer>a3 = (ArrayList<Integer>) a1.clone(); // Downcasting
		System.out.println("A1 = "+a1+" A3 = "+a3);
		a1.add(999);
		System.out.println("A1 = "+a1+" A3 = "+a3);
		a3.add(7777);
		System.out.println("A1 = "+a1+" A3 = "+a3);
		
		System.out.println(a3.get(3));
		
		
	}

}