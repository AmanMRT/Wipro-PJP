// check XY in string and collect adjacent characters 
import java.util.Scanner;

public class checkXY
{
	static void removeChar(String string1, String string2)
	{
		int j=0;	//Member Variable
		
		String str3="";
		for(int i=0; i<string1.length(); i++)
		{
			while((j = string1.indexOf(string2, 0))!= -1)
			{
				str3 = string1.charAt(j-1) + string1.charAt(j+2) + "";
				j++;
			}
			
			System.out.print(str3);
		}
		// print the output result
	}
	
	//Driver Function
	public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);
        
        // Input string
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        // function declaration
        removeChar(str1, str2);
       
        sc.close();
	}
}
