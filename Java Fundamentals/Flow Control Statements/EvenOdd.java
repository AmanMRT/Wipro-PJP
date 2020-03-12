//program to check a number is an Even or Odd.
import java.util.Scanner;
public class EvenOdd 
{
	//function implementation
	static void check(int number)
	{
		if((number % 2) == 0)
        {
        	System.out.println(number +" is Even");
        }
        else
        {
        	System.out.println(number +" is Odd");
        }
	}
	//Driver Function
	public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        //function declaration
        check(num);
        sc.close();
    }   
}
