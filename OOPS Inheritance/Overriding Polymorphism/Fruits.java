// Create  a base class Fruit with name ,taste and size as its attributes. 


class Fruit
{
	String name;
	String taste;
	int size;
	
	public void eat() 
	{
		System.out.println("Fruit is sweet/sour in taste.");	
	}
}
class Apple extends Fruit
{
	//Overidden method eat()
	public void eat()
	{
		System.out.println("Apple is sweet in taste.");
	}
}

class Orange extends Fruit
{
	//Overidden method eat()
	public void eat()
	{
		System.out.println("Orange is sour in taste.");
	}
}
public class Fruits
{
	//Driver Function
	public static void main(String[] args)
	{
        // Following statement would create an objects like f(fruit), a(apple), o(Orange)
		Fruit f = new Fruit();
		Apple a = new Apple();
		Orange o = new Orange();
		
		//Overridden methods are called with each refrence variables respectively
		f.eat();
		System.out.println();
		
		a.eat();
		System.out.println();
		
		o.eat();
	}   
}
