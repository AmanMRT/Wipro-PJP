package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Map2 
{
	 //create HashMap
	static HashMap<String, String> hm =  new HashMap<String, String>();
	
	//check key present in the hashMap
	public static String checkKey(String key)
	{
		Set set = hm.entrySet();
		Iterator itr = set.iterator();
		
		while(itr.hasNext())
		{
			Map.Entry<String, String> me = (Map.Entry<String, String>) itr.next();
			
			if (me.getKey().contains(key))
			{
				System.out.println(key + " exist in the Map");
				break;
			}
		}
		return key;
		
	}
	
	// check Value present in the HashMap
	public static String checkValue(String Value)
	{
		Set set = hm.entrySet();
		Iterator itr = set.iterator();
		
		while(itr.hasNext())
		{
			Map.Entry<String, String> me = (Map.Entry<String, String>) itr.next();
			
			if (me.getValue().contains(Value))
			{
				System.out.println(Value + " exist in the Map");
				break;
			}			
		}
		return Value;
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
	//Driver function
	public static void main(String[] args) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		
		try
		{
			// add values to the HashMap
			hm.put("ABC  ","  abc");
			hm.put("DEF  ","  def");
			hm.put("GHI  ","  ghi");
			hm.put("JKL  ","  jkl");
			hm.put("MNO  ","  mno");
			hm.put("PQR  ","  pqr");
			hm.put("STU  ","  stu");
			hm.put("VWX  ","  vwx");
			hm.put("YZ  ","  yz");
			System.out.println();
			
			//display Elements of the HashMap
			System.out.println("Elements of the Map are");
			System.out.println();
			System.out.println("Key   " + "   Value");
			Map2.display();
			
			System.out.println();
			
			//dispaly if key present in the HashMAp else print space
			System.out.println("Enter key to check existance");
			String key = sc.nextLine();
			Map2.checkKey(key);
			
			System.out.println();
			
			//dispaly if Value present in the HashMAp else print space
			System.out.println("Enter Value to check existance");
			String value = sc.nextLine();
			Map2.checkValue(value);
			
		}catch(Exception e)
		{
			System.out.println(e);
		}
		
		sc.close();
	}
}
