//program to check number is positive, negative or zero.
import java.util.Scanner;
public class CheckNumber
{
	static void check(int num)
	{
		if(num > 0)//positive
        {
        	System.out.println(num +" is Positive");
        }
        else if(num==0)//zero
        {
        	System.out.println(num +" is Zero");
        }
        else//Negative
        {
        	System.out.println(num +" is Negative");
        }	
	}
	//Driver Function
	public static void main(String[] args)
    {
		//user input
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        sc.close();
        check(number);
    }
}
