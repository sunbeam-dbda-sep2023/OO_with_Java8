//if we write array traversing beyond range
// it will throw AIOOBE

/*
public class Day5_10 {

	public static void main(String[] args)
	{
		int a[]=new int[5];
		a[0]=11;
		a[1]=22;
		a[2]=33;
		a[3] = 44;
		a[4] = 55;
		
		System.out.println("Array elements ");
		for(int i=0;i<7;i++)  // Exception : AIOOBE 
			System.out.print(a[i]+"\t");
		
	}

}


*/




public class Day5_10 {

	public static void main(String[] args)
	{
		int a[]=new int[5];
		a[0]=11;
		a[1]=22;
		a[2]=33;
		a[3] = 44;
		a[4] = 55;
		
		System.out.println("Array elements simple for loop ");
		for(int i=0;i<5;i++)  
			System.out.print(a[i]+"\t");
		
	}

}



