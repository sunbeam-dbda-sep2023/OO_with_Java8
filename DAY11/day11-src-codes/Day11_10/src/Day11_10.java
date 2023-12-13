import java.io.File;
import java.io.IOException;

// fetch the meta data of the file

public class Day11_10 {

	public static void main(String[] args) throws IOException 
	{
		File fobj= new File("C:/Users/sunbeam/Desktop/Code/DAY11/Day11_9/src/Day11_9.java");
		System.out.println("Exists ?? "+fobj.exists());
		System.out.println("Get absolute path = "+fobj.getAbsolutePath());
		System.out.println("Get canonical path = "+fobj.getCanonicalPath());
		System.out.println("Get path = "+fobj.getPath());
		System.out.println("Get Name = "+fobj.getName());
		System.out.println("Get Parent Name = "+fobj.getParent());
		System.out.println("is directory ?? "+fobj.isDirectory());
		System.out.println("is file ?? "+fobj.isFile());
		System.out.println("is hidden ?? "+fobj.isHidden());
		System.out.println("Length = "+fobj.length());
		
		
	}

}
