// Write a java program that accepts a string and
// returns a new string without the first and last character of the input string.
import java.util.Scanner;

public class FirstLast
{
	 static void removeFirstLast(String string)
	 {
		System.out.print(string.substring(1, string.length()-1));
	 }
	 
	//Driver Function
	public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);
        
        // Input string
        String str = sc.nextLine();
        
        // function declaration
        removeFirstLast(str);
       
        sc.close();
	}
}
