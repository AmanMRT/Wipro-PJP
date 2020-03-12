//  Given a string, return a new string made of 'n' copies of the 
// first 2 chars of the original string where 'n' is the length of the string.

import java.util.Scanner;

public class StringCopies
{
	 static void copies(String string)
	{
		int len = string.length();
		
		for(int i=0; i<len; i++)
		{
			// Takes only first two characters from the string
			System.out.print(string.substring(0, 2));
		}
	}
	//Driver Function
	public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);
        
        // Input string
        String str = sc.nextLine();
        
        // function declaration
        copies(str);
       
        sc.close();
	}

}
