import java.util.Scanner;

//  Given 2 strings, a and b, return a new string of the form short+long+short, 
// with the shorter string on the outside and the longer string on the inside.

public class LongShort
{
	static void concatOrder(String string1, String string2)
	{
		int len1 = string1.length();
		int len2 = string2.length();

		if(len1 > len2 )
		{
			System.out.print(string2 + string1 + string2);
		}
		else if (len1 == len2)
		{
			System.out.print("Both String's have same length");
		}
		else
		{
			System.out.print(string1 + string2 + string1);
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
        concatOrder(str1, str2);
       
        sc.close();
	}
}
