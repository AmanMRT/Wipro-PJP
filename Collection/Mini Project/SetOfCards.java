import java.util.HashSet;
import java.util.Scanner;

class Cards
{
	// Member variable
	private  char symbol;
	private  int number;
	
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
	
	public boolean equals(Object obj)
	{
        if (obj instanceof Cards) 
        {
            Cards card = (Cards) obj;
            return (card.symbol == this.symbol);
        } 
        else 
        {
            return false;
        }
	}
	
	public int compareTo(Cards card) 
	{
        if (this.symbol < card.symbol) 
        	return -1;
        else if (this.symbol > card.symbol) 
        	return 1;
        else 
        	return 1;
    }

    public int hashCode() 
    {
        return String.valueOf(symbol).hashCode();
    }
    
}
//Driver class
public class SetOfCards 
{
	//Driver function
		public static void main(String[] args) throws Exception
		{
			// sc and strlist will create reference respectively 
			Scanner sc = new Scanner(System.in);
			
			// declaration of HashSet of string type
			// hs here is HashSet refrence variable
			HashSet<Cards> hs = new HashSet<Cards>();
			
			for(int i = 0; i < 8; i++)
			{
				// will create object of card type 
				Cards card = new Cards();
				
				System.out.println("Enter a card:");
	            card.setSymbol(sc.next().charAt(0));
	            System.out.println("Enter a card Symbol:");
	            card.setNumber(sc.nextInt());
	            sc.nextLine();
	            
	            //add directly to the list
	            hs.add(card);
	        }
	        System.out.println("Four symbols gathered in 8 cards.");
	        System.out.println("Cards in Set are:");


	        for (Cards c1 : hs)
	            System.out.println((char)c1.getSymbol() + " " + c1.getNumber());

	        sc.close();
			
			
		}
		
}
