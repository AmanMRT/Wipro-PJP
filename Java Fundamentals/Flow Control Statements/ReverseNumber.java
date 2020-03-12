// Write a program to reverse a given number and print

import java.util.Scanner;

public class ReverseNumber 
{	
	//Driver Function
	public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int rem,rev=0;//rem= remainder, rev=reverse
        while(num!=0)
        {
        	rem=num%10; //give remainder
        	rev=rev*10+rem;
        	num=num/10;//decrease the number
        }
    	System.out.println(rev);
		sc.close();
    }

}
