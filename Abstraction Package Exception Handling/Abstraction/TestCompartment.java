// Create an abstract class Compartment to represent a rail coach. 
// Provide an abstract function notice in this class. 

// Abstract class
// Parent class
abstract class Compartment
{
	public abstract String notice();
}

// Dervied class 
class FirstClass extends Compartment
{
	// Method overriding
	public String notice() 
	{
		return "First Class Coach";
	}
}

// Dervied class
class Ladies extends Compartment
{
	// Method overriding
	public String notice() 
	{
		return "Ladies Coach";
	}
}

class General extends Compartment
{
	// Method overriding
	public String notice() 
	{
		return "General Coach";
	}
}

//Dervied class
class Luggage extends Compartment
{
	// Method overriding
	public String notice() 
	{
		return "Luggage Coach";
	}
}

// Driver class
public class TestCompartment 
{
	// Driver Function
	public static void main(String[] args) 
	{
		// Following will create object with reference variables fc, lad, gen, lug
			FirstClass fc = new FirstClass();
			Ladies lad = new Ladies();
			General gen = new General();
			Luggage lug = new Luggage();
			
			// following will print the overridden method notice
			System.out.println(fc.notice());
			System.out.println(lad.notice());
			System.out.println(gen.notice());
			System.out.println(lug.notice());

		}
}
