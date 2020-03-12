// Write a program to create a class named shape.

class Shape
{
	public void draw()
	{
		System.out.println("Drawing Shape");
	}
	
	public void erase()
	{
		System.out.println("Erasing Shape");
	}
}

class Circle extends Shape
{
	//Overidden method draw()
	public void draw()
	{
		System.out.println("Drawing Circle");
	}
	
	//Overidden method erase()
	public void erase()
	{
		System.out.println("Erasing Circle");
	}
}

class Triangle extends Shape
{
	//Overidden method draw()
	public void draw()
	{
		System.out.println("Drawing Triangle");
	}

	//Overidden method erase()
	public void erase()
	{
		System.out.println("Erasing Triangle");
	}
}

class Square extends Shape
{
	//Overidden method draw()
	public void draw()
	{
		System.out.println("Drawing Square");
	}
	
	//Overidden method erase()
	public void erase()
	{
		System.out.println("Erasing Square");
	}
}

public class Draw 
{
	//Driver Function
	public static void main(String[] args)
	{
        // Following statement would create an objects like c(circle), t(triangle), s(square).
		Shape c=new Circle();
		Shape t=new Triangle();
		Shape s=new Square();
		
		// Overridden methods are called with each refrence variables respectively
		// Circle functions
		c.draw();
		c.erase();
		System.out.println();
		
		// Triangle functions
		t.draw();
		t.erase();
		System.out.println();
		
		// Square functions
		s.draw();
		s.erase();
		System.out.println();
	}
}
