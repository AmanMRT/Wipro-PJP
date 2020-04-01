import java.util.Scanner;
import java.util.TreeSet;

class Dimensions
{
	// Member variables
	private double length;
	private double width;
	private double height;
	private double volume;
	
	// Setter and Getter for Box length
	public void setLength(double len) 
	{
		length = len;
	}
	
	public double getLength() 
	{
		return length;
	}
		
	// Setter and Getter for Box Width
	public void setWidth(double wid) 
	{
		width = wid;
	}
	
	public double getWidth() 
	{
		return width;
	}
	
	// Setter and Getter for Box Height
	public void setHeight(double hei) 
	{
		height = hei;
	}
	
	public double getHeight() 
	{
		return height;
	}
	// functiont of calculate volume
	public double calVolume()
	{
		volume = length * width * height;
		return volume;
	}
	
}

public class SetOfBoxes 
{
	//Driver function
	public static void main(String[] args) throws Exception
	{
		// sc and strlist will create reference respectively 
		Scanner sc = new Scanner(System.in);
		
		// declaration of TreeSet 
		// tree here is HashSet refrence variable
		TreeSet<Double> tree = new TreeSet<Double>();
		
		System.out.println("Enter number of boxes");
		int size = sc.nextInt();
		
		for(int i = 0; i < size; i++)
		{
			// will create object of dim type 
			Dimensions dim = new Dimensions();
			System.out.println("Enter the Box " + i+1 + " details");
			 
			System.out.println("Enter Length");
            dim.setLength(sc.nextDouble());
            System.out.println("Enter Width");
            dim.setWidth(sc.nextDouble());
            System.out.println("Enter Height");
            dim.setHeight(sc.nextDouble());
           
            // object add to the tree set
            tree.add(dim.calVolume());
        }
		System.out.println("Unique boxes in the set are");
		  System.out.print(tree);
		  sc.close();
		 
	}
}
