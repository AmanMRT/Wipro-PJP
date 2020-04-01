package Set;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Treeset2 
{

	 // declaration of TreeSet of string type
	// tree here is TreeSet refrence variable
	static TreeSet<String> tree = new TreeSet<String>();
	
	
	// for insertion of respective element
	public void saveCountry(String CountryName)
	{
		tree.add(CountryName);
		System.out.println(CountryName + " Inserted Sucessfully.");
	}
	
	// for searching if element is present or not
	public void getCountry(String CountryName)
	{
		// contains examines entered element is present or not in the list 
		if(tree.contains(CountryName))
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
		Iterator<String> itr = tree.iterator();
        while (itr.hasNext())
        {
        	System.out.println(itr.next());
        }
	}
	//Driver function
	public static void main(String[] args) throws Exception
	{

		Treeset2 ts = new Treeset2();
		
		
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
		        		ts.saveCountry(item);
		        		break;
		        	}
		        	
		        	// for searching
	        		case 2:
		        	{
		        		System.out.println("Enter the item to search :");
		        		sc.nextLine();
		        		String item = sc.nextLine();
		        		ts.getCountry(item);
		        		break;
		        	}
				
	        		// for displaying 
	        		case 3:
		        	{
		        		ts.display();
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
