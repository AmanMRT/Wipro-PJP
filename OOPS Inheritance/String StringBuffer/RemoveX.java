// Given a string, if the first or last chars are 'x', 
// return the string without those 'x' chars, otherwise return the string unchanged. 

import java.util.Scanner;

public class RemoveX 
{
	static void remove(String string)
	{
		if(string.startsWith("x") && string.endsWith("x"))
		{
			System.out.print(string.substring(1, string.length()-1));
		}
		else
		{
			System.out.print(string);
		}
	}
	//Driver Function
	public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);
        
        // Input string
        String str = sc.nextLine();
        
        // function declaration
        remove(str);
       
        sc.close();
	}
}
