package List;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListNumeric 
{
	public static void printAll(ArrayList<Number> al)
	{
		Iterator<Number> itr = al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
	public static void main(String args[]) 
	{
	      // create an array list
	      ArrayList<Number> al = new ArrayList<Number>();
	      al.add(10);		//integer
	      al.add(20.1);		//float
	      al.add(30.01);
	      al.add(40.4f); 	//float
	      al.add(50.0);		//double
	      al.add(60);
	      al.add(70f);		//float
	      al.add(80d);		//double
	      al.add(90); 	
	      al.add(100);		//integer
	   
	      System.out.println("Numeric numbers only");
	      System.out.println();
	      printAll(al);
	      
	}
}
