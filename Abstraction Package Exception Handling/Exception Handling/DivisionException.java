// 	Write a Program with a division method which receives two integer numbers and performs the division operation.
import java.util.Scanner;

public class DivisionException 
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
			 System.out.println(e); 
		 }
		sc.close();
	}

}
