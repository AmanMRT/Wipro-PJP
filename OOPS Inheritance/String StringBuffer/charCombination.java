// Given two strings, a and b, print a new string which is made of the following combination-
// first character of a, the first character of b, second character of a, second character of b and so on. 

import java.util.Scanner;

public class charCombination
{
	static void combine(String string1, String string2)
	{
		int len1 = string1.length();
		int len2 = string2.length();
		
		int i=0, j=0;
		
		// concatinate till condition lasts
		while(i < len1 && j< len2)
		{
			System.out.print(string1.substring(i,i+1) + string2.substring(j,j+1));
			i++;
			j++;					
		}
		
		// add remaining characters of string1
		while(i < len1)
		{
			System.out.print(string1.substring(i,i+1));
			i++;
		}
		
		// add remaining characters of string2
		while(j < len2)
		{
			System.out.print(string2.substring(j,j+1));
			j++;
		}
	}
	
	//Driver Function
	public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);
        
        // Input string
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
                
        // function declaration
        combine(str1, str2);
       
        sc.close();
	}
}
