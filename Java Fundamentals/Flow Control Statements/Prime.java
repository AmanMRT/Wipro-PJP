// Write a program to check if a given number is prime or not.
import java.util.Scanner;

public class Prime 
{
	//Driver Function
	public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int flag=0;
        
		for (int i=2;i<=num;i++)
		{
			//prime condition
			if((num % i) == 0)
			{
				flag++;
			}
		}
		//chevk if flag value is 1 or not
		if(flag==1)
		{
			System.out.println(num + " is prime"); 
		}
		else
		{
			System.out.println(num + " is not prime"); 

		}
		sc.close();
    }		
}
