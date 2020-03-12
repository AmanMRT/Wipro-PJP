// Create an abstract class Compartment to represent a rail coach. 
// Provide an abstract function notice in this class. 

// Abstract class
// Parent class
abstract class Instrument
{
	public abstract String play();
}

// Dervied class 
class Piano extends Instrument
{
	// Method overriding
	public String play() 
	{
		return "Piano is playing  tan tan tan tan. ";
	}
}

// Dervied class
class Flute extends Instrument
{
	// Method overriding
	public String play() 
	{
		return "Flute is playing  toot toot toot toot. ";
	}
}

class Guitar extends Instrument
{
	// Method overriding
	public String play() 
	{
		return "Guitar is playing  tin  tin  tin.";
	}
}


// Driver class
public class PlayInstrument 
{
	// Driver Function
	public static void main(String[] args) 
	{
		// Following will create object with reference variables fc, lad, gen, lug
			Piano p = new Piano();
			Flute f = new Flute();
			Guitar g = new Guitar();
			
			// following will print the overridden method notice
			System.out.println(p.play());
			System.out.println(f.play());
			System.out.println(g.play());

		}
}
