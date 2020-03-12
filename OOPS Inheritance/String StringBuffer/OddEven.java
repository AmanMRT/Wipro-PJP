//  Write a java program that accepts a string and 
// returns a new string without the first and 
// last character of the input string.

import java.util.Scanner;

public class OddEven 
{
	 static void firstHalf(String string)
	{
		int len = string.length();
		if((len % 2) == 0)
		{
			System.out.print(string.substring(0, len/2));
		}
		else
		{
			System.out.print("null");
		}
	}
	//Driver Function
	public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);
        
        // Input string
        String str = sc.nextLine();
        
        // function declaration
        firstHalf(str);
       
        sc.close();
	}
}
