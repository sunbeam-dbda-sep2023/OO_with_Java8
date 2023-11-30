


/*
public class Demo1_1
{
    public static void main(String args[])
    {
        System.out.println("DBDA JAVA");
    }

}

*/

/*
// if we keep main as private
// Error: Main method not found
public class Demo1_1
{
    private static void main(String args[])
    {
        System.out.println("DBDA JAVA");
    }

}
*/

/*
// if we don't declare main as static 
//Error: Main method is not static
public class Demo1_1
{
    public void main(String args[])
    {
        System.out.println("DBDA JAVA");
    }

}

*/

/*
// java compile time error (javac type of error/ javac error)
// no .class file will be created

public class Demo1_1
{
    public static int main(String args[])
    {
        System.out.println("DBDA JAVA");
    }

}
*/

/*
// if we declare int as a return type with a return statement
//Error: Main method must return a value of type void
public class Demo1_1
{
    public static int main(String args[])
    {
        System.out.println("DBDA JAVA");
        return 1;
    }

}
*/

/*
//if we don't have main() defined inside the class
// Error: Main method not found
public class Demo1_1
{
    public static void main1(String args[])
    {
        System.out.println("DBDA JAVA");
    }

}

*/

/*
//if we don't write String args[]
//Error: Main method not found
public class Demo1_1
{
    public static void main()
    {
        System.out.println("DBDA JAVA");
    }

}

*/

// if we have empty main()
// it will compile and execute successfully
public class Demo1_1
{
    public static void main(String args[])
    {
    }
}