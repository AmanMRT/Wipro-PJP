//  Write a program to copy contents from one file to another and check the output.


import java.io.*;
import java.util.Scanner;

public class FileCopy 
{
	public static void main(String[] args) throws IOException
	{
		int ch;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the input file name");
		String infilename = sc.nextLine();
		
		System.out.println("Enter the output file name");
		String outfilename = sc.nextLine();
		
		
		// "E:\\Java\\JavaEcllipse\\IOStream\\src\\" this the my personal directory u can have different.
		File fin = new File("E:\\Java\\JavaEcllipse\\IOStream\\src\\" + infilename);
		File fout = new File("E:\\Java\\JavaEcllipse\\IOStream\\src\\" + outfilename);

		
		FileInputStream in = new FileInputStream(fin);
		FileOutputStream out = new FileOutputStream(fout);

		try
		{
			do
			{
				// read file character by character
				ch = in.read();
				if(ch != -1) 
				{
					// write output.txt file char by char
					out.write(ch);
				}
			}while(ch!= -1);
			System.out.println("'" +outfilename + "'updated successully");
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		// this block always executes
		finally
		{
			// close input file
			if(fin != null)
			{
				in.close();
			}
			// close output file
			if(fout != null)
			{
				out.close();
			}
		}		
		sc.close();
	}
}