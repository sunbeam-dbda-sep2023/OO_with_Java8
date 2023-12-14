import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

// BR and BW


public class Day12_9 
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
		 try(BufferedWriter bw = new BufferedWriter(new FileWriter(new File(pathname)));)
		{
			for(char ch ='A';ch<'Z';ch++)
				bw.write(ch);
			System.out.println("Data is written inside the file");
		} 
				
	}
	public static void readRecord() throws FileNotFoundException, IOException
	{
		try(BufferedReader bis = new BufferedReader(new FileReader(new File(pathname)));)
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
