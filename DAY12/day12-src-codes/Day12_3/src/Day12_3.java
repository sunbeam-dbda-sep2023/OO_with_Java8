import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

// BOS and BIS


public class Day12_3 
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
		 try(BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(new File(pathname)));)
		{
			for(char ch ='A';ch<'Z';ch++)
				bos.write(ch);
			System.out.println("Data is written inside the file");
		} 
				
	}
	public static void readRecord() throws FileNotFoundException, IOException
	{
		try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream(new File(pathname)));)
		{
			int data;
			while((data = bis.read())!=-1)
				System.out.print((char)data+"\t");
			
			
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
