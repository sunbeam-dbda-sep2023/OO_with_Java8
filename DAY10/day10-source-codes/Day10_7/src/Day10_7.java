import java.util.ArrayList;
import java.util.Iterator;
// display the AL contents
//1. toString() 
//2. for each loop
//3 . simple for loop
//4 . iterator
// 5. list iterator 
import java.util.ListIterator;

public class Day10_7 {

	public static void main(String[] args) 
	{
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		System.out.println("Contents = "+al); // al.toString()
		
		System.out.println("Printing AL elements using for each loop");
		for(int i : al)
			System.out.print(i+"\t");
		
		System.out.println("\n Printing AL elements using simple for loop");
		for(int i=0;i<al.size();i++)
			System.out.print(al.get(i)+"\t");
		
		System.out.println("\n printing the AL elements using iterator");
		
		Iterator<Integer> itr = al.iterator(); // attach a iterator to ArrayList
		// itr reference of interface type
		while(itr.hasNext())
			System.out.print(itr.next()+"\t");
		
		
		System.out.println("\n printing the AL elements Forward Direction");
		ListIterator<Integer> ltr = al.listIterator();
		while(ltr.hasNext())
			System.out.print(ltr.next()+"\t");
		
		//System.out.println(ltr.next());// NoSuchElementException 
		
		System.out.println("\n printing the AL elements Reverse Direction");
		while(ltr.hasPrevious())
			System.out.print(ltr.previous()+"\t");
		
		//System.out.println(ltr.previous()); // NoSuchElementException 
		
		
		
	}

}
