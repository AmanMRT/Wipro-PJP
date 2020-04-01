package Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class HashhSet 
{
	// declaration of HashSet of string type
	// h1 here is HashSet refrence variable
	HashSet<String> h1 = new HashSet<String>();
	
	// for insertion of respective element
	public void saveCountry(String CountryName)
	{
		h1.add(CountryName);
		System.out.println(CountryName + " Inserted Sucessfully.");
	}
	
	// for searching if element is present or not
	public void getCountry(String CountryName)
	{
		// contains examines entered element is present or not in the list 
		if(h1.contains(CountryName))
		{	
			System.out.println(CountryName + " exist in the set.");
		}
		else
		{
			System.out.println("null");
		}
	}
	
	// for displaying elements int the list
	public void display()
	{
		Iterator<String> itr = h1.iterator();
        while (itr.hasNext())
        {
        	System.out.println(itr.next());
        }
	}
	//Driver function
	public static void main(String[] args) throws Exception
	{
		// hs is the refrence variable for class HashhSet
		HashhSet hs = new HashhSet();
		
		Scanner sc = new Scanner(System.in);
		//Member variable
		int ch;
		try
		{
			do 
	        {
	    		System.out.println();
	            System.out.println("MAIN MENU");
	        	System.out.println("=========");
	        	System.out.println("1. Add Country");
	        	System.out.println("2. Search Country");
	        	System.out.println("3. Display");
	        	System.out.println("4. Exit");
	        	System.out.print("Enter Your Choice... (1...4) :");
	   
				ch = sc.hasNextInt() ? sc.nextInt() : 4;

	        	switch(ch)
	        	{
	        		//for insertion
	        		case 1:
		        	{
		        		System.out.println("Enter Country name");
		        		sc.nextLine();
		        		String item = sc.nextLine();
		        		hs.saveCountry(item);
		        		break;
		        	}
		        	
		        	// for searching
	        		case 2:
		        	{
		        		System.out.println("Enter the item to search :");
		        		sc.nextLine();
		        		String item = sc.nextLine();
		        		hs.getCountry(item);
		        		break;
		        	}
				
	        		// for displaying 
	        		case 3:
		        	{
		        		hs.display();
		        		break;
		        	}
		        	
		        	// to exit out the system
	        		case 4:
		        	{
		        		System.exit(0);
		        		break;
		        	}
		        	// other input then defined case
	        		default:
		        	{
		        		System.out.println("Invalid Entry.");
		        		break;
		        	}
	        	}
	        	
	        }while(ch!=4);	// terminating condition
		
		}
		catch(Exception e)
		{
			// will print the respective exception if caught
			System.out.println(e);
		}
		sc.close();
		
	}
}
