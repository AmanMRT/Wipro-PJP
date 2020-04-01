package List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class Operations
{
	// declaration of ArrayList of string type
	ArrayList<String> list = new ArrayList<String>();
	
	// for insertion of respective element
	public void insert(String str)
	{
		list.add(str);
		System.out.println("Inserted Sucessfully.");
	}
	
	// for searching if element is present or not
	public void search(String str)
	{
		// contains examines entered element is present or not in the list 
		if(list.contains(str))
		{
			System.out.println("Item found in the list.");
		}
		else
		{
			System.out.println("Item not found in the list.");
			
		}
	}
	
	// for deletion of the respective item
	public void delete(String str)
	{
		// contains examines entered element is present or not in the list 
		if(list.contains(str))
		{
			//remove will delete the item in the list
			list.remove(str);
			System.out.println("Item deleted from the list.");
		}
		else
		{
			System.out.println("Item doesnot exist in the list.");
		}
	}
	
	// for displaying elements int the list
	public void display()
	{
		Iterator<String> it = list.iterator();
        while (it.hasNext())
        {
        	System.out.println(it.next());
        }
	}
}

//Driver class
public class StringOperations 
{
	public static void main(String[] args) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		
		// refrence variable op for class operations
		Operations op = new Operations();
		
		//Member variable
		int ch;
		try
		{
			do 
	        {
	    		System.out.println();
	            System.out.println("MAIN MENU");
	        	System.out.println("=========");
	        	System.out.println("1. Insert");
	        	System.out.println("2. Search");
	        	System.out.println("3. Delete");
	        	System.out.println("4. Display");
	        	System.out.println("5. Exit");
	        	System.out.print("Enter Your Choice... (1...5) :");
	   
				ch = sc.hasNextInt() ? sc.nextInt() : 5;

	        	switch(ch)
	        	{
	        		//for insertion
	        		case 1:
		        	{
		        		System.out.println("Enter the item to insert :");
		        		sc.nextLine();
		        		String item = sc.nextLine();
		        		op.insert(item);
		        		break;
		        	}
		        	
		        	// for searching
	        		case 2:
		        	{
		        		System.out.println("Enter the item to search :");
		        		sc.nextLine();
		        		String item = sc.nextLine();
		        		op.search(item);
		        		break;
		        	}
		        	
		        	// for deletion
	        		case 3:
	        		{
	        			System.out.println("Enter the item to delete :");
	        			sc.nextLine();
		        		String item = sc.nextLine();
		        		op.delete(item);
	        			break;
	        		}
	        		
	        		// for displaying 
	        		case 4:
		        	{
		        		op.display();
		        		break;
		        	}
		        	
		        	// to exit out the system
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