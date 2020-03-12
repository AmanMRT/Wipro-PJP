import java.util.Scanner;

public class StringPalindrome
{
	 static void checkPalindrome(StringBuffer str)
	{
		int i=0;
		int j=str.length() - 1;
		
		while(i < j)
		{
			if(str.charAt(i) == (str.charAt(j)) )
				{
				System.out.println("Is same");
				break;
				}
			
			else
				{
				System.out.println("Is not same");
				break;
				}				
		}
		
		// Increment begninning index
		i++;
		// Decrement last index 
		j--;
	}
	
	//Driver Function
	public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);
        
		StringBuffer sb = new StringBuffer();
		String strr = sc.nextLine();
		sb.append(strr);
		
		// Function to check palindrome
		checkPalindrome(sb);
		
		sc.close();
	}
	
}
