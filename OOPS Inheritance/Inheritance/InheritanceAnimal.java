// Create a class named ‘Animal’ which includes methods like eat() and sleep().

class Animal
{
	public void eat()
	{
		System.out.println("Animal eats food.");

	}
	
	public void sleep()
	{
		System.out.println("Animal Sleeps.");
	}
}

class Bird extends Animal
{
	//extends is used for implementing inheritance
	public void eat()
	{
		System.out.println("Birds eats snakes.");
	}
	
	public void sleep()
	{
		System.out.println("Birds sleeps on tree.");
	}
	
	public void fly()
	{
		System.out.println("Birds fly.");
	}
}
public class InheritanceAnimal
{
	//Driver Function
	public static void main(String[] args)
	{
		// Child class constructor
		Bird bird= new Bird();
		
		// Parent class constructor
		Animal animal= new Animal();
		
		// Parent class method
		animal.eat();
		animal.sleep();
		
		// Child class method
		bird.eat();
		bird.sleep();
		bird.fly();
	}
}
