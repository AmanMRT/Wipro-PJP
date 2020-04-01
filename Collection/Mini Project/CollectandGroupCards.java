package Map;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

class Card 
{
    private char symbol;
    private int number;

    // Setter and Getter for Card Symbol
 	public void setSymbol(char Symbol) 
 	{
 		symbol = Symbol;
 	}
 	
 	public int getSymbol() 
 	{
 		return symbol;
 	}
 	
 	// Setter and Getter for Card number
 	public void setNumber(int Number) 
 	{
 		number = Number;
 	}
 	
 	public int getNumber() 
 	{
 		return number;
 	}
 	
    public String toString() 
    {
        return "Card [symbol=" + symbol + ", number=" + number + "]";
    }

    public int compareTo(Card o) 
    {
        if (this.symbol < o.symbol) 
        {
        	return -1;
       	}
        else if (this.symbol > o.symbol) 
       	{
        	return 1;
        }
        else return 1;
    }

}

public class CollectandGroupCards 
{
	public static void main(String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
	    TreeMap<Character, ArrayList<Card>> map = new TreeMap<>();
	
	    System.out.println("Enter Number of Cards :");
	    int n = sc.nextInt();
	    sc.nextLine();
	
	    for (int i = 1; i <= n; i++) 
	    {
	        System.out.println("Enter card " + i);
	        char symbol = sc.nextLine().charAt(0);
	        
	        System.out.println("Enter number ");
	        int number = sc.nextInt();
	
	        Card card = new Card();
	        card.setSymbol(symbol);
	        card.setNumber(number);
	        sc.nextLine();
	
	        if (map.containsKey(symbol)) 
	        {
	        	ArrayList<Card> list = map.get(symbol);
	            list.add(card);
	        }
	        else 
	        {
	        	ArrayList<Card> list = new ArrayList<>();
	            list.add(card);
	            map.put(symbol, list);
	        }
	     }
		    System.out.println("Distinct Symbols are :");
		
		    // trace out map and return key
		    Set set = map.entrySet();
		    Iterator it = set.iterator();
		    while (it.hasNext()) 
		    {
		    	Map.Entry<Character, ArrayList<Card>> me = (Entry<Character, ArrayList<Card>>) it.next();
		        System.out.print(me.getKey() + " ");
		    }
		    	System.out.println();
		    
		    // trace out map and return value
		    Set set1 = map.entrySet();
		    Iterator it1 = set1.iterator();
		    while (it1.hasNext()) 
		    {
		        int sum = 0;
		        Map.Entry<Character, ArrayList<Card>> me = (Entry<Character, ArrayList<Card>>) it1.next();
		        ArrayList<Card> list = me.getValue();
		
		        System.out.println("Cards in '" + me.getKey() + "' Symbol");
		        
		        //provide cards symbol and card number
		        for (Card card : list) 
		        {
		            System.out.println((char)card.getSymbol() + " " + card.getNumber());
		            sum += card.getNumber(); 		//return sum
		        }
		        
		        System.out.println("Number of cards : " + list.size());
		        System.out.println("Sum of Numbers : " + sum);
		        System.out.println();
			  }
		  sc.close(); 
	}
}
