import java.util.ArrayDeque;

/*
public class Day10_14 {

	public static void main(String[] args) 
	{
		ArrayDeque<Integer> q = new ArrayDeque<Integer>();
		q.add(10);
		q.add(20);
		q.add(30);
		System.out.println("Elements ="+q +" Element = "+q.element());
		q.remove();
		System.out.println("Elements ="+q);
		q.remove();
		q.remove();
		System.out.println("Elements ="+q);
		//q.remove();
		System.out.println("element = "+q.element());
		
		
	}

}

*/

public class Day10_14 {

	public static void main(String[] args) 
	{
		ArrayDeque<Integer> q = new ArrayDeque<Integer>();
		q.offer(80);
		q.offer(90);
		q.offer(120);
		System.out.println("Elements ="+q +" Element = "+q.peek());
		q.poll();
		System.out.println("Elements ="+q);
		q.poll();
		q.poll();
		System.out.println("Elements ="+q);
		//System.out.println(q.poll()); // null
		System.out.println(q.peek()); // null 
		
	}

}
