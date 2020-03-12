// Get an input String from user and parse it to integer
import java.util.Scanner;

public class StringtoIntegerParse 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		// try block 
		try
		{
		// convert string input to integer 
		int num = Integer.parseInt(str);
		System.out.println("The square value is " + num * num);
		System.out.print("The work has been done successfully");
		
		}
		// catch the exception 
		catch(Exception e)
		{
			System.out.print("Entered input is not a valid format for an integer");
		}
		sc.close();
	}
}
