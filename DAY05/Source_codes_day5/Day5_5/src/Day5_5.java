//valid and invalid declarations in an array
public class Day5_5 {

	public static void main(String[] args) 
	{
		int a1[] = null; // valid 
		int a2[] = new int[5];  // valid
		int []a3 = new int[4]; // valid 
		//int a4[] = new int[-6]; // invalid  //NegativeArraySizeException
		int a5[]= new int[]{1,2,3};
		//int a6[] = new int {10,20,30,40,50} ; //invalid 
		int a7[]; //declaration
		a7 = new int[8];
		float a8[] = new float[2];
		
		
		
	}

}
