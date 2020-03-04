// Write a Program to accept two integers 
//as command line arguments and print the sum of the two numbers.
public class IntegerSum {
	//Driver Function
	public static void main(String[] args)
	{
		int sum=0;//initialize and declare
		for(int i=0;i<args.length;i++)
	    {
			sum= sum+ Integer.parseInt(args[i]);
	    } //end for
        System.out.println("Sum is " + sum); //print sum
    }	
}
