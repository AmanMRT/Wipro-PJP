//  Write a program to count the number of times a character appears in a File. 

import java.io.*;
import java.util.Scanner;

public class CharCount 
{
	public static void main(String[] args) throws IOException
	{
		int ch, count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the file name");
		String fname = sc.nextLine();
		System.out.println("Enter the character to be counted");
		char c = sc.nextLine().charAt(0);
		
		// "E:\\Java\\JavaEcllipse\\IOStream\\src\\" this the my personal directory u can have different.
		File f = new File("E:\\Java\\JavaEcllipse\\IOStream\\src\\" + fname);
		
		FileReader in = new FileReader(f);
		
		try
		{
			do
			{
				// read file character by character
				ch = in.read();
				
				// small or captial letter
				if (ch >= 65 && ch <= 90) 
				{
					ch += 32;
				}
				
				// searched char small or capital
				if (c >= 65 && c <= 90) 
				{
					c += 32;
				}
				
				// check if they are same
				if(ch == c)
				{
					count++;	// increment in counter value
				}
			
			}while(ch!= -1);
			
			System.out.println("File"  + " has " + count + " instances of letter '" + c + "'.");
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		finally
		{
			// close input file
			if(in != null)
			{
				in.close();
			}
		}		
		sc.close();
	}
}
