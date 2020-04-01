package List;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListString 
{
	public static void printAll(ArrayList<String> al)
	{
		Iterator<String> itr = al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
	
	//Driver function
	public static void main(String args[]) 
	{
	      // create an array list
	      ArrayList<String> al = new ArrayList<String>();
	      
		   // add method is used to add elements into arraylist
		    al.add("ABC");
	        al.add("DEF");
			al.add("GHI");
			al.add("JKL");
			al.add("MNO");
			al.add("PQR");
			al.add("STU");
			al.add("VWX");
			al.add("YZ");
				
		System.out.println("English Alphabet's");
		System.out.println();
		printAll(al);
	      
	}
}
