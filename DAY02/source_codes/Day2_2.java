// Command line argument
// java Day2_6   45   20  
// args[0] = 45
// args[1] = 20

// Result = 65
public class Day2_2 
{
    public static void main(String[] args)
     {
        int n1=Integer.parseInt(args[0]);
        //  int  <==  String
        int n2=Integer.parseInt(args[1]);
        System.out.println("Result = "+(n1+n2));
	}
}