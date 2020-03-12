// Write a Java program to find if the given number is palindrome or not

import java.util.Scanner;

public class Palindrome 
{
	//Driver Function
	public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int rem,rev=0;//rem= remainder, rev=reverse
        int temp=num;
        
        while(num!=0)
        {
        	rem=num%10; //give remainder
        	rev=rev*10+rem;
        	num=num/10;//decrease the number
        }
        
        if(temp==rev)
        {
        	System.out.println(temp+" is a palindrome");
        }
        else
        {
        	System.out.println(temp + " is not a palindrome");

        }
		sc.close();
    }
}
