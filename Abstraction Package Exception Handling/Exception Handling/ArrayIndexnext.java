// Write a program that takes as input the size of the array and the elements in the array.
// Index  starts from zero.
import java.util.Scanner;

public class ArrayIndexnext
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		// size of array
		System.out.print("Enter the number of elements in the array");
		int size = sc.nextInt();
		
		// array reference variable arr
		int[] arr = new int[size]; 
		
		// try block 
		try
		{
			System.out.println("Enter the elements in the array");
			for(int i=0;i<size;i++)
			{
				String num = sc.next();
				arr[i] = Integer.parseInt(num);
			} 
			// index of the element to find
			System.out.println("Enter the index of the array element you want to access");
			int index = sc.nextInt();
			System.out.println("The array element at index " + index + " = " + arr[index]);
			System.out.println("The array element successfully accessed");
			
		}// catch the exception 
		catch(  ArrayIndexOutOfBoundsException e)
		{
			// prints exception
			System.out.println(e);
		}
		sc.close();
		
	}		
}