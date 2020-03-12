// Write a Java program to find if the given number is prime or composite.
import java.util.Scanner;

public class PrimeComposite
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
				System.out.println(num + " is prime number"); 
			}
			else if(flag> 2)  
			{
				System.out.println(num + " is not a prime number"); 
			}
			else
			{
				System.out.println(num + " is neither prime nor composite"); 
			}
			sc.close();
	    }		
}
