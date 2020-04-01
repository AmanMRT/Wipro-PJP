import java.util.ArrayList;
import java.util.Scanner;

public class StringWithArrayList 
{
	public void operations(String str1, String str2)
	{
		 // declaration of ArrayList of string type
		 ArrayList<String> list = new ArrayList<String>();
		// declaration of StringBuilder 
		 StringBuilder sb = new StringBuilder();
		 
		//character in each alternate position in str1 to be replaced by str2
		for(int i = 1; i < str1.length(); i+=2)
		{
			sb.append(str2);
			sb.append(str1.charAt(i));
		}
		list.add(sb.toString());
		
		//str2 occur more than once in str1, then replace last occurance of str2 in str1 with reverse of str2
		int count = str1.split(str2, -1).length -1;
		 StringBuilder sbb = new StringBuilder(str2).reverse();
		 
		if(count > 1)
		{
			list.add(str1.substring(0, str1.lastIndexOf(str2)) + sbb);
		}
		else
		{
			list.add(str1 + str2);
		}
		
		//str2 occur more than once in str1, then delete first occurance of str2 in str1 
		if(count > 1)
		{
			list.add(str1.substring(0, str1.indexOf(str2)) + str1.substring(str1.indexOf(str2) + str2.length(), str1.length()));
		}
		else
		{
			list.add(str1);
		}
		
		//Divide str2 into halfs and add first half to the begining of str1 and second half to end of str1
		int length;
		if(str2.length()/2 == 0)
		{
			length = str2.length()/2;
		}
		else
		{
			length = (str2.length() + 1 )/2;
		}
		
		list.add(str2.substring(0, length) + str1 + str2.substring(length, str2.length()));
		
		//str1 contains characters of str2 replace all characters to *
		sb = new StringBuilder();
		 for (int i = 0; i < str1.length(); i++) 
		 {
            if (str2.indexOf(str1.charAt(i)) != -1)
                sb.append('*');
            else
                sb.append(str1.charAt(i));
	     }
	        list.add(sb.toString());
	        
	        System.out.println(list);
	}
	
	//Driver function
	public static void main(String[] args) throws Exception
	{
		// sc and strlist will create reference respectively 
		Scanner sc = new Scanner(System.in);
		StringWithArrayList strlist = new StringWithArrayList();
		
		try
		{
		System.out.println("Enter String 1");
		String str1 = sc.nextLine();
		System.out.println("Enter String 2");
		String str2 = sc.nextLine();
		
		//Method invoked
		strlist.operations(str1, str2);
		}
		catch(Exception e)
		{
			System.out.print(e);
		}
		sc.close();
	}
}
