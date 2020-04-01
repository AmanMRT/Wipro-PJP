package Map;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

//Driver Class
public class Map3 
{
	//Driver Function
	public static void main(String[] args) 
	{
		Properties pro = new Properties();
		
		pro.setProperty("Uttar Pradesh ", " Lucknow");
		pro.setProperty("Punjab ", " Amritsar");
		pro.setProperty("Jammu & Kashmir ", " Srinagar");
		pro.setProperty("Leh ", " Ladakh");
		pro.setProperty("Bihar ", " Patna");

		Set set = pro.entrySet();
		Iterator itr = set.iterator();
		
		while (itr.hasNext()) 
		{
			Map.Entry<String, String> me = (Map.Entry<String, String>) itr.next();	
			System.out.println(me);
		}
	}
}
 