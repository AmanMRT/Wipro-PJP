// Create a new class called Calculator with the following methods: 
import java.util.Scanner;

class Operation
{
	// constructor for integer number operations
	public static void powerInt( int number1, int number2)
	{
		if((number1 <=0) || (number2 <=0))
		{
			System.out.println("Operation can't be performed.");
		}
		else
		{
			number1=(int) Math.pow(number1, number2);
		}
		System.out.println(number1);
	}
	
	//constructor for double number operations
	public static void powerDouble( double number1, double number2)
	{
		if((number1 <=0) || (number2 <=0))
		{
			System.out.println("Operation can't be performed.");
		}
		else
		{
			number1= Math.pow(number1, number2);
		}
		System.out.println(number1);
	}
}

public class Calculator
{
	//Driver Function
	public static void main(String[] args)
	{
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
       
		//  Initialization
		Operation.powerInt(num1, num2);
		Operation.powerDouble(num1, num2);
		
		sc.close();
	}

}
