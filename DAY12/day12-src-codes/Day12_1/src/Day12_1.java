import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Day12_1 
{
	static Scanner sc = new Scanner(System.in);
	static String pathname = "File.dat";
	
	public static int menuList()
	{
		System.out.println("Enter Choice 0.Exit 1.Write 2.Read");
		return sc.nextInt();
	}
	
	
	public static void writeRecord()
	{
		FileOutputStream fos =null;
		try 
		{
			fos = new FileOutputStream(new File(pathname));
			byte data =123;
			fos.write(data);
			System.out.println("Data is written inside the file");
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			System.out.println("exception occured");
		}
		
	}
	public static void readRecord()
	{
		FileInputStream fis = null;
		
		try 
		{
			fis = new FileInputStream(pathname);
			byte data = (byte)fis.read();
			System.out.println("Data is read from the file = "+data);
			
		} 
		catch (FileNotFoundException e) 
		{
				e.printStackTrace();
		}
		catch(IOException e)
		{
			System.out.println("exception occured");
		}
		
	}
	
	
	
	
	public static void main(String[] args) 
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
