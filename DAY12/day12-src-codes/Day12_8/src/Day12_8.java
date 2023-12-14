
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


// FR and FW 

public class Day12_8 
{
	static Scanner sc = new Scanner(System.in);
	static String pathname = "MyFile.txt";
	
	public static int menuList()
	{
		System.out.println("Enter Choice 0.Exit 1.Write 2.Read");
		return sc.nextInt();
	}
	
	
	public static void writeRecord() throws FileNotFoundException, IOException
	{
		 
		try(FileWriter fw = new FileWriter(new File(pathname));)
		{
			fw.write(123);
			System.out.println("Data is written inside the file");
		} 
				
	}
	public static void readRecord() throws FileNotFoundException, IOException
	{
		try(FileReader fr = new FileReader(new File(pathname));)
		{
			
			byte data = (byte)fr.read();
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
