import java.util.Scanner;

// Write a java program that will concatenate 2 strings and return the result.
// The result should be in lowercase.

public class StringConcat 
{
	 static void concat(String string1, String string2)
	{
        String string3 = "";

		 // To Lower case
		string1 = string1.toLowerCase();
		string2 = string2.toLowerCase();
        
        // replace double char
        if(string1.charAt(string1.length()-1) == string2.charAt(0))
        {
        	// if same then replace that char
        	string3 = string2.substring(1);
    		
            //concatinate two strings
    		System.out.println(string1.concat(string3));
        }
        else
        {
            //concatinate two strings
    		System.out.println(string1.concat(string2));
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
        concat(str1, str2);
       
        sc.close();
	}
}
