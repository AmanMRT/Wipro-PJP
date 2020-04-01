package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Map4
{
	 //create HashMap
	static HashMap<String, Integer> hm =  new HashMap<String, Integer>();
	
	
	//check key present in the hashMap
	public static String checkKey(String key)
	{
		Set set = hm.entrySet();
		Iterator itr = set.iterator();
		
		while(itr.hasNext())
		{
			Map.Entry<String, Integer> me = (Map.Entry<String, Integer>) itr.next();
			
			if (me.getKey().contains(key))
			{
				System.out.println(key + " exist in the contact list");
				break;
			}
		}
		return key;
		
	}
	
	// check Value present in the HashMap
	public static Integer checkValue(Integer Value)
	{
		Set set = hm.entrySet();
		Iterator itr = set.iterator();
		
		while(itr.hasNext())
		{
			Map.Entry<String, Integer> me = (Map.Entry<String, Integer>) itr.next();
			
			if (me.getValue().equals(Value))
			{
				System.out.println(Value + " exist in the comtact list");
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
			Map.Entry<String, Integer> me = (Map.Entry<String, Integer>) itr.next();		
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
			hm.put("ABC  ", 1234567890);
			hm.put("DEF  ", 1876543210);
			hm.put("GHI  ", 1561237890);
			hm.put("JKL  ", 1894561230);
			hm.put("MNO  ", 1216549870);
			hm.put("PQR  ", 1874561230);
			hm.put("STU  ", 1654789320);
			hm.put("VWX  ", 1356479230);
			hm.put("YZ  ",  1235498890);
			System.out.println();
			
			//display Elements of the HashMap
			System.out.println("Contact list are");
			System.out.println();
			System.out.println("Name   " + "   Numbers");
			Map4.display();
			
			System.out.println(); 	//newLine
			
			//dispaly if key present in the HashMap else print space
			System.out.println("Enter Name to check existance in contact list");
			String key = sc.nextLine();
			Map4.checkKey(key);
			
			System.out.println();		//newLine
			
			//dispaly if Value present in the HashMap else print space
			System.out.println("Enter number to check existance in contact list");
			Integer value = sc.nextInt();
			Map4.checkValue(value);
			
		}catch(Exception e)
		{
			System.out.println(e);
		}
		
		sc.close();
	}
}
