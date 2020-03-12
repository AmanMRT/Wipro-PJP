// Write a program to print first 5 values which are divisible by 2, 3, and 5.
import java.util.Scanner;

public class Divisible 
{
	//Driver Function
		public static void main(String[] args)
	    {
	        Scanner sc=new Scanner(System.in);
	        int num=sc.nextInt();
	        int count=0;
	        for(int i=1;i<=num;i++)
	        {
		        if(((i%2)== 0) && ((i%3)== 0) && ((i%5)==0))
		        {
		        	count++;
					System.out.print(i+" "); 
			        if(count==5)
			        {
			        	break;
			        }
		        }
	        }
	        sc.close();
	    }
}
