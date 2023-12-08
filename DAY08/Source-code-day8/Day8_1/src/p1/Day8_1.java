package p1;

/*
public class Day8_1 {

	public static void main(String[] args)
	{
		NetworkPrinter np = new NetworkPrinter();
		np.print("10pages");
		np.m1();
		
		ConsolePrinter cp = new ConsolePrinter();
		cp.print("15pages");
		
		FilePrinter fp = new FilePrinter();
		fp.print("20Pages");
	}

}
*/

// CAN WE CREATE A REFERENCE OF INTERFACE TYPE? yes
// REFERENCE OF INTERFACE TYPE CAN HOLD ==> OBJECT OF IMPLEMENTED CLASS


/*
public class Day8_1 {

	public static void main(String[] args)
	{
		//Printer pr = new Printer(); // javac error
		
		Printer pr = new NetworkPrinter();
		pr.print("50pages");
		System.out.println();
		pr = new ConsolePrinter();
		pr.print("35 pages");
		System.out.println();
		pr = new FilePrinter();
		pr.print("45 pages");
		System.out.println();
		
	}
}
*/

// pr is array of references of interface type Printer
// CAN WE CREATE ARRAY OF REFERENCES OF INTERFACE TYPE ? YES

public class Day8_1 {

	public static void main(String[] args)
	{
		
		Printer pr[]= {new NetworkPrinter(),new ConsolePrinter(),new FilePrinter()};
		// pr[0] = new NetworkPrinter()
		// pr[1] = new ConsolePrinter()
		// pr[2] = new FilePrinter()
		for(Printer p : pr)
			p.print("Sunbeam");
		
		
		
		
	}
}



