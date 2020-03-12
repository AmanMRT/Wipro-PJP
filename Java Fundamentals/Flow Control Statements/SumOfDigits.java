// Write a program to print the sum of all the digits of a given number.
import java.util.Scanner;

public class SumOfDigits
{
	//Driver Function
	public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int rem,sum=0;//rem=remainder
        
        while(num!=0)
        {
        	rem=num%10; //give remainder
        	sum=sum+rem;
        	num=num/10;//decrease the number
        }
		System.out.println(sum); 
		sc.close();
    }
}
