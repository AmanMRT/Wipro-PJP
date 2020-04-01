package Set;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Treeset
{
	 // declaration of TreeSet of string type
	// tree here is TreeSet refrence variable
	static TreeSet<String> tree = new TreeSet<String>();
	
	// for insertion of respective element
	public void insert(String str)
	{
		tree.add(str);
		System.out.println(str + " Inserted Sucessfully.");
	}

	// for searching if element is present or not
	public void search(String str)
	{
		// contains examines entered element is present or not in the list 
		if(tree.contains(str))
		{
			System.out.println("Employee found in the set.");
		}
		else
		{
			System.out.println("Employee not found in the set.");
			
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
	
	// reverse the set content
	public void reverse()
	{
		/*NavigableSet<String> rev = tree.descendingSet();
		
		Iterator<String> itr = rev.iterator();
        while (itr.hasNext())
        {
        	System.out.println(itr.next());
        }*/
		Iterator<String> itrr= tree.descendingIterator();
		while (itrr.hasNext())
        {
        	System.out.println(itrr.next());
        }
	}
	
	//Driver function
	public static void main(String[] args) throws Exception
	{	
		Treeset ts = new Treeset();
		
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
	        	System.out.println("1. Add Employee");
	        	System.out.println("2. Search Employee");
	        	System.out.println("3. Display");
	        	System.out.println("4. Reverse");
	        	System.out.println("5. Exit");
	        	System.out.print("Enter Your Choice... (1...5) :");
	   
				ch = sc.hasNextInt() ? sc.nextInt() : 5;

	        	switch(ch)
	        	{
	        		//for insertion
	        		case 1:
		        	{
		        		System.out.println("Enter Employee name");
		        		sc.nextLine();
		        		String item = sc.nextLine();
		        		ts.insert(item);
		        		break;
		        	}
		        	
		        	// for searching
	        		case 2:
		        	{
		        		System.out.println("Enter the Employee name to search :");
		        		sc.nextLine();
		        		String item = sc.nextLine();
		        		ts.search(item);
		        		break;
		        	}
				
	        		// for displaying 
	        		case 3:
		        	{
		        		ts.display();
		        		break;
		        	}
		        	
		        	// to reverse the set details
	        		case 4:
		        	{
		        		ts.reverse();
		        		break;
		        	}
	        		case 5:
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
	        	
	        }while(ch!=5);	// terminating condition
		
		}
		catch(Exception e)
		{
			// will print the respective exception if caught
			System.out.println(e);
		}
		sc.close();
		
	}
}
