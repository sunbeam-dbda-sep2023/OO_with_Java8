import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

// DOS and DIS


public class Day12_4 
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
		try(DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(new File(pathname))));)
		 {
			dos.writeUTF("Akshita");
			dos.writeInt(36);
			dos.writeFloat((float) 90000.5);
			System.out.println("Data is written inside the file");
		} 
				
	}
	public static void readRecord() throws FileNotFoundException, IOException
	{
		try(DataInputStream dis = new DataInputStream(new BufferedInputStream(new FileInputStream(new File(pathname))));)
		 {
			String name = dis.readUTF();
			int age = dis.readInt();
			float f1 = dis.readFloat();
			System.out.println("Name = "+name+" Age = "+age+" Salary = "+f1);
			
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
