// final methods 

// if method is declared as final
// we can not override that method in sub class

class Person
{
	final void disp()
	{
		
	}
}

class Employee extends Person
{
	void disp() // overridden method is not allowed , disp() is declared as final
	{
		
	}
}



public class Day4_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
