package Map;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.Map;
import java.util.Map.Entry;

public class Map6 
{
	//create HashMap
	static Hashtable<String, String> hm =  new Hashtable<String, String>();
	
	// add country and capital to the HashMap
	public static void saveCountryCapital(String CountryName, String capital)
	{
		hm.put(CountryName, capital);
	}

	// display all nodes form HashMap
	public static void display()
	{
		Set set = hm.entrySet();
		Iterator itr = set.iterator();
		
		while(itr.hasNext())
		{
			Map.Entry<String, String> me = (Map.Entry<String, String>) itr.next();		
			System.out.println(me.getKey() + "\t" + me.getValue());
		}
	}
	
	// return CountryName for respective Capital
	// In HashMap by key we can search its value
	public static void getCapital(String CountryName)
	{
		System.out.println(hm.get(CountryName));
	}
	
	// return CapitalName for respective Country
	// In HashMap we can't search with value to get key 
	public static void getCountry(String Captial)
	{
		Set set = hm.entrySet();
		Iterator itr = set.iterator();
		
		while(itr.hasNext())
		{
			Map.Entry<String, String> me = (Map.Entry<String, String>) itr.next();
			
			if (me.getValue().equals(Captial))
			{
				System.out.println(me.getKey());
			}
		}
	}
	
	// Swap the values by keys annd keys by value
	public static void swap()
	{
		Hashtable<String, String> hm2 =  new Hashtable<String, String>();
		
		Set set = hm.entrySet();
		Iterator itr = set.iterator();
		
		while(itr.hasNext())
		{
			Map.Entry<String, String> me = (Map.Entry<String, String>) itr.next();
			
			System.out.println(me.getValue() + "\t" + me.getKey());
		}
	}
	
	//convert HashMap to arrayList
	public static void toArrayList()
	{
		//arrayList Object 
		ArrayList<String> list = new ArrayList<>();
		ArrayList<String> list1 = new ArrayList<>();

		Set set = hm.entrySet();
		Iterator itr = set.iterator();
		
		while(itr.hasNext())
		{
			Map.Entry<String, String> me = (Map.Entry<String, String>) itr.next();
			list.add(me.getKey());
			list1.add(me.getValue());
		}
		System.out.println(list);
		System.out.println(list1);
	}
	
	
	//Driver function
	public static void main(String[] args) throws Exception
	{
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
	        	System.out.println("1. Add Country and Capital");
	        	System.out.println("2. Display Country and Capital");
	        	System.out.println("3. Get Capital of Country");
	        	System.out.println("4. Get Country of Capital");
	        	System.out.println("5. Swap Country to Capital and vice versa");
	        	System.out.println("6. Conversion to ArrayList");	
	        	System.out.println("7. Exit");
	        	System.out.print("Enter Your Choice... (1...7) :");
	     	   
				ch = sc.hasNextInt() ? sc.nextInt() : 7;

	        	switch(ch)
	        	{
	        		//for insertion
	        		case 1:
		        	{
		        		System.out.println("Enter Country name");
		        		sc.nextLine();
		        		String country = sc.nextLine();
		        		System.out.println("Enter Capital name");
		        		String capital = sc.nextLine();
		        		Map1.saveCountryCapital(country, capital);
		        		break;
		        	}
		        	
	        		case 2:
	        		{
	        			System.out.println("Country"+" \t " + "Capital");
	        			Map1.display();
	        			break;
	        		}
	        		
	        		case 3:
	        		{
	        			System.out.println("Enter Country name");
		        		sc.nextLine();
		        		String country = sc.nextLine();
		        		Map1.getCapital(country);
		        		break;
	        		}
	        		
	        		case 4:
	        		{
	        			System.out.println("Enter Capital name");
	        			sc.nextLine();
		        		String capital = sc.nextLine();
		        		Map1.getCountry(capital);
		        		break;
	        		}
	        		
	        		case 5:
	        		{
	        			Map1.swap();
	        			break;
	        		}
	        		case 6:
	        		{
	        			Map1.toArrayList();
						break;
	        		}
	        		case 7:
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
	        }while(ch!=7);
	    }
		catch(Exception e)
		{
			// will print the respective exception if caught
			System.out.println(e);
		}
		sc.close();
	}
}
