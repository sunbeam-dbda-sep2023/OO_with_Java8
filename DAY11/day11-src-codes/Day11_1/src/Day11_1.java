import java.util.PriorityQueue;

public class Day11_1 {

	public static void main(String[] args) 
	{
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		pq.offer(25);
		pq.offer(35);
		pq.offer(15);
		pq.offer(45);
		pq.offer(23);
		pq.offer(35);
		System.out.println("PQ Elements are = "+pq);
	}

}
