
public class Day12_12 {

	@SafeVarargs // Not actually safe!
	static void disp(int... arg)
	{	
		for(int i : arg)
			System.out.print(i+"\t");
		System.out.println();
	}
	public static void main(String[] args) {
		
			disp(10);
			disp(10,20);
			disp(10,20,30);
	}

}
