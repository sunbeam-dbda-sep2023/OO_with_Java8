// getClass() and toString()

/*
public class Day5_14 {

	public static void main(String[] args) 
	{
		Integer i[]=new Integer[5];
		int arr[]=new int[5];
		System.out.println("I = "+i+ " toString = "+i.toString());
		System.out.println("Get class = "+i.getClass());
		System.out.println();
		System.out.println("ARR = "+arr+ " toString = "+arr.toString());
		System.out.println("Get class = "+arr.getClass());

	}

}
*/


/*
public class Day5_14 {

	public static void main(String[] args) 
	{
		Integer i[]=new Integer[] {1,2,3,4,5};
		int arr[]=new int[] {11,22,33,44};
		
		// i ==> Integer ==> Reference ==> NP 
		// while displaying the data==> value ==> P 
		// NP to P conversion ===> AUTO UNBOXING
		
		for(Integer element : i)
			System.out.print(element+"\t");
		System.out.println();
		
		// arr ==> int==> value ==> P
		for(int ele : arr)
			System.out.print(ele+"\t");
	}
}
*/
