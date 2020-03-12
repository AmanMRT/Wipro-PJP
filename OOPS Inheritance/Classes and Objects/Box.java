//Create a class Box that uses a parameterized constructor to initialize the dimensions of a box.
import java.util.Scanner;

class BoxDimensions 
{
	//constructor with name setDimensions is declared
	public static void setDimensions(double length, double height,double depth)
	{	
		if((length <= 0) || (height <= 0) || (depth <= 0))
			{
				System.out.println("Volume can't be zero or negative");
			}
		else
			{
				double Volume = length * height * depth;
				System.out.println(Volume);
			}
	}
}

// main class
public class Box
{
	//Driver Function
	public static void main(String[] args)
	{
        Scanner sc=new Scanner(System.in);
        int len=sc.nextInt();
        int hei=sc.nextInt();
        int dep=sc.nextInt();
       
		//  Initialization
		BoxDimensions.setDimensions(len, hei, dep);
		
		sc.close();
	}
}
