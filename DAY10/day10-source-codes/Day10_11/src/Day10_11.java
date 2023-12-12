import java.util.Stack;

/*
public class Day10_11 {

	public static void main(String[] args) 
	{
		Stack<Integer> stk = new Stack<Integer>();
		stk.push(10);
		stk.push(20);
		System.out.println("Stack contents = "+stk);
		System.out.println("Top element in stack = "+stk.peek());
		stk.pop();
		System.out.println("Stack contents = "+stk);
		stk.pop();
		System.out.println("Stack contents = "+stk);
		System.out.println("is stack empty ? "+stk.isEmpty());
		

	}

}

*/



public class Day10_11 {

	public static void main(String[] args) 
	{
		Stack<Integer> stk = new Stack<Integer>();
		stk.push(10);  //5
		stk.push(20);  // 4
		stk.push(30);  // 3 
		stk.push(40);  // 2 
		stk.push(50);  // 1
		System.out.println("Stack = "+stk);
		System.out.println("Search = "+stk.search(40)); 
		// 1-based position (distance from the top element)
		System.out.println("Search = "+stk.search(20)); 
		System.out.println("Search = "+stk.search(88)); 
		
	}
}
