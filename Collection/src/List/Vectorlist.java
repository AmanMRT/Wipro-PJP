package List;

import java.util.Iterator;
import java.util.Vector;

public class Vectorlist 
{
	public static void printAll( Vector<String> al)
	{
		Iterator<String> itr = al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
		
	public static void main(String args[]) 
	{
	      // create a Vector list
	      Vector<String> ll = new Vector<String>();
	      
	      // add method is used to add elements into arraylist
	      	ll.add("January");
	      	ll.add("February");
	      	ll.add("March");
			ll.add("April");
			ll.add("May");
			ll.add("June");
			ll.add("July");
			ll.add("August");
			ll.add("September");
			ll.add("October");
			ll.add("November");
			ll.add("December");
			
		System.out.println("Vector List members");
	      System.out.println();
	      printAll(ll);	
	}
			
}

