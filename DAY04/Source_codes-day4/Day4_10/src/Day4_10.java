
// Final classes can not be inherited further


/*
// class A is non final class
// so non final class can be inherited 
class A
{
	
}
class B extends A
{
	
}

public class Day4_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}


*/

// final class A

final class A
{
	
}
class B extends A // javac error , can not inherit final class
{
	
}

public class Day4_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
