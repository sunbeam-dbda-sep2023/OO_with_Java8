import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

// FIS and FOS

public class Day12_2 
{
	static Scanner sc = new Scanner(System.in);
	static String pathname = "Demo.dat";
	
	public static int menuList()
	{
		System.out.println("Enter Choice 0.Exit 1.Write 2.Read");
		return sc.nextInt();
	}
	
	
	public static void writeRecord() throws FileNotFoundException, IOException
	{
		 
		try(FileOutputStream fos = new FileOutputStream(new File(pathname));)
		{
			fos.write(123);
			System.out.println("Data is written inside the file");
		} 
				
	}
	public static void readRecord() throws FileNotFoundException, IOException
	{
		try(FileInputStream fis = new FileInputStream(new File(pathname));)
		{
			
			byte data = (byte)fis.read();
			System.out.println("Data is read from the file = "+data);
			
		} 
	}
	
	
	
	
	public static void main(String[] args) throws FileNotFoundException, IOException 
	{
		int choice;
		while((choice = menuList())!=0)
		{
			switch(choice)
			{
			case 1:
				writeRecord();
				break;
			case 2:
				readRecord();
			break;
			}
		}
	}
	


}
