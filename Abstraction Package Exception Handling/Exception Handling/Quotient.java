import java.util.Scanner;

// Write a program that accepts 2 integers a and b as input and finds the quotient of a/b.
public class Quotient 
{
	// throws keyword implementation
	public static void main(String[] args) throws ArithmeticException
	{
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		//try block
		 try
		 {
			 double div = num1/ num2;
			 System.out.println(div);
			 
		 }catch(ArithmeticException e)
		 {
			 //print exception
			 System.out.println(e + " caught"); 
		 }finally
		 {
			 System.out.println("Inside finally block"); 
		 }
		 sc.close();
	}
}
