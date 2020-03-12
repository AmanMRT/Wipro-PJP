//Given a string and an integer n, print a new string made of n repetitions of the last n characters of the string.

import java.util.Scanner;

public class Repetations 
{
	static void copies(String string, int num)
	{		
		for(int i=0; i<num; i++)
		{
			// Takes only last n characters from the string
			System.out.print(string.substring(string.length() - num));
		}
	}
	//Driver Function
	public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);
        
        // Input string
        String str = sc.nextLine();
        int n = sc.nextInt();
        
        // function declaration
        copies(str, n);
       
        sc.close();
	}
}
