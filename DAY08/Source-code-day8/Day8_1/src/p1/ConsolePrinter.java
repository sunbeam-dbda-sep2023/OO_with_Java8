package p1;

//can implemented class can access the fields of interface directly?? YES


public class ConsolePrinter implements Printer
{

	@Override
	public void print(String msg) 
	{
		System.out.println("Inside Console Printer Print method = "+msg);
		System.out.println("Accessing the data field directly = "+data);
	}
	

}
