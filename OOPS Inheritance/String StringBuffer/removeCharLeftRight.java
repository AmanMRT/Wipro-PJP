//  Write a Java program that accepts a string (with * in it).
import java.util.Scanner;

public class removeCharLeftRight 
{
	static void removeChar(String string)
	{
		int j=0;	//Member Variable
		
		for(int i=0; i<string.length(); i++)
		{
			j= string.indexOf("*");
		}
		
		// print the output result
		System.out.print(string.substring(0, j-1) + string.substring(j+2, string.length()));
	}
	//Driver Function
	public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);
        
        // Input string
        String str = sc.nextLine();
        
        // function declaration
        removeChar(str);
       
        sc.close();
	}
}
