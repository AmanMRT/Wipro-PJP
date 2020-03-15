// Write a program to receive an integer number as a command line argument,
// and print the binary, octal and hexadecimal equivalent of the given number.

public class tobinaryOctalHexadecimal 
{
	public static void main(String[] args)
	{
		// convert String to integer 
		int num = Integer.parseInt(args[0]);
		
		// convert integer to binary string
		System.out.println("Binary equivalent :" + Integer.toBinaryString(num));
		
		// convert integer to Octal string
		System.out.println("Octal equivalent :" + Integer.toOctalString(num));
		
		// convert integer to Hexadecimal string
		System.out.println("Hexadecimal equivalent :" +Integer.toHexString(num));
	}
}
