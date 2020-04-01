package Set;

import java.util.HashSet;
import java.util.Iterator;

public class HashhSet2 
{
	//Driver function
	public static void main(String[] args) throws Exception
	{
		// declaration of HashSet of string type
		// hl here is HashSet refrence variable
		HashSet<String> hl = new HashSet<String>();
		
		hl.add("ABC");
		hl.add("DEF");
		hl.add("GHI");
		hl.add("JKL");
		hl.add("MNO");
		hl.add("PQR");
		hl.add("STU");
		hl.add("VWX");
		hl.add("YZ");
		
		Iterator<String> itr = hl.iterator();
        while (itr.hasNext())
        {
        	System.out.println(itr.next());
        }
	}
}
