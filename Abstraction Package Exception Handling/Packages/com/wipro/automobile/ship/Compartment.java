package com.wipro.automobile.ship;

class Compartmentnew 
{
	protected int height;
	protected int width;
	protected int breadth;
}

//Dervied class 
class FirstClass extends Compartmentnew
{
	// Method overriding
	public void notice() 
	{
		height = 10;
		width = 10;
		breadth = 10;
	}
}

//Dervied class
class Ladies extends Compartmentnew
{
	// Method overriding
	public void notice() 
	{
		height = 20;
		width = 20;
		breadth = 20;
	}
}

class General extends Compartmentnew
{
	// Method overriding
	public void notice() 
	{
		height = 30;
		width = 30;
		breadth = 30;
	}
}

//Dervied class
class Luggage extends Compartmentnew
{
	// Method overriding
	public void notice() 
	{
		height = 40;
		width = 40;
		breadth = 40;
	}
}

public class Compartment
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
				System.out.println("First Class Coach Dimensions");			
				System.out.println(fc.height);
				System.out.println(fc.width);
				System.out.println(fc.breadth);
				
				System.out.println();

				System.out.println("Ladies Coach Dimensions");			
				System.out.println(lad.height);
				System.out.println(lad.width);
				System.out.println(lad.breadth);
				
				System.out.println();

				System.out.println("General Coach Dimensions");			
				System.out.println(gen.height);
				System.out.println(gen.width);
				System.out.println(gen.breadth);
				
				System.out.println();
				
				System.out.println("Luggage Coach Dimensions");			
				System.out.println(lug.height);
				System.out.println(lug.width);
				System.out.println(lug.breadth);
							
				
			}

	
}
