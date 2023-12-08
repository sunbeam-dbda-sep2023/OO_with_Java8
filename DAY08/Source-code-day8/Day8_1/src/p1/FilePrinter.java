package p1;

public class FilePrinter implements Printer
{

	@Override
	public void print(String msg) 
	{
		System.out.println("Inside File Printer class = "+msg);
	}	
	
}
