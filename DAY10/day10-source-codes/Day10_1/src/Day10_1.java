import java.util.ArrayList;

public class Day10_1 {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		System.out.println("Size = "+al.size());
		
		// sample data
		int data[]= {10,20,25,45,12,78,98,46,33,77};
		
		// add all the elements from an array to ArrayList
		
		for(int i : data) // int ==> P type  data ==> P Type ==> Implicit conversion is done?? NO
			al.add(i); // i==> P type   //add(i) ==> NP type 
		// int to Integer ==> implicitly ==>  AutoBoxing
		
		System.out.println("Array list contents AL = "+al);
		// al.toString() 
		
		ArrayList<Integer> a2 = new ArrayList<Integer>();
		a2.addAll(al);
		System.out.println("Array list contents A2 = "+a2);
		
		

	}

}
