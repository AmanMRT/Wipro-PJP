// Write a Java program that reads an integer number (between 1 and 255) 
// from the user and prints the binary representation of the number
import java.util.Scanner;

public class BinaryRepresentation 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter integer in range between (1 -255).");
		int num = sc.nextInt();		//integer input
		
		int number=Integer.parseInt(Integer.toBinaryString(num));	
		
		//formatted output
		System.out.println(String.format("%08d", number));
	}
}
